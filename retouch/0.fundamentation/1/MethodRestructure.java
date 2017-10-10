package com.object;

/*
 * 	比较两个数据是否相等。参数类型分别为两个byte类型，两个short类型，
	两个int类型，两个long类型，并在main方法中进行测试
 * */

/*
 * 	方法重载：
		在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
		和返回值类型无关。
 * */
public class MethodRestructure {
	public static void main(String[] args){
		//test
		byte a = 10;
		byte b = 10;
		short a1 = 233;
		short b1 = 766;
		
		System.out.println(compare(a1,b1)+" 0");
		
		System.out.println(compare(a,b)+" 1");
		
		System.out.println(compare(10,10)+" 2");
	}
	//byte
	public static boolean compare(byte a,byte b){
		System.out.print("byte ");
		return a == b;
	}
	
	//short
	public static boolean compare(short a,short b){
		System.out.print("short ");
		return a == b;
	}

	//int
	public static boolean compare(int a,int b) {
		System.out.print("int ");
		return a == b;
	}
	
	//long
	public static boolean compare (long a,long b){
		System.out.print("long ");
		return a == b;
	}
}

