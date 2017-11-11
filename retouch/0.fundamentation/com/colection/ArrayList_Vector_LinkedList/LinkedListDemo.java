package com.colection.ArrayList_Vector_LinkedList;

import java.util.LinkedList;

/*
 * LinkedList的特有功能：
 * 		A:添加功能
 * 			void addFirst()
 * 			void addLast()
 * 		B:移除功能
 * 			Object removeFirst()
 * 			Object removeLast()
 * 		C:获取功能
 * 			Object getFirst()
 * 			Object getLast()
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList();
		link.add("hello");
		link.add("world");
		link.add("java");	
		link.add("白夜");
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
