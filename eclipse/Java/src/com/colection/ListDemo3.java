package com.colection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * List���ϵ����й��ܣ�
 * 		void add(int index,Object obj):��ָ������λ�����Ԫ��
 *		Object remove(int index):ɾ��ָ������λ�õ�Ԫ�أ�����ɾ������Ԫ��ֵ����
 *		Object get(int index):���ݸ�������������Ԫ��
 *		Object set(int index,E element):�޸�ָ����������Ԫ��Ϊ������Ԫ�أ������ر��޸ĵ�ֵ
 */
public class ListDemo3 {
	public static void main(String[] args){
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		System.out.println("former list:" + list);
		
		// void add(int index,Object obj):��ָ������λ�����Ԫ��
		 list.add(1, "android");
		// list.add(3, "android");
		// list.add(4, "android"); //������
		
		 // Object set(int index,E element):�޸�ָ����������Ԫ��Ϊ������Ԫ�أ������ر��޸ĵ�ֵ
		System.out.println("set:" + list.set(1, "android"));
		System.out.println("set:"+list.set(2,"mmb"));

		System.out.println("afterwods list:" + list);
		// Object remove(int index):ɾ��ָ������λ�õ�Ԫ�أ�����ɾ������Ԫ��ֵ����
		System.out.println("remove:"+list.remove(2));
		System.out.println("then list:"+list);
		// Object get(int index):���ݸ�������������Ԫ��
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
