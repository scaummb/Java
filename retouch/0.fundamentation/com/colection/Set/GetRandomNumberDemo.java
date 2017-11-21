package com.colection.Set;

import java.util.HashSet;
import java.util.TreeSet;

/*
 * Set集合我们讲解了两个子类。一般我们使用谁呢?
 * 		要排序吗?
 * 			要：TreeSet
 * 			不要：HashSet
 * 我们也不知道是不是要排序，用HashSet。
 * 
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 * 
 * 分析：
 * 		A:定义HashSet集合，存储Integer类型的数据
 * 		B:直接判断集合的长度
 * 			小于10，继续产生随机数，存储
 * 		C:遍历集合
 */
public class GetRandomNumberDemo {

	public static void main(String[] args) {
		// 定义HashSet集合，存储Integer类型的数据
		HashSet<Integer> hs = new HashSet<Integer>();
		
		// 直接判断集合的长度
		while(hs.size() < 10){
			int number = (int) (Math.random() * 20) + 1;
			hs.add(number);
		}
//		TreeSet<Integer> a = new TreeSet<Integer>();
		//不能从 HashSet<Integer> 转换为 TreeSet<Integer>
//		a = hs;
		System.out.println(1);
		for(Integer a : hs){
			System.out.println(a);
		}
		
	}

}
