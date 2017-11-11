package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		// 创建字节输入流对象
		FileInputStream fis = new FileInputStream("E:\\file\\aa.txt");
		
		// 读取数据
//		 public int read(byte[] b);
		 byte[] bys = new byte[5];
		 System.out.println("bys: "+bys);
		 
		// // 第一次读取
		 int len = fis.read(bys);
		 System.out.println(len);
		// // System.out.println(new String(bys));
		 /*
		  * String(byte[] bytes, int offset, int length) 
          通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。
		  * */
		 System.out.println(new String(bys, 0, len));
		// // 第二次读取
		 len = fis.read(bys);
		 System.out.println(len);
		// // System.out.println(new String(bys));
		 System.out.println(new String(bys, 0, len));
		 
//		 while((len = fis.read()) != -1){
//			 System.out.println(len);
//			 System.out.println(new String(bys, 0, len));
//		 }
		 
			// byte[] bys = new byte[5];
			byte[] byss = new byte[1024 * 1024]; // 这里的数据一般是1024或者其整数倍
			int len1 = 0;
			while ((len1 = fis.read(byss)) != -1) {
				System.out.print(new String(byss, 0, len));
			}
		
	}

}
