package com.code.CompareInterface.ComparableInterface;

//���� Person ����ʵ�ּ̳еĳ��󷽷� Comparable<String>.compareTo��String��
public class Person implements Comparable<Person>{
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
	public int compareTo(Person p) {
		//auto �Ƚ�age
		if(this.age > p.age){
			return (this.age - p.age);
		}if(this.age < p.age){
			return (this.age - p.age);
		}		
		//auto �Ƚ�name
		if(this.name.compareTo(p.name) > 0){
			return 1;
		}
		if(this.name.compareTo(p.name) < 0){
			return -1;
		}
		return 0;
	}

}
