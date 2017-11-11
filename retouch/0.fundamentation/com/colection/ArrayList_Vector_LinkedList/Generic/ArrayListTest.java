package com.colection.ArrayList_Vector_LinkedList.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();
		
		Student s1 = new Student("mmb",10);
		Student s2 = new Student("mmb2",20);
		Student s3 = new Student("mmb3",30);
		Student s4 = new Student("mmb4",40);
		
		
		Student ss1 = new Student("马苏", 18);
		Student ss2 = new Student("佟丽娅", 20);
		Student ss3 = new Student("王大锤", 19);
		Student ss4 = new Student("罗三炮", 21);
		
		// 添加元素
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);		
		array.add(ss1);
		array.add(ss2);
		array.add(ss3);
		array.add(ss4);
//		Iterator<Student> it = array.listIterator();
		Iterator<Student> it = array.iterator();
		while(it.hasNext()){
			Student ss = (Student) it.next();
			System.out.println(ss.getName()+"---"+ss.getAge());
		}
		System.out.println("------------------");

		for (int x = 0; x < array.size(); x++) {
			Student s = array.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}
		
	}
	 
}
