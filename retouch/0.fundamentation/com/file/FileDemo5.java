package com.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *public String getAbsolutePath():获取绝对路径
 *public String getPath():获取相对路径
 *public String getName():获取名称
 *public long length():获取文件的大小
 *public long lastModified():获取最后一次修改时间的毫秒值
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
