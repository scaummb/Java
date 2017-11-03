package com.reflection;

class Base{
	public void f(){
		System.out.println("Base");
	}
}

class Sub extends Base{
	public void f(){
		System.out.println("Sub");
	}
}

public class ReflectionTest {
	public static void main(String[] args){
		try{
			Class c = Class. forName("Sub");
//报错：没有为类型 Class 定义方法 f（）
//			c.f();
			System.out.println("**"+c);
			Base b = (Base) c.newInstance();
			System.out.println("++"+b);
			b.f();
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}

}
