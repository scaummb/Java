package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		// �����ֽ�����������
		FileInputStream fis = new FileInputStream("E:\\file\\aa.txt");
		
		// ��ȡ����
//		 public int read(byte[] b);
		 byte[] bys = new byte[5];
		 System.out.println("bys: "+bys);
		 
		// // ��һ�ζ�ȡ
		 int len = fis.read(bys);
		 System.out.println(len);
		// // System.out.println(new String(bys));
		 /*
		  * String(byte[] bytes, int offset, int length) 
          ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte �����飬����һ���µ� String��
		  * */
		 System.out.println(new String(bys, 0, len));
		// // �ڶ��ζ�ȡ
		 len = fis.read(bys);
		 System.out.println(len);
		// // System.out.println(new String(bys));
		 System.out.println(new String(bys, 0, len));
		 
//		 while((len = fis.read()) != -1){
//			 System.out.println(len);
//			 System.out.println(new String(bys, 0, len));
//		 }
		 
			// byte[] bys = new byte[5];
			byte[] byss = new byte[1024 * 1024]; // ���������һ����1024������������
			int len1 = 0;
			while ((len1 = fis.read(byss)) != -1) {
				System.out.print(new String(byss, 0, len));
			}
		
	}

}
