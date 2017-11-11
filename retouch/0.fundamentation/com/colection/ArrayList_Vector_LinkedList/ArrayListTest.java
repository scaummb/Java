package com.colection.ArrayList_Vector_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求：存储三个学生对象，并遍历。用两种方式遍历
 * 
 * 练习：
 * 		Vector和LinkedList。
 * 		存储字符串并遍历
 * 		存储自定义对象并遍历
 */
public class ArrayListTest {
	public static void main(String [] args ){
		
	
	// 创建集合对象
	ArrayList array = new ArrayList();
	Student s1 = new Student("朱元璋",80);
	Student s2 = new Student("李世民",80);

	Student s3 = new Student("秦始皇", 40);
	// 把元素添加到集合
	array.add(s1);
	array.add(s2);
	array.add(s3);
	// 遍历集合
	Iterator it = array.iterator();
	while (it.hasNext()) {
		Student s = (Student) it.next();
		System.out.println(s.getName() + "---" + s.getAge());
	}
	System.out.println("-----------------");
	
	for (int x = 0; x < array.size(); x++) {
		Student s = (Student) array.get(x);
		System.out.println(s.getName() + "---" + s.getAge());
	}
}
	}
