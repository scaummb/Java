package com.code.Map.TreeMap;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		
		char[] c = s.toCharArray();
		
		// �����ַ������õ�ÿһ���ַ�
		for (char ch : c) {
			// ������ַ���Ϊ����map������ֵ
			Integer i = tm.get(ch);
			// ����null
			if (i == null) {
				// �洢
				tm.put(ch, 1);
			} else {
				// ��ֵ++�����´洢
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
		
		// ��StringBuilderת��Ϊ�ַ���
		String result = sb.toString();

		System.out.println(result);
		
	}
}
