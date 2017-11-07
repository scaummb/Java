package com.colection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ListDemo6 {

	public static void main(String[] args) {
		// �������϶���
		List list = new ArrayList();

		// ���Թ���
		list.add("hello");
		list.add("world");
		list.add("java");
		
		// ʹ�÷���
		// ListIterator listIterator()
		ListIterator it = list.listIterator(); // ��̬
		while(it.hasNext()){
			System.out.println(it.next());
			try{
				String s = (String)it.next();
				System.out.println(s);				
			}catch(NoSuchElementException e){
				e.printStackTrace();
				System.out.println("over.");
			}
		}
	}

}
