package com.file;

import java.io.File;
import java.io.IOException;

/*
 *public boolean isDirectory():�Ƿ����ļ���
 *public boolean isFile():�Ƿ����ļ�
 *public boolean exists():�Ƿ����
 *public boolean canRead():�Ƿ�ɶ�
 *public boolean canWrite():�Ƿ��д
 *public boolean isHidden():�Ƿ�����
 */
public class FileDemo4 {

	public static void main(String[] args) throws IOException {
//		File file = new File("demo.txt");
		File f = new File("E:\\file\\a.java");
		System.out.println("f.createNewFile()"+f.createNewFile());
		System.out.println("isDirectory:" + f.isDirectory());
		System.out.println("isFile:" + f.isFile());
		System.out.println("exists:" +f.exists());
		System.out.println("canRead:" + f.canRead());
		System.out.println("canWrite:" + f.canWrite());
		System.out.println("isHidden:" + f.isHidden());
		
	}

}
