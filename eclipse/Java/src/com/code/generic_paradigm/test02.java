package com.code.generic_paradigm;
//ArrayList<String> a  ; ArrayList  b
import java.util.ArrayList;

public class test02 {
	public static void main(String[] args){
		ArrayList<String> a = new ArrayList<String>();  
		ArrayList  b = new ArrayList();  
		Class c1 = a.getClass();  
		Class c2 = b.getClass();  
		System.out.println(c1.getClass().getName());
		System.out.println(c2.getClass().getName());
		System.out.println(c1 == c2); //true  
	}
}
