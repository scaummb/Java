package com.io.file;

import java.io.File;

/*
 * File:文件和目录路径名的抽象表示形式
 * 理解：不代表这个文件或者目录一定存在。
 * 
 * 构造方法：
 * 		File(String pathname)：通过一个路径名创建File对象
 * 		File(String parent, String child)： 通过父路径和子路径名创建File对象
 * 		File(File parent, String child)：通过父路径File对象和子路径名创建File对象
 */
public class FileDemo {

	public static void main(String[] args) {
		// 创建对象
		// File(String pathname)：通过一个路径名创建File对象
		System.out.println("1");
		File file = new File("C:\\Users\\Administrator\\Desktop\\java_suggestion.txt");
		
		// File(String parent, String child)： 通过父路径和子路径名创建File对象		System.out.println("1");
		System.out.println("2");
		File file2 = new File("C:\\Users\\Administrator\\Desktop","java_suggestion.txt");
		
		// File(File parent, String child)：通过父路径File对象和子路径名创建File对象
		System.out.println("3");
		File file3 = new File("C:\\Users\\Administrator\\Desktop");
		File file4 = new File(file3, "java_suggestion.txt");

	}

}
