package com.colection.ArrayList_Vector_LinkedList;

import java.util.LinkedList;

/*
 * LinkedList�����й��ܣ�
 * 		A:��ӹ���
 * 			void addFirst()
 * 			void addLast()
 * 		B:�Ƴ�����
 * 			Object removeFirst()
 * 			Object removeLast()
 * 		C:��ȡ����
 * 			Object getFirst()
 * 			Object getLast()
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList();
		link.add("hello");
		link.add("world");
		link.add("java");	
		link.add("��ҹ");
		System.out.println(link);
		// void addFirst()
		// void addLast()
		link.addFirst("first");
		link.addLast("last");
		System.out.println(link);
		// Object removeFirst()
		// Object removeLast()
		System.out.println("removeFirst:" + link.removeFirst());
		System.out.println("removeFirst:" + link.removeLast());
		System.out.println(link);
		// Object getFirst()
		// Object getLast()
		System.out.println("getFirst:" + link.getFirst());
		System.out.println("getLast:" + link.getLast());
		System.out.println(link);

	}

}
