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
 * ����1��дһ��ѧ���࣬��������������
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
����2��дһ����ʦ�࣬��������������
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
����3��дһ�������࣬��������������
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
����4��...

ͨ������Ĵ��룬���Ƿ��ָ���������ͬ�Ķ����Ƚ϶ࡣ
���ң�������Ƕ�ÿ����Ҫ��ӻ���ɾ����ͬ�Ķ�����Ҳ�Ƚ��鷳��
��Ϊ����Ҫ�����ܶ��ࡣ
��ô�����Ǿ����룬��û�бȽϺõķ�ʽ������������?
��ν����?
	˼�룺�ҿ��԰�����������ͬ�����ݸ���ǰ�������嵽��A�С�
	      Ȼ������Щ���A�����һ����ϵ�����������ϵ����Щ
	      ��;߱���A��ĳ�Ա��
	��Ȼ�ǿ��Ե��ˣ�java�ṩ�˼̳м��������������⡣

��������˼���������Ľ����룺
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
�����ϵ��α����?
	��ʽ��class ������ extends ������ {}  

	class Student extends Person {
		public Student(){}

		public Student(String name,int age) {
			???
		}
	}
 * 
 */