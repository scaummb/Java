package com.code.CompareInterface.ComparableInterface;

//类型 Person 必须实现继承的抽象方法 Comparable<String>.compareTo（String）
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
		//auto 比较age
		if(this.age > p.age){
			return (this.age - p.age);
		}if(this.age < p.age){
			return (this.age - p.age);
		}		
		//auto 比较name
		if(this.name.compareTo(p.name) > 0){
			return 1;
		}
		if(this.name.compareTo(p.name) < 0){
			return -1;
		}
		return 0;
	}

}
