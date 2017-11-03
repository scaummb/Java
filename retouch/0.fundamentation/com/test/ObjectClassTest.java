package com.test;

class a{}

public class ObjectClassTest {

	public static void main(String[] args) {
		a aa = new a();
		System.out.println("aa instanceof a :"+(aa instanceof a));
		//Object 是所有类的根父类
		System.out.println("aa instanceof Object :"+(aa instanceof Object));
	}

}
