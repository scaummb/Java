package com.object;

public class Student {
	public static void main(String[] args){
		Student2 s = new Student2();
		
		//print the name of object
		System.out.println(s);
		
		//�����Ա����
		System.out.println("ѧ���ǣ�"+s.Id); //null
		System.out.println("�����ǣ�"+s.name);//null
		System.out.println("�����ǣ�"+s.age); //0
		System.out.println("--------------");
		
		s.Id = "2013302909";
		s.name = "Linus_Torvalds";
		s.age = 60;
		
		//�ٴ������Ա����
		System.out.println("ѧ���ǣ�"+s.Id); //itcast001
		System.out.println("�����ǣ�"+s.name);//����ϼ
		System.out.println("�����ǣ�"+s.age); //28
		System.out.println("--------------");
		
		s.study();
		s.eat();
		s.sleep();
	}
}

class Student2 {
	//ѧ��
	String Id;
	//����
	String name;
	//����
	int age;

	//ѧϰ�ķ���
	//ѧϰ�ķ���
	public void study() {
		System.out.println("ѧ����ѧϰ");
	}

	//�Է��ķ���
	public void eat() {
		System.out.println("ѧ��Ҫ�Է�");
	}

	//˯���ķ���
	public void sleep() {
		System.out.println("ѧ����˯��");
	}
}