package com.java.myself;

public class ElseIfTest {
	static int  k = 10;
	public static void main(String[] args) {
//		int k = 10;
		class count{
			protected int k = 100;
			private boolean a = false;
			int fun(){
				System.out.println("change");
				return k;
			}
		}
		
//		count a = new count();
//		k = a.fun();
		
		if(k == 10){
			System.out.println("k == 10");
		}else if(k == 100){
			System.out.println("k == 100");
		}else{
			System.out.println("k is a boolean");
		}
	}

}
