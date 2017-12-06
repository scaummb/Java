package com.thread;

class ThreadTestAgain implements Runnable{
	private String name;
	public ThreadTestAgain(String name){
		this.name = name;
	}
	public void run(){
		for(int i=0; i<50;i++){
			System.out.println(name+" : "+i);
			try{
				Thread.sleep(1000);	
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			if(i%10==0){
				System.out.println("礼让方法执行");
				Thread.yield();//yield()
			}
//			System.out.println("当前线程对象： "+Thread.currentThread().getName());
		}
	}
}

public class ThreadTestTwo {

	public static void main(String[] args) {
		ThreadTestAgain tta1 = new ThreadTestAgain("C");
		ThreadTestAgain tta2 = new ThreadTestAgain("D");
		Thread t3 = new Thread(tta1);
		Thread t4 = new Thread(tta2);
//		System.out.println(t3.isAlive());
//		System.out.println(t4.isAlive());
		t3.start();
		t4.start();
//		System.out.println(t3.isAlive());
//		System.out.println(t4.isAlive());
		
/*		Thread.join():强制执行线程*/		
		for(int i=0; i<50; i++){
			if(i>10){
				System.out.println("**i>10");
				try{
					t3.join();
				}catch(InterruptedException e){
					System.out.println(e);
					e.printStackTrace();
				}
			}
			System.out.println("主线程:"+i);
		}
		
	}

}
