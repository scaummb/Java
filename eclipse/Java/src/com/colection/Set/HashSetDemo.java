package com.colection.Set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// HashSet存储字符串元素
		HashSet<String> hs = new HashSet<String>();
		
		//boolean add(E e) ;如果此 set 中尚未包含指定元素，则添加指定元素。
		System.out.println(hs.add("mmb1"));
		System.out.println(hs.add("hello"));
		System.out.println(hs.add("world"));
		System.out.println(hs.add("java"));
		System.out.println(hs.add("hello"));
		
		System.out.println("hs:" + hs);

	}

}
