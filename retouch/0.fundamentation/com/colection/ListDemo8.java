package com.colection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo8 {
	public static void main(String[] args){
		// 创建一个集合，并添加多个元素
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		// 遍历集合，获取到每一个元素
//		 Iterator it = list.listIterator();
//		 while (it.hasNext()) {
//		 String s = (String) it.next();
//		 // 判断元素有没有是"world"的，如果有，就往集合中添加一个新元素android
//		 //  ConcurrentModificationException:并发修改异常,通过迭代器去遍历集合的时候，不能再通过集合去操作.	
//		 if ("world".equals(s)) {
//		 		list.add("android");
//		 		 it = list.iterator();
//		 		}
//		 System.out.println("s:"+s);
//		 }
	
			// 使用列表迭代器
			ListIterator lit = list.listIterator();
			while (lit.hasNext()) {
				String s = (String) lit.next();
				if ("world".equals(s)) {
					lit.add("android");
				}
			}

			// 直接输出集合名称
			System.out.println("list:" + list);
	}

}
