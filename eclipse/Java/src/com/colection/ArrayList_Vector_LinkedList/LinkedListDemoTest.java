package com.colection.ArrayList_Vector_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListDemoTest {

	public static void main(String[] args) {
		// �������϶���
		 LinkedList link = new LinkedList();
		 // ���Ԫ��
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
		
		//���Ԫ��
		my.add("hello");
		my.add("world");
		my.add("java");
		//��ȡ
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
