package com.code.Map.HashTable;

/*
 * 面试题：
 * 1:HashMap和Hashtable的区别?
 * A:HashMap是线程不安全的，效率高。允许使用 null 值和 null 键。
 * B:Hashtable是线程安全的，效率低。不允许使用 null 值和 null 键。
 * 
 * 2:List,Set,Map等接口是否都继承自Map接口
 * List,Set都继承自Collection接口。
 * Map本身就是顶层接口
 * 
 * 3:你常见的集合类有哪些，都有什么方法?
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
 * 			添加功能，移除功能，判断功能，获取，长度
 * 		HashSet
 * 			添加功能，移除功能，判断功能，获取，长度
 * 		HashMap
 * 			添加功能，移除功能，判断功能，获取，长度
 */
import java.util.Hashtable;

public class HashTableDemo{
	public static void main(String[] args){
		// HashMap<String, String> hm = new HashMap<String, String>();
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(1,"周小琴");
		System.out.println("1"+ht);
		ht.put(2,"特兰普");
		System.out.println("2"+ht);
		System.out.println(ht.put(2, "特里"));
		System.out.println("3"+ht);
		System.out.println("----------");
		for(int i = 0; i < 10; i++){
			System.out.println(ht.get(i)); 
		}
		
	}
}