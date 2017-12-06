package com.colection.ArrayList_Vector_LinkedList;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/*
 * 特有功能：
 * 		A:添加元素
 * 			public void addElement(Object obj)		--		add(Object obj)
 * 		B:获取元素
 *			public Object elementAt(int index)		--		get(int index)
 *			public Enumeration elements()			--		Iterator iterator()
 *						hasMoreElements()							hasNext()
 *						nextElement()								next()
 *
 *		JDK版本升级：
 *			A:安全
 *			B:效率
 *			C:简化书写
 */
public class VectorDemo {
	public static void main(String [] args){
		// 创建集合对象
		 Collection c = new Vector();
		 List list = new Vector();
		Vector v = new Vector();
		
		v.addElement("Hello");
		v.addElement("dadf");
		v.addElement("world");
		v.addElement("java");
		
		//没有为类型 List 定义方法 addElement（String），多态，addelement是Vector独有的方法		
//		list.addElement("Hello");
		list.add(0, "mmb");		
		ListIterator li = list.listIterator();
		System.out.println("li.next(): "+li.next());
		//没有为类型 Collection 定义方法 addElement（String），同理
//		c.addElement("dadf");
		c.add("mmb");
		Iterator it = c.iterator();
		System.out.println("it.next(): "+it.next());
		 //public Object elementAt(int index)
		 System.out.println(v.elementAt(0));
		 System.out.println(v.elementAt(1));
		 System.out.println(v.elementAt(2));
		// 普通for
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
