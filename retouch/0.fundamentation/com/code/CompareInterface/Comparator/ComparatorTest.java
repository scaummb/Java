package com.code.CompareInterface.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

import com.code.CompareInterface.ComparableInterface.Person;

public class ComparatorTest {

	public static void main(String[] args) {
		Person p1 = new Person("AA",19);
		Person p2 = new Person("aa",13);
		Person p3 = new Person("CC",13);
		Person p4 = new Person("DD",14);
		
		//不能实例化类型 List<Person>
		List<Person> list = new ArrayList<Person>();		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		ListIterator it = list.listIterator();
		System.out.println(list.size());
		while(it.hasNext()){
			Person s = new Person();
			s = (Person) it.next();
			System.out.println(s.getName()+ "---"+s.getAge());
		}
		System.out.println("------------------------");
		
		//区别与Compearable接口
		Collections.sort(list);
		for(Person p : list){
			System.out.println(p.getName()+"---"+p.getAge());
		}
	
	}

}
