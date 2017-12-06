package com.colection.Set.TreeSet;
//类型 Person 必须实现继承的抽象方法 Comparable.compareTo（Object）
public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// @Override
	// public int hashCode() {
	// // return 0;
	// // return this.name.hashCode() + this.age;
	// // this.name.hashCode(): 20,40
	// // this.age: 50,30
	// return this.name.hashCode() + this.age * 13;
	// }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person p) {
		// 主要条件
		// 姓名的长度进行排序
		int num = this.name.length() - p.name.length();
		// 次要条件
		// 长度一样，不代表内容一样，所以，还要继续比内容
		int num2 = num == 0 ? this.name.compareTo(p.name) : num;
		// 长度一样，内容一样，还应该比较年龄
		int num3 = num2 == 0 ? this.age - p.age : num2;
		return num3;
	}
	
}
