package com.code.CompareInterface.Comparator;

import java.util.Comparator;
//���� Person ����ʵ�ּ̳еĳ��󷽷� Comparator<Person>.compare��Person, Person��
public class Person implements Comparator<Person>{
	private String name;
	private Integer age;
	public Person(){		
	}
	public Person (String name ,Integer age){
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(Integer age){
		this.age = age;
	}
	public Integer getAge(){
		return age;
	}
	@Override
	public int compare(Person p1, Person p2) {
		if(p1.getAge() > p2.getAge()){
			return 1;
		}else if(p1.getAge() < p2.getAge()){
			return -1;
		}else{
			if(p1.getName().compareTo(p2.getName()) > 0){
				return 1;
			}else if(p1.getName().compareTo(p2.getName()) > 0){
				return -1;
			}else{
				return 0;
			}
		}
	}

}
