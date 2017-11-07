package com.io.file;

import java.io.File;

/*
 * File:�ļ���Ŀ¼·�����ĳ����ʾ��ʽ
 * ��⣺����������ļ�����Ŀ¼һ�����ڡ�
 * 
 * ���췽����
 * 		File(String pathname)��ͨ��һ��·��������File����
 * 		File(String parent, String child)�� ͨ����·������·��������File����
 * 		File(File parent, String child)��ͨ����·��File�������·��������File����
 */
public class FileDemo {

	public static void main(String[] args) {
		// ��������
		// File(String pathname)��ͨ��һ��·��������File����
		System.out.println("1");
		File file = new File("C:\\Users\\Administrator\\Desktop\\java_suggestion.txt");
		
		// File(String parent, String child)�� ͨ����·������·��������File����		System.out.println("1");
		System.out.println("2");
		File file2 = new File("C:\\Users\\Administrator\\Desktop","java_suggestion.txt");
		
		// File(File parent, String child)��ͨ����·��File�������·��������File����
		System.out.println("3");
		File file3 = new File("C:\\Users\\Administrator\\Desktop");
		File file4 = new File(file3, "java_suggestion.txt");

	}

}
