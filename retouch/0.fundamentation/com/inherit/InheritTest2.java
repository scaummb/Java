package com.inherit;

class CatTest {
	private String name;
	private int age;

	public CatTest() {}

	public CatTest(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//��װ
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
		System.out.println("è׽����");
	}
}
//����
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
		System.out.println("�����Կ���");
	}
}

public class InheritTest2 {
	public static void main(String [] args){
		//è�����
		CatTest c = new CatTest();
		c.setName("�ӷ�è");
		c.setAge(3);
		c.show();
		c.CatTestchMouse();
		System.out.println("------------");
		CatTest cc = new CatTest("tomè",6);
		cc.show();
		cc.CatTestchMouse();
		System.out.println("------------");

		//��ϰ1���Լ�д�����Ĳ���
		DogTest d = new DogTest();
		d.setName("Х��");
		d.setAge(5);
		d.show();
		d.lookDoor();
		System.out.println("------------");

		DogTest dd = new DogTest("����",8);
		dd.show();
		dd.lookDoor();
	}

}
