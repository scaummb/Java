package com.object;
import  com.object.ClassEncapsulation;

public class ClassVariableEncapsulation {
	public static void main(String [] args){
		//创建对象
		StudentName s = new StudentName();
		//输出成员变量的值
		System.out.println(s.getName()+"---"+s.getName());

		//给成员变量赋值
		s.setName("林青霞");
		s.setAge(28);

		//再次输出成员变量的值
		StudentAge sa= new StudentAge();
		System.out.println(s.getName()+"---"+s.getAge(sa, 23));
	}

}

class StudentName{
	private String name;
	private int age;
	
	//针对name给出get和set方法
	public void setName(String n){
		name = n;		
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public int getAge(StudentAge sa,int a){
		System.out.println("   0");
		sa.setAge(a);
		int result = sa.getAge();
		System.out.println(result+"  1");
		return a;
	}
}