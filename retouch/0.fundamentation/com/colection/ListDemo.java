package com.colection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Collection
 *	 	List:Ԫ������(�洢˳���ȡ��˳��һ��),Ԫ�ؿ��ظ���
 *		Set:Ԫ������,Ԫ��Ψһ
 * ������List���ϴ洢�ַ�����������
 */
public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		List list2 = new ArrayList();
		
		
		// ���������Ԫ��
		list.add("�����");
		list.add("˾��ܲ");
		list.add("�ܲ�");
		
		list2.add(111);
		list2.add(1444);
		list2.add(99);
		
		Iterator it = list.iterator();
//		Iterator it2 = list2.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		for(Iterator it2 = list2.iterator();it2.hasNext();){
			System.out.println(it2.next());
		}

	}

}
