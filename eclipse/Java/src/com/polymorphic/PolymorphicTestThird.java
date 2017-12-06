package com.polymorphic;

class Fu{
//	public static void show(){
	public  void show(){
		System.out.println("fu show");
	}
}
class Zi extends Fu{
//	public static void show(){
	public void show(){
		System.out.println("zi show");
	}

	public void method(){
		System.out.println("zi method");
	}
}

public class PolymorphicTestThird {

	public static void main(String[] args) {
		Fu f = new Zi();
//		f.method();
		f.show();

	}

}
