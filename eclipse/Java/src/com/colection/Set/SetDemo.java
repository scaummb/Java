package com.colection.Set;

import java.util.HashSet;
import java.util.Set;
/*
 * Collection:
 * 		List:Ԫ������(�洢��ȡ��˳��һ��)�����ظ�
 * 		Set:Ԫ������,Ψһ
 */
public class SetDemo {

	public static void main(String[] args) {
		//����ʵ�������� Set<String>
//		Set<String> set = new Set<String>();
		// �������϶���
		Set<String> set = new HashSet<String>();
		
		set.add("mmb1");
		set.add("mmb2");
		set.add("add");
		
		for(String s : set){
			System.out.println(s);
		}

	}

}
