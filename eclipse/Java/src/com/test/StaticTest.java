package com.test;

public class StaticTest {
	static int  a ;
	int b;
	static int x = 5;
	static{ x+=5;}
	public static void main(String [] args){
		a = 10;  //类变量随时可以使用
//		b = 20; //先有创建一个类对象才可以
//		StaticTest aa = new StaticTest();
//		aa.b = 10;
		
		//说明了啥？
		//访问静态变量有俩方法：类 or 实例对象，加个句号符.便可以
		Mystatic mystatic1 = new Mystatic();
		Mystatic mystatic2 = new Mystatic();
		System.out.println("first: "+mystatic2.c);
		mystatic1.c = 100;
//		Mystatic.c = 100;
		System.out.println("second: "+mystatic2.c);
		
		//测试静态代码块，所有静态初始化在类	装载时就执行完成了
		System.out.println("x="+x);
	}
	static {x -= 5;}

}

class Mystatic {
	static int c =10; //static variable
}