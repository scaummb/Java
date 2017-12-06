package com.colection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Collection
 *	 	List:元素有序(存储顺序和取出顺序一致),元素可重复。
 *		Set:元素无序,元素唯一
 * 需求：用List集合存储字符串并遍历。
 */
public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		List list2 = new ArrayList();
		
		
		// 创建并添加元素
		list.add("诸葛亮");
		list.add("司马懿");
		list.add("曹操");
		
		list2.add(111);
		list2.add(1444);
		list2.add(99);
		
		Iterator it = list.iterator();
//		Iterator it2 = list2.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		for(Iterator it2 = list2.iterator();it2.hasNext();){
			System.out.println(it2.next());
		}

	}

}
