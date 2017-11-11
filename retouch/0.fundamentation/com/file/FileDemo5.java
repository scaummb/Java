package com.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *public String getAbsolutePath():��ȡ����·��
 *public String getPath():��ȡ���·��
 *public String getName():��ȡ����
 *public long length():��ȡ�ļ��Ĵ�С
 *public long lastModified():��ȡ���һ���޸�ʱ��ĺ���ֵ
 */
public class FileDemo5 {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\file\\a.java");
		System.out.println("f.createNewFile()"+f.createNewFile());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getPath());
		
		System.out.println("getAbsolutePath:" + f.getAbsolutePath());
		System.out.println("getPath:" + f.getPath());
		System.out.println("getName:" + f.getName());
		System.out.println("length:" + f.length());
		System.out.println("lastModified:" + f.lastModified());
		
		// 1428044959288
		Date d = new Date(1428044959288L);
		System.out.println("d: "+d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
	}

}
