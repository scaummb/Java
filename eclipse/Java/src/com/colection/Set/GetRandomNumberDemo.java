package com.colection.Set;

import java.util.HashSet;
import java.util.TreeSet;

/*
 * Set�������ǽ������������ࡣһ������ʹ��˭��?
 * 		Ҫ������?
 * 			Ҫ��TreeSet
 * 			��Ҫ��HashSet
 * ����Ҳ��֪���ǲ���Ҫ������HashSet��
 * 
 * ��дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ���
 * 
 * ������
 * 		A:����HashSet���ϣ��洢Integer���͵�����
 * 		B:ֱ���жϼ��ϵĳ���
 * 			С��10������������������洢
 * 		C:��������
 */
public class GetRandomNumberDemo {

	public static void main(String[] args) {
		// ����HashSet���ϣ��洢Integer���͵�����
		HashSet<Integer> hs = new HashSet<Integer>();
		
		// ֱ���жϼ��ϵĳ���
		while(hs.size() < 10){
			int number = (int) (Math.random() * 20) + 1;
			hs.add(number);
		}
//		TreeSet<Integer> a = new TreeSet<Integer>();
		//���ܴ� HashSet<Integer> ת��Ϊ TreeSet<Integer>
//		a = hs;
		System.out.println(1);
		for(Integer a : hs){
			System.out.println(a);
		}
		
	}

}
