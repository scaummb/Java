package com.file;

import java.io.File;
import java.io.IOException;
/*
 * ɾ�����ܣ�public boolean delete() �ȿ���ɾ���ļ���Ҳ����ɾ���ļ��С�
 * 
 * ���·���������̷���ʼ��·��
 * ����·�������̷���ʼ��·��
 * 
 * ע�����
 * 		A:���һ���ļ����������ݣ��ǲ���ֱ��ɾ���ġ�
 * 		B:Java�����ɾ�����߻���վ��ֱ��ɾ����
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException{
		File f = new File("E:\\file\\a.java");
		System.out.println("createNewFile:" + f.createNewFile());
		
		File file2 = new File("E:\\file\\aaa\\bbb");
		System.out.println("mkdirs:" + file2.mkdirs());
		System.out.println("file2: "+file2);
		File file3 = new File(file2, "b.txt");
		System.out.println("createNewFile:" + file3.createNewFile());
		
		// ɾ���ļ�
		System.out.println("delete f :" + f.delete());
		
		System.out.println("delete file3: "+file3.delete());
		
		
		// ɾ���ļ���
		File file4 = new File("E:\\file\\aaa\\bbb\\ccc");
		System.out.println("delete ccc:" + file4.delete());
		
		File file5 = new File("E:\\file\\aaa\\bbb");
		System.out.println("delete bbb:" + file5.delete());		
		
		File file6 = new File("E:\\file\\aaa");
		System.out.println("delete aaa:" + file6.delete());
				
	}

}
