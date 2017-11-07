package com.colection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator iterator()
 * 		boolean hasNext():是否有下一个元素
 * 		Object next():获取下一个元素,并自动移动到下一个位置等待
 * 
 * 		NoSuchElementException:没有这样的元素异常。
 * 		原因是：你已经获取到元素的末尾了，你还要获取元素，已经没有元素了，所以报错。
 */
public class IteratorDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		// 创建元素并添加元素
		c.add("hello");
		c.add("world");
		c.add("java");
		c.add(100);

		// 集合中的方法：Iterator iterator()
		Iterator it  = c.iterator();// 右边其实是接口的实现类对象，这是多态的应用

//		System.out.println(it.next());
//		 System.out.println(it.next());
//		 System.out.println(it.next());
		 
/*	
    	 while(it.hasNext()){
			 System.out.println(it.next());
			 
//			 String s = (String) it.next();
//			 System.out.println(s);			 
//			 s = (String) it.next();
//			 System.out.println(s);			 
//			 s = (String) it.next();
//			 System.out.println(s);
//			 int i = (int) it.next();
//			 System.out.println(i);
 
		 }*/
//			 for循环改进
			 for (Iterator itt = c.iterator(); itt.hasNext();) {
			 String s = (String) itt.next();
			 System.out.println(s);
//			 System.out.println(itt.next());
			 }
	}

}
