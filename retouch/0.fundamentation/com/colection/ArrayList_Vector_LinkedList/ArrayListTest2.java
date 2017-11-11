package com.colection.ArrayList_Vector_LinkedList;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * 去除集合中字符串的重复值(字符串的内容相同)
 * 举例：
 * 		hello,world,java,android,world,java,javaee,java,java,java,android
 * 结果：
 * 		hello,world,java,android,javaee
 * 
 * 创建新集合的方式：
 * 		A:定义集合，存储带重复的元素
 * 		B:创建新集合
 * 		C:遍历旧集合，获取到旧集合中的每一个元素
 * 		D:那旧集合的每一个元素到新集合中去找，看有没有
 * 			有：就不添加(不搭理它)
 * 			木有：就添加
 * 		E:遍历新集合
 */
public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
		String[] a ={"dfasf","asdfgasdga","adfaf","asdgertcv","asdfgasdga","adfaf","d8f97asg84"}; 
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("android");
		list.add("world");
		list.add("java");
		list.add("javaee");
		list.add("java");
		list.add("java");
		list.add("java");
		list.add("android");
		list.add(a);
		//两个迭代器
		ListIterator it = list.listIterator();
		ListIterator it2 = list2.listIterator();
		System.out.println("list: "+list);
		for(int i =0; i<list.size();i++){
			System.out.println(list.get(i));
			try{
				String temp = (String) list.get(i); 		
				System.out.println(temp);
			}catch ( java.lang.ClassCastException e){
				e.printStackTrace();
				String[] temp = (String[]) list.get(i);
				System.out.println(temp);
			}
//			if( ! list2.contains(temp)){
//				list2.add(temp);
//			}
		}
		
		}

}
