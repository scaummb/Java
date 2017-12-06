package com.thread;

public class MyThread  extends Thread{
	private String name;
	
	public MyThread(String name){
		this.name = name;
	}
	
	public void run(){
		for (int i=10; i<1010; i++){
			System.out.println(name +": "+i);
		}
//		super.run();
	}

}
