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
//����û��Ϊ���� Class ���巽�� f����
			Base b = (Base) c.newInstance();
			b.f();
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}

}
