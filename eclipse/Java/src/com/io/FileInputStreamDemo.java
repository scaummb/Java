package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// �����ֽ�����������
		FileInputStream fis = new FileInputStream("E:\\file\\aa.txt");
		
		// ���÷�������ȡ����
		// ��һ�ζ�ȡ
		 int by = fis.read();
		 System.out.println(by);
		 System.out.println((char) by);
		// // �ڶ��ζ�ȡ
		 by = fis.read();
		 System.out.println(by);
		 System.out.println((char) by);
		 // �����ζ�ȡ
		 by = fis.read();
		 System.out.println(by);
		 System.out.println((char) by);
		 
		// ���Ƿ�������Ĵ�����һ���ģ����ԣ����ǿ���Ҫ��ѭ���Ľ�
		// �����ѭ���Ľ���?
		// �ص�����
		// ��������ж�ѭ��ʲôʱ�����
//		 for(int x = 0;x<1000;x++){
//			 by = fis.read();
//			 System.out.println(by);
//			 by = fis.read();
//			 System.out.println(by);			 
//		 }
		// ͨ���������Ƿ��֣�����ж�����ֵ��-1
		while((by = fis.read()) != -1){
			System.out.println((char)by);	
		}
		// �ͷ���Դ
		fis.close();
	}

}
