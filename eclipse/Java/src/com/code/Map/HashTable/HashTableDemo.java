package com.code.Map.HashTable;

/*
 * �����⣺
 * 1:HashMap��Hashtable������?
 * A:HashMap���̲߳���ȫ�ģ�Ч�ʸߡ�����ʹ�� null ֵ�� null ����
 * B:Hashtable���̰߳�ȫ�ģ�Ч�ʵ͡�������ʹ�� null ֵ�� null ����
 * 
 * 2:List,Set,Map�Ƚӿ��Ƿ񶼼̳���Map�ӿ�
 * List,Set���̳���Collection�ӿڡ�
 * Map������Ƕ���ӿ�
 * 
 * 3:�㳣���ļ���������Щ������ʲô����?
 * 		Collection
 * 			|--List
 * 				|--ArrayList
 * 				|--Vector
 * 				|--LinkedList
 * 			|--Set
 * 				|--HashSet
 * 					|--LinkedHashSet
 * 				|--TreeSet
 * 		Map
 * 			|--HashMap
 * 				|--LinkedHashMap
 * 			|--Hashtable
 * 			|--TreeMap
 * 
 * 		ArrayList
 * 			��ӹ��ܣ��Ƴ����ܣ��жϹ��ܣ���ȡ������
 * 		HashSet
 * 			��ӹ��ܣ��Ƴ����ܣ��жϹ��ܣ���ȡ������
 * 		HashMap
 * 			��ӹ��ܣ��Ƴ����ܣ��жϹ��ܣ���ȡ������
 */
import java.util.Hashtable;

public class HashTableDemo{
	public static void main(String[] args){
		// HashMap<String, String> hm = new HashMap<String, String>();
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(1,"��С��");
		System.out.println("1"+ht);
		ht.put(2,"������");
		System.out.println("2"+ht);
		System.out.println(ht.put(2, "����"));
		System.out.println("3"+ht);
		System.out.println("----------");
		for(int i = 0; i < 10; i++){
			System.out.println(ht.get(i)); 
		}
		
	}
}