package com.test;

public class ConstructorPrivate {
//	private
//	public
	//区别 方法的地方在三个方面：1. 修饰符、2. 返回值（无 void）、3. 构造器命名（跟类名字一样）
	protected//但是，不能被：static / synchronized / abstract / final，也没有返回值
	ConstructorPrivate(){
		System.out.println("This is a constructor.");
	}
	static{
		System.out.println("This is a static block.");
	}
	public static void main(String [] args){
		System.out.println("**");
	}

}
