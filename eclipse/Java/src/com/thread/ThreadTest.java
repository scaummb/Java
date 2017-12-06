package com.thread;

public class ThreadTest {

	public static void main(String[] args) {
//		MyThread thread = new MyThread("Thread Test One");
//		MyThread threadtwo = new MyThread("Thread Test Two");
		//线程的启动不是通过run方法（调用）
//		thread.run();
//		thread.start();
//		threadtwo.start();
//		System.out.println("**********");
		
		//another way to realize Thread
		MyRunnable myrunnable1 = new MyRunnable("A");
		MyRunnable myrunnable2 = new MyRunnable("B");
		Thread t1 = new Thread(myrunnable1);
		Thread t2 = new Thread(myrunnable2);
		t1.start();
		t2.start();
	}

}
