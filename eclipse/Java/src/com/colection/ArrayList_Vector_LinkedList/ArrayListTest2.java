package com.colection.ArrayList_Vector_LinkedList;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * ȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
 * ������
 * 		hello,world,java,android,world,java,javaee,java,java,java,android
 * �����
 * 		hello,world,java,android,javaee
 * 
 * �����¼��ϵķ�ʽ��
 * 		A:���弯�ϣ��洢���ظ���Ԫ��
 * 		B:�����¼���
 * 		C:�����ɼ��ϣ���ȡ���ɼ����е�ÿһ��Ԫ��
 * 		D:�Ǿɼ��ϵ�ÿһ��Ԫ�ص��¼�����ȥ�ң�����û��
 * 			�У��Ͳ����(��������)
 * 			ľ�У������
 * 		E:�����¼���
 */
public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
		String[] a ={"dfasf","asdfgasdga","adfaf","asdgertcv","asdfgasdga","adfaf","d8f97asg84"}; 
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("android");
		list.add("world");
		list.add("java");
		list.add("javaee");
		list.add("java");
		list.add("java");
		list.add("java");
		list.add("android");
		list.add(a);
		//����������
		ListIterator it = list.listIterator();
		ListIterator it2 = list2.listIterator();
		System.out.println("list: "+list);
		for(int i =0; i<list.size();i++){
			System.out.println(list.get(i));
			try{
				String temp = (String) list.get(i); 		
				System.out.println(temp);
			}catch ( java.lang.ClassCastException e){
				e.printStackTrace();
				String[] temp = (String[]) list.get(i);
				System.out.println(temp);
			}
//			if( ! list2.contains(temp)){
//				list2.add(temp);
//			}
		}
		
		}

}
