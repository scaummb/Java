package com.file;

import java.io.File;
import java.io.IOException;

/*
 *public boolean isDirectory():是否是文件夹
 *public boolean isFile():是否是文件
 *public boolean exists():是否存在
 *public boolean canRead():是否可读
 *public boolean canWrite():是否可写
 *public boolean isHidden():是否隐藏
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
