//package com.file;
//
//import java.io.File;
//import java.io.IOException;
//
///*
// * File:�ļ���Ŀ¼·�����ĳ����ʾ��ʽ
// * ��⣺����������ļ�����Ŀ¼һ�����ڡ�
// * 
// * ���췽����
// * 		File(String pathname)��ͨ��һ��·��������File����
// * 		File(String parent, String child)�� ͨ����·������·��������File����
// * 		File(File parent, String child)��ͨ����·��File�������·��������File����
// */
//class myThread extends Thread {
//	private String name = null;
//	public myThread(String path_name){
//		this.name = path_name;
//	}
//	//�쳣 IOException �� Thread.run() �е� throws �Ӿ䲻���ݣ����Բ���createfile��
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
//		// File(String pathname)��ͨ��һ��·��������File����
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
