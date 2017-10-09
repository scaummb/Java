package com.object;

public class Student {
	public static void main(String[] args){
		Student2 s = new Student2();
		
		//print the name of object
		System.out.println(s);
		
		//输出成员变量
		System.out.println("学号是："+s.Id); //null
		System.out.println("姓名是："+s.name);//null
		System.out.println("年龄是："+s.age); //0
		System.out.println("--------------");
		
		s.Id = "2013302909";
		s.name = "Linus_Torvalds";
		s.age = 60;
		
		//再次输出成员变量
		System.out.println("学号是："+s.Id); //itcast001
		System.out.println("姓名是："+s.name);//林青霞
		System.out.println("年龄是："+s.age); //28
		System.out.println("--------------");
		
		s.study();
		s.eat();
		s.sleep();
	}
}

class Student2 {
	//学号
	String Id;
	//姓名
	String name;
	//年龄
	int age;

	//学习的方法
	//学习的方法
	public void study() {
		System.out.println("学生爱学习");
	}

	//吃饭的方法
	public void eat() {
		System.out.println("学生要吃饭");
	}

	//睡觉的方法
	public void sleep() {
		System.out.println("学生想睡觉");
	}
}