package com.colection.ArrayList_Vector_LinkedList.Generic.example;

public class Tool {
	private Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}

class Student {
	public void love() {
		System.out.println("ѧ����ѧϰ");
	}
}

class Teacher {
	public void love() {
		System.out.println("��ʦ������ϼ");
	}
}