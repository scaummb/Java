package com.colection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo8 {
	public static void main(String[] args){
		// ����һ�����ϣ�����Ӷ��Ԫ��
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		// �������ϣ���ȡ��ÿһ��Ԫ��
//		 Iterator it = list.listIterator();
//		 while (it.hasNext()) {
//		 String s = (String) it.next();
//		 // �ж�Ԫ����û����"world"�ģ�����У��������������һ����Ԫ��android
//		 //  ConcurrentModificationException:�����޸��쳣,ͨ��������ȥ�������ϵ�ʱ�򣬲�����ͨ������ȥ����.	
//		 if ("world".equals(s)) {
//		 		list.add("android");
//		 		 it = list.iterator();
//		 		}
//		 System.out.println("s:"+s);
//		 }
	
			// ʹ���б������
			ListIterator lit = list.listIterator();
			while (lit.hasNext()) {
				String s = (String) lit.next();
				if ("world".equals(s)) {
					lit.add("android");
				}
			}

			// ֱ�������������
			System.out.println("list:" + list);
	}

}
