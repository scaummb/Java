package com.code.Map.TreeMap;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		
		char[] c = s.toCharArray();
		
		// 遍历字符串，得到每一个字符
		for (char ch : c) {
			// 拿这个字符作为键到map里面找值
			Integer i = tm.get(ch);
			// 返回null
			if (i == null) {
				// 存储
				tm.put(ch, 1);
			} else {
				// 把值++，重新存储
				i++;
				tm.put(ch, i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		Set<Character> set = tm.keySet();
		for(Character key : set){
			Integer value = tm.get(key);
			sb.append(key).append("(").append(value).append(")");
		}
		
		// 把StringBuilder转换为字符串
		String result = sb.toString();

		System.out.println(result);
		
	}
}
