package com.file;

import java.io.File;
import java.io.IOException;

/*
 * ����������:public boolean renameTo(File dest)
 * ·����ͬ������
 * ·����ͬ�����в�����
 */
public class FileDemo3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("E:\\file\\a.java");
		File f1 = new File("E:\\file\\b.java");
		// ������Ҫ��a.txt���ļ����Ƹ�Ϊb.txt
		// ��������
		// File file = new File("a.txt");
		// // Ŀ��
		// File dest = new File("b.txt");
		// // ���÷���
		// System.out.println("renameTo:" + file.renameTo(dest));
		System.out.println("f.createNewFile()"+f.createNewFile());
		System.out.println("sleep ");
		Thread.sleep(3000);
		System.out.println("renameTo:" +f.renameTo(f1));
	}

}
