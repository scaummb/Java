package com.colection.Set;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// HashSet�洢�ַ���Ԫ��
		HashSet<Person> hs = new HashSet<Person>();
		// ����Ԫ�ض���
		Person p1 = new Person("������", 30);
		Person p2 = new Person("���ɹ�", 26);
		Person p3 = new Person("�ܹ���", 25);
		Person p4 = new Person("������", 35);
		Person p5 = new Person("�Ź���", 33);
		Person p6 = new Person("���ɺ�", 22);
		Person p7 = new Person("���ɹ�", 22);
		Person p8 = new Person("������", 199);
		
		// ��Ԫ����ӵ�����
		hs.add(p1);
		// hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		hs.add(p5);
		hs.add(p6);
		hs.add(p7);
		hs.add(p8);

		for(Person a:hs){
			System.out.println(a.hashCode());
			System.out.println(a.getName()+"---"+a.getAge());
		}

	}

}
