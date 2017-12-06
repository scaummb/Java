package com.colection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Object[] toArray():把集合转成对象数组
 * 
 * 练习：用集合存储三个学生对象，并遍历。
 */
public class CollectionDemo3 {

	public static void main(String[] args) {
		Collection c = new ArrayList();

		// 往集合中添加元素
		 String s = "hello1";
		c.add("hello");
		c.add("world");
		c.add("java");
		c.add(s);
		
		System.out.println(c);

		// Object[] toArray():把集合转成对象数组
		Object[] objs = c.toArray();
		for(int x=0; x<objs.length;x++){
			 System.out.println(objs[x]);
//			String ss = (String) objs[x];
//			System.out.println(ss);
		}

	}

}
