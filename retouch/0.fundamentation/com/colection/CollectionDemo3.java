package com.colection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Object[] toArray():�Ѽ���ת�ɶ�������
 * 
 * ��ϰ���ü��ϴ洢����ѧ�����󣬲�������
 */
public class CollectionDemo3 {

	public static void main(String[] args) {
		Collection c = new ArrayList();

		// �����������Ԫ��
		 String s = "hello1";
		c.add("hello");
		c.add("world");
		c.add("java");
		c.add(s);
		
		System.out.println(c);

		// Object[] toArray():�Ѽ���ת�ɶ�������
		Object[] objs = c.toArray();
		for(int x=0; x<objs.length;x++){
			 System.out.println(objs[x]);
//			String ss = (String) objs[x];
//			System.out.println(ss);
		}

	}

}
