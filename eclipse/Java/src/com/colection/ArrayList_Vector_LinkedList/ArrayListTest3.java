package com.colection.ArrayList_Vector_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest3 {

	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("android");
		array.add("world");
		array.add("java");
		array.add("javaee");
		array.add("java");
		array.add("java");
		array.add("java");
		array.add("android");
		for(int i=0; i<array.size(); i++){
			for(int y=i+1; y<array.size();y++){
				if(array.get(i).equals(array.get(y))){
					array.remove(y);
				}
			}
		}
		
		// ±éÀú¼¯ºÏ
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}

}
