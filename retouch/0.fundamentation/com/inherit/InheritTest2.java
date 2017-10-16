package com.inherit;

class CatTest {
	private String name;
	private int age;

	public CatTest() {}

	public CatTest(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//封装
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void show() {
		System.out.println(name+"---"+age);
	}

	public void CatTestchMouse() {
		System.out.println("猫捉老鼠");
	}
}
//狗类
class DogTest extends Dog{
	private String name;
	private int age;

	public DogTest() {}

	public DogTest(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void show() {
		System.out.println(name+"---"+age);
	}

	public void lookDoor() {
		System.out.println("狗可以看门");
	}
}

public class InheritTest2 {
	public static void main(String [] args){
		//猫类测试
		CatTest c = new CatTest();
		c.setName("加菲猫");
		c.setAge(3);
		c.show();
		c.CatTestchMouse();
		System.out.println("------------");
		CatTest cc = new CatTest("tom猫",6);
		cc.show();
		cc.CatTestchMouse();
		System.out.println("------------");

		//练习1：自己写出狗的测试
		DogTest d = new DogTest();
		d.setName("啸天");
		d.setAge(5);
		d.show();
		d.lookDoor();
		System.out.println("------------");

		DogTest dd = new DogTest("旺财",8);
		dd.show();
		dd.lookDoor();
	}

}
