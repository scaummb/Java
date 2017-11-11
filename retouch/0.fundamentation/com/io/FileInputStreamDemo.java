package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// 创建字节输入流对象
		FileInputStream fis = new FileInputStream("E:\\file\\aa.txt");
		
		// 调用方法，读取数据
		// 第一次读取
		 int by = fis.read();
		 System.out.println(by);
		 System.out.println((char) by);
		// // 第二次读取
		 by = fis.read();
		 System.out.println(by);
		 System.out.println((char) by);
		 // 第三次读取
		 by = fis.read();
		 System.out.println(by);
		 System.out.println((char) by);
		 
		// 我们发现上面的代码是一样的，所以，我们考虑要用循环改进
		// 如何用循环改进呢?
		// 重点来了
		// 就是如何判断循环什么时候结束
//		 for(int x = 0;x<1000;x++){
//			 by = fis.read();
//			 System.out.println(by);
//			 by = fis.read();
//			 System.out.println(by);			 
//		 }
		// 通过测试我们发现，这个判断条件值是-1
		while((by = fis.read()) != -1){
			System.out.println((char)by);	
		}
		// 释放资源
		fis.close();
	}

}
