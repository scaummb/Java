//package com.file;
//
//import java.io.File;
//import java.io.IOException;
//
///*
// * File:文件和目录路径名的抽象表示形式
// * 理解：不代表这个文件或者目录一定存在。
// * 
// * 构造方法：
// * 		File(String pathname)：通过一个路径名创建File对象
// * 		File(String parent, String child)： 通过父路径和子路径名创建File对象
// * 		File(File parent, String child)：通过父路径File对象和子路径名创建File对象
// */
//class myThread extends Thread {
//	private String name = null;
//	public myThread(String path_name){
//		this.name = path_name;
//	}
//	//异常 IOException 与 Thread.run() 中的 throws 子句不兼容，所以不能createfile。
////	public void run() throws IOException{
//	public void run() {
//		System.out.println("thread1 ");
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Starting to delete..");
//		File file = new File(name);
//		file.delete();
//	}
//}
//
//class MyThread implements Runnable{
//	private String name = null;
//	public MyThread(String path_name){
//		this.name = path_name;
//	}
//	public void run(){
//		System.out.println("thread2 ");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Starting to delete..");
//		File file = new File(name);
//		file.delete();
//	}
//}
//
//public class FileDemo { 
//	
//	public static void main(String[] args) throws IOException{
//		// File(String pathname)：通过一个路径名创建File对象
//		File f = new File("E:\\file\\a.java");
//		f.createNewFile();
//		File file = new File("E:\\file\\a.txt");
//		file.createNewFile();
//		File f2 = new File("E:\\file\\b.java");
//		f2.createNewFile();
//		File file2 = new File("E:\\file\\b.txt");
//		file2.createNewFile();
//		
//		myThread mt = new myThread("E:\\file\\a.java");
//		myThread mt2 = new myThread("E:\\file\\a.txt");
//		System.out.println("Thread start..");
//		mt.start();
//		mt2.start();
//		
//
//		
////		MyThread mt3 = new MyThread("E:\\file\\b.java");
////		MyThread mt4 = new MyThread("E:\\file\\b.txt");
////		Thread td3 = new Thread(mt3);
////		Thread td4 = new Thread(mt4);
////		td3.start();
////		td4.start();
//			
//
//	}
//
//}
