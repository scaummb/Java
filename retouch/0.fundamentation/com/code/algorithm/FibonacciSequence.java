package com.code.algorithm;

public class FibonacciSequence {
	public static void main(String[] args){
		System.out.println("First month : 1");
		System.out.println("Second month : 1");
		
		int f1 = 1,f2 = 1, f ,Mon = 24;
		for(int i = 3; i<=Mon; i++){
			f = f2;
			f2 = f1 + f2;
			f1 = f;
			System.out.println("The "+ i +" month : "+ f2);
		}
	}

}
