package com.polymorphic;

/*
 * 
 * */
class A{
	public void show (){
		show2();
	}
	public void show2(){
		System.out.println("I ");
	}
}
class B extends A{
	public void show2(){
		System.out.println("love ");
	}
}
class C extends B{
	public void show(){
		super.show();
//		super.show2();
	}
	public void show2(){
		System.out.println("you.");
	}
}
public class PolymorphicTestForth {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		A a = new B();//向上转型,
		a.show();

	}

}
