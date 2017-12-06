package com.colection.Set;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// HashSet存储字符串元素
		HashSet<Person> hs = new HashSet<Person>();
		// 创建元素对象
		Person p1 = new Person("吕洞宾", 30);
		Person p2 = new Person("何仙姑", 26);
		Person p3 = new Person("曹国舅", 25);
		Person p4 = new Person("铁拐李", 35);
		Person p5 = new Person("张果老", 33);
		Person p6 = new Person("蓝采和", 22);
		Person p7 = new Person("何仙姑", 22);
		Person p8 = new Person("铁拐李", 199);
		
		// 把元素添加到集合
		hs.add(p1);
		// hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		hs.add(p5);
		hs.add(p6);
		hs.add(p7);
		hs.add(p8);

		for(Person a:hs){
			System.out.println(a.hashCode());
			System.out.println(a.getName()+"---"+a.getAge());
		}

	}

}
