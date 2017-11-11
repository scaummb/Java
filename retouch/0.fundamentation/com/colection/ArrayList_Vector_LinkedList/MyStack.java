package com.colection.ArrayList_Vector_LinkedList;

import java.util.LinkedList;

/*
 * 定义自己的集合类
 */
public class MyStack {
	private LinkedList link;
	
	public MyStack(){
		link = new LinkedList();
	}
	
	public void add(Object obj){
		link.addFirst(obj);
	}
	
	public Object gete(){
		return  link.removeFirst();
	}
	
	public boolean isEmpty(){
		return link.isEmpty();
	}

}
