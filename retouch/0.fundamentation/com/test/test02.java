package com.test;

public class test02 {

	public static void main(String[] args) {
//		System.out.println(new int[2] instanceof Object);
		class foo {
			public int i ;
		}
		Object o = (Object) new foo();
		foo a = (foo) o;
//		System.out.println("i = "+foo.i);
	}

}
