package com.colection.ArrayList_Vector_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListDemoTest {

	public static void main(String[] args) {
		// 创建集合对象
		 LinkedList link = new LinkedList();
		 // 添加元素
		 link.addFirst("hello");
		 link.addFirst("world");
		 link.addFirst("java");
		 Iterator it = link.iterator();
		 while (it.hasNext()) {
		 String s = (String) it.next();
		 System.out.println(s);
		 }
		 
		System.out.println("----------");
		
		MyStack my = new MyStack();
		
		//添加元素
		my.add("hello");
		my.add("world");
		my.add("java");
		//获取
		try{
			System.out.println(my.gete());
			System.out.println(my.gete());
			System.out.println(my.gete());
			System.out.println(my.gete());			
		}catch( java.util.NoSuchElementException e){
			System.out.println("null");
		}
		
		while(!my.isEmpty()){
			System.out.println(my.gete());
		}
	
	}

}
