package com.thread;

class ThreadDemo implements Runnable{
	private String name;
	public ThreadDemo(String name){
		this.name = name;
	}
	public void run() {
		for (int i = 0; i<50; i++){
			try{
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+": "+i);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	
}

public class ThreadTestThree {

	public static void main(String[] args) {
		//使用匿名对象，创建线程更加方便
		Thread t1 = new Thread(new ThreadDemo("A"),"A");
		Thread t2 = new Thread(new ThreadDemo("B"),"B");
		Thread t3 = new Thread(new ThreadDemo("C"),"C");
//		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
