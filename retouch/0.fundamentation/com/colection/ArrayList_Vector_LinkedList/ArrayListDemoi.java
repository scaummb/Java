package com.colection.ArrayList_Vector_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
/*
 * List:
 * 		ArrayList:
 * 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
 * 			�̲߳���ȫ��Ч�ʸ�
 * 		Vector:
 * 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ��
 * 			�̰߳�ȫ��Ч�ʵ�
 * 		LinkedList:
 * 			�ײ����ݽṹ��������ѯ������ɾ��
 * 			�̲߳���ȫ��Ч�ʸ�
 * 
 * �����⣺ArrayList��Vector��LinkedList�ĸ����ص�?
 * 
 * ˼���⣺ArrayList��Vector��LinkedList���ǵ���ʹ��˭��?
 * 			�����
 * 			
 * 			Ҫ��ȫ��?
 * 				Ҫ��Vector(�������Ҳ�����ã���Collections�������µķ�ʽ)
 * 				��Ҫ��ArrayList��LinkedList
 * 					��ѯ�ࣺArrayList
 * 					��ɾ�ࣺLinkedList
 * 
 * 		��֪�����ĸ�������ArrayList��
 * 
 * ������ArrayList�洢�ַ���������
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
		//���� ArrayList<String> �еķ��� add��int, String�����ڲ�����int��������
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
