package com.colection.ArrayList_Vector_LinkedList;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/*
 * ���й��ܣ�
 * 		A:���Ԫ��
 * 			public void addElement(Object obj)		--		add(Object obj)
 * 		B:��ȡԪ��
 *			public Object elementAt(int index)		--		get(int index)
 *			public Enumeration elements()			--		Iterator iterator()
 *						hasMoreElements()							hasNext()
 *						nextElement()								next()
 *
 *		JDK�汾������
 *			A:��ȫ
 *			B:Ч��
 *			C:����д
 */
public class VectorDemo {
	public static void main(String [] args){
		// �������϶���
		 Collection c = new Vector();
		 List list = new Vector();
		Vector v = new Vector();
		
		v.addElement("Hello");
		v.addElement("dadf");
		v.addElement("world");
		v.addElement("java");
		
		//û��Ϊ���� List ���巽�� addElement��String������̬��addelement��Vector���еķ���		
//		list.addElement("Hello");
		list.add(0, "mmb");		
		ListIterator li = list.listIterator();
		System.out.println("li.next(): "+li.next());
		//û��Ϊ���� Collection ���巽�� addElement��String����ͬ��
//		c.addElement("dadf");
		c.add("mmb");
		Iterator it = c.iterator();
		System.out.println("it.next(): "+it.next());
		 //public Object elementAt(int index)
		 System.out.println(v.elementAt(0));
		 System.out.println(v.elementAt(1));
		 System.out.println(v.elementAt(2));
		// ��ͨfor
		 for (int x = 0; x < v.size(); x++) {
		 String s = (String) v.elementAt(x);
		 System.out.println(s);
		 }
		 System.out.println("-----------------");
		 Enumeration en = v.elements();
		 while(en.hasMoreElements()){
			 String s = (String) en.nextElement();
			 System.out.println(s);
		 }
	}

}
