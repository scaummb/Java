package com.colection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * List集合的特有功能：
 * 		void add(int index,Object obj):在指定索引位置添加元素
 *		Object remove(int index):删除指定索引位置的元素，并把删除掉的元素值返回
 *		Object get(int index):根据给定索引，返回元素
 *		Object set(int index,E element):修改指定索引处的元素为给定的元素，并返回被修改的值
 */
public class ListDemo3 {
	public static void main(String[] args){
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		System.out.println("former list:" + list);
		
		// void add(int index,Object obj):在指定索引位置添加元素
		 list.add(1, "android");
		// list.add(3, "android");
		// list.add(4, "android"); //有问题
		
		 // Object set(int index,E element):修改指定索引处的元素为给定的元素，并返回被修改的值
		System.out.println("set:" + list.set(1, "android"));
		System.out.println("set:"+list.set(2,"mmb"));

		System.out.println("afterwods list:" + list);
		// Object remove(int index):删除指定索引位置的元素，并把删除掉的元素值返回
		System.out.println("remove:"+list.remove(2));
		System.out.println("then list:"+list);
		// Object get(int index):根据给定索引，返回元素
		System.out.println("get: "+list.get(2));
		
		test();
	}
	static void test(){
		Collection c = new ArrayList();
		c.add("1A0");
		c.add(100);
		System.out.println("------------------");
		System.out.println("c.size(): "+c.size());
		System.out.println("c.getClass()"+c.getClass());
		Iterator it = c.iterator();
		while(it.hasNext()){
			if(it.next() instanceof String){
				System.out.println("Yes");
			}
			System.out.println("it.next():"+it.next());
		}
//		for(int i =0; i < c.size();i++){
//			
//			System.out.println(c[i]);
//		}
		
	}
}
