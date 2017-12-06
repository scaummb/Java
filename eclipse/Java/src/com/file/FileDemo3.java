package com.file;

import java.io.File;
import java.io.IOException;

/*
 * 重命名功能:public boolean renameTo(File dest)
 * 路径相同：改名
 * 路径不同：剪切并改名
 */
public class FileDemo3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("E:\\file\\a.java");
		File f1 = new File("E:\\file\\b.java");
		// 需求：我要把a.txt的文件名称改为b.txt
		// 创建对象
		// File file = new File("a.txt");
		// // 目标
		// File dest = new File("b.txt");
		// // 调用方法
		// System.out.println("renameTo:" + file.renameTo(dest));
		System.out.println("f.createNewFile()"+f.createNewFile());
		System.out.println("sleep ");
		Thread.sleep(3000);
		System.out.println("renameTo:" +f.renameTo(f1));
	}

}
