package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����С���⣺
 * A:ʵ�����ݵĻ���?
 * 		��ͬ��ϵͳ����Ի��з��ŵ�ʶ���ǲ�һ���ġ�
 * 		Mac:		\r
 * 		linux:		\n
 * 		windows:	\r\n
 * 		ϵͳ�Դ��ļ��±������ֻ��ʶ���ϵͳ�ܹ�ʶ��Ļ��С�
 * 		��Eclipse�Դ��ļ��±����Լ�Editplusȴ����ʶ������Ļ��з���
 * 
 * B:ʵ�����ݵ�׷��д��? 
 * 		public FileOutputStream(String name,boolean append)
 * 		����ڶ�������Ϊ true�����ֽ�д���ļ�ĩβ����������д���ļ���ʼ����
 */
public class FileOutputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		// �����ֽ����������
		FileOutputStream fos = new FileOutputStream("E:\\file\\aaa.txt");
		for(int x=0;x<10;x++){
			fos.write(("Hello"+x).getBytes());
			System.out.println(x+"---"+("Hello"+x).getBytes());
//			 fos.write(("hello" + x + "\n").getBytes());
			 fos.write(("hello" + x + "\r").getBytes());
		}
		fos.close();
	}

}
