package com.colection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		Student s1 = new Student("mmb1",10);
		Student s2 = new Student("mmb2",20);
		Student s3 = new Student("mmb3",30);
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		
		Object[] objc = c.toArray();
		System.out.println("c"+c);
		for(int x = 0; x<objc.length;x++){
			System.out.println("objc[x]"+objc[x]);
		}
		//try again..
		Object[] objs = c.toArray();
		for (int x = 0; x < objs.length; x++) {
			Student s = (Student) objs[x];
			System.out.println(s.getName() + "---" + s.getAge());
		}
		/*
		 * wrong example
		 
		Object objc = c.toArray();
		String s = objc.toString();
		for(int x = 0; x<s.length();x++){
			System.out.println(s[x]);
		}
		
		 * */
	}

}
