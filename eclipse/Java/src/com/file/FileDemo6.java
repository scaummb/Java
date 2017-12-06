package com.file;

import java.io.File;
import java.io.IOException;

/*
 * public String[] list():返回的是给定目录下的所有文件或者文件夹的名称数组。
 * public File[] listFiles():返回的是给定目录下的所有文件或者文件夹的File数组。
 */
public class FileDemo6 {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\file\\a.java");
		File ff = new File("E:\\file");
		System.out.println("f.createNewFile(): "+f.createNewFile());
		new File("E:\\file\\aa.txt").createNewFile();
		// public String[] list():返回的是给定目录下的所有文件或者文件夹的名称数组。
		String[] list = ff.list() ;
		System.out.println("list: "+list);
		for(String a : list){
			System.out.println(a);
		}
		System.out.println("-----------------");
		// public File[] listFiles():返回的是给定目录下的所有文件或者文件夹的File数组。
		File[] fileArray = ff.listFiles();
		System.out.println("file: "+fileArray);
		for(File fff : fileArray){
			System.out.println("fff.getAbsoluteFile: "+fff.getAbsoluteFile());
			System.out.println("fff.getName(): "+fff.getName());
		}
		
		

	}

}
