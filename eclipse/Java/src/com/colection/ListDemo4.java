package com.colection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo4 {
	public static void main(String[] args){
		List list = new ArrayList();

		// ≤‚ ‘π¶ƒ‹
		list.add("hello");
		list.add("world");
		list.add("java");
		
		// get(int index)
		System.out.println(list.get(0));
				 System.out.println(list.get(1));
				 System.out.println(list.get(2));
				 try{
					 System.out.println(list.get(3)); // IndexOutOfBoundsException					 
				 }catch(IndexOutOfBoundsException e){
					 e.printStackTrace();
				 }
		for(int x=0;x<list.size();x++){
			String s =(String) list.get(x);
			System.out.println(s);
		}
	}

}
