package com.colection.ArrayList_Vector_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
/*
 * List:
 * 		ArrayList:
 * 			底层数据结构是数组，查询快，增删慢
 * 			线程不安全，效率高
 * 		Vector:
 * 			底层数据结构是数组，查询快，增删慢
 * 			线程安全，效率低
 * 		LinkedList:
 * 			底层数据结构是链表，查询慢，增删快
 * 			线程不安全，效率高
 * 
 * 面试题：ArrayList，Vector和LinkedList的各自特点?
 * 
 * 思考题：ArrayList，Vector和LinkedList我们到底使用谁呢?
 * 			看情况
 * 			
 * 			要安全吗?
 * 				要：Vector(这个现在也不常用，在Collections里面有新的方式)
 * 				不要：ArrayList和LinkedList
 * 					查询多：ArrayList
 * 					增删多：LinkedList
 * 
 * 		不知道用哪个，就用ArrayList。
 * 
 * 需求：用ArrayList存储字符串并遍历
 */
public class ArrayListDemoi {
	public static void main(String [] args){
		ArrayList<String> arr = new ArrayList();
		ArrayList ss = new ArrayList();
		arr.add("Hello");
		arr.add("world");
		arr.add("java");
		ss.add("mmb");
		//Error:arr has been dedicated to store String partern
		//类型 ArrayList<String> 中的方法 add（int, String）对于参数（int）不适用
//		arr.add(1000);
		
		//Iterator
		Iterator it = arr.iterator();
		while(it.hasNext()){
			String s = (String) it.next();
			System.out.println(s);
		}
		System.out.println("-----------");
		
		//for
		for(int i=0;i<arr.size();i++){
			String s = arr.get(i);
			System.out.println(s);
		}
		System.out.println("-----------");
		System.out.println(ss);
		
	}

}
