package com.object;

public class InheritObject {
	public static void main(String[] args){
		StudenPerson sp = new StudenPerson();
		System.out.println("Begin**");
		System.out.println(sp.set_getAge(23));
//		System.out.println(sp.set_getName("mmb"));
		System.out.println(sp.name);
		System.out.println(sp.classname);
	}

}

class StudenPerson extends Person{
//	System.out.println("1 age: "+super.age);
//	System.out.println("2 age: "+this.age);
	private int age = 10;
	String classname ;
//	String name="mmb";
//	System.out.println("2 age: "+this.age);
	public  StudenPerson(){
		classname= "SCAU";
		System.out.print("**");
	}
	
	
} 

class Person{
//	private String name;
	String name ="mmmbbb";
	private int age;

	public Person(){}

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String set_getName(String arr){
		this.name = arr;
		return this.name;
	}
	
	public int set_getAge(int age){
		this.age = age;
		return this.age;
	}
}



/*
 * 需求1：写一个学生类，包含姓名和年龄
	class Student {
		private String name;
		private int age;

		public Student(){}

		public Student(String name,int age) {
			this.name = name;
			this.age = age;
		}

		//getXxx()/setXxx()
	}
需求2：写一个教师类，包含姓名和年龄
	class Teacher {
		private String name;
		private int age;

		public Teacher() {}

		public Teacher(String name,int age) {
			this.name = name;
			this.age = age;
		}

		//getXxx()/setXxx()
	}
需求3：写一个工人类，包含姓名和年龄
	class Worker {
		private String name;
		private int age;

		public Worker() {}

		public Worker(String name,int age) {
			this.name = name;
			this.age = age;
		}

		//getXxx()/setXxx()
	}
需求4：...

通过上面的代码，我们发现各个类中相同的东西比较多。
并且，如果我们对每个类要添加或者删除相同的东西，也比较麻烦，
因为我们要操作很多类。
那么，我们就在想，有没有比较好的方式解决这个问题呢?
如何解决呢?
	思想：我可以把这多个类中相同的内容给提前出来定义到类A中。
	      然后让这些类和A类产生一个关系，有了这个关系后，这些
	      类就具备了A类的成员。
	当然是可以的了，java提供了继承技术来解决这个问题。

按照这种思想我们来改进代码：
	class Person {
		private String name;
		private int age;

		public Person(){}

		public Person(String name,int age) {
			this.name = name;
			this.age = age;
		}

		//getXxx()/setXxx()
	}
这个关系如何表达呢?
	格式：class 子类名 extends 父类名 {}  

	class Student extends Person {
		public Student(){}

		public Student(String name,int age) {
			???
		}
	}
 * 
 */