package com.io.IOtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAviDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\file\\a");
		f.mkdirs();
		new File("E:\\file\\a\\aaaa.txt").createNewFile();
		new File("E:\\file\\a\\a.bmp").createNewFile();
		FileInputStream fis = new FileInputStream("E:\\file\\a.avi");
		FileInputStream fis2 = new FileInputStream("E:\\file\\aaaa.txt");
		FileInputStream fis3 = new FileInputStream("E:\\file\\a.bmp");
		
		//E:\file\aaa.avi (系统找不到指定的文件。),说明：要用file.createnewfile()创建新文件
//		FileInputStream fis4 = new FileInputStream("E:\\file\\aaa.avi");
		
		FileOutputStream fos = new FileOutputStream("E:\\file\\a\\b.avi");
		FileOutputStream fos2= new FileOutputStream("E:\\file\\a\\aaaa.txt");
		FileOutputStream fos3 = new FileOutputStream("E:\\file\\a\\a.bmp");
		
		byte[] bys = new byte[1024*1024];
//		byte[] a = new byte[1024*1024];
		int a;
		int b = 0;
		int c = 0;//思考为啥是int？？
		while(((a = fis.read(bys)) != -1)||((b = fis2.read(bys)) != -1)||((c = fis3.read(bys)) != -1)){
			fos.write(a);
			fos2.write(b);
			fos3.write(c);
		}
		System.out.println("Done..");
		//释放资源
		fos.close();
		fis.close();
		fos2.close();
		fis2.close();
		fos3.close();
		fis3.close();
	}

}
