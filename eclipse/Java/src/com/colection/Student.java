package com.colection;

public class Student {
	private String name;
	private int age;
	
	public Student(){
		super();
	}
	
	public Student(String name,int age){
		super();
		this.name = name;
		this.age = age;
		
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setName(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name = "+ name + ", age=" + age + "]";
	}
	
	

}
