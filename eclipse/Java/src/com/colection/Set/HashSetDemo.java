package com.colection.Set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// HashSet�洢�ַ���Ԫ��
		HashSet<String> hs = new HashSet<String>();
		
		//boolean add(E e) ;����� set ����δ����ָ��Ԫ�أ������ָ��Ԫ�ء�
		System.out.println(hs.add("mmb1"));
		System.out.println(hs.add("hello"));
		System.out.println(hs.add("world"));
		System.out.println(hs.add("java"));
		System.out.println(hs.add("hello"));
		
		System.out.println("hs:" + hs);

	}

}
