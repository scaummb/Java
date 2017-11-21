package com.test;

public class test {

	public static void main(String[] args) {
//		boolean a = null;
		byte a = 127;
		System.out.println(a);
		long l = 0xffff;
		System.out.println(l);
		double b = 0.665541d;
		double d = 0.665541;
		System.out.println(b);
		System.out.println(d);
		if(b == d ){
			System.out.println("true!");
		}else{
			System.out.println("false!");
		}
	}

}
