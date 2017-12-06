package com.colection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ListDemo6 {

	public static void main(String[] args) {
		// 创建集合对象
		List list = new ArrayList();

		// 测试功能
		list.add("hello");
		list.add("world");
		list.add("java");
		
		// 使用方法
		// ListIterator listIterator()
		ListIterator it = list.listIterator(); // 多态
		while(it.hasNext()){
			System.out.println(it.next());
			try{
				String s = (String)it.next();
				System.out.println(s);				
			}catch(NoSuchElementException e){
				e.printStackTrace();
				System.out.println("over.");
			}
		}
	}

}
