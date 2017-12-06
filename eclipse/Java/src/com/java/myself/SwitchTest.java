package com.java.myself;

import java.util.Scanner;

class SwitchDemo{
	public static void switchdemo(String a){
		System.out.println("Java seven support String");
		switch(a){
		case "a":System.out.println("a");break;
		default : System.out.println("else string");
		}
	}
	public  void switchdemo(int a){
		switch(a){
		case 1:System.out.println("1");break;
		case 2:System.out.println("2");break;
		default: System.out.println("else number");
		}
	}
}

public class SwitchTest {
	private static int k = 1;

	public static void main(String[] args) {
		
		//why?
		if(Integer(k)  instanceof Integer){
			System.out.println("k  instanceof Integer:true");
		}else{
			System.out.println("k  instanceof Integer:false");
			assert 1+2 ==2:"k  instanceof Integer:false";
		}
		
		SwitchDemo s = new SwitchDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("please input a string");
		if (sc.hasNext()){
			String ss = sc.next();			
			s.switchdemo(ss);	
			if (ss instanceof String){
			System.out.println("ss instanceof Spring:true");
		}
			System.out.println("please input an integer");
			int sss =sc.nextInt();
			s.switchdemo(sss);
		}else{
			System.out.println("Go on..");
		}
		// instanceof 用法
		if (s instanceof SwitchDemo){
			System.out.println("s instanceof SwitchDemo:true");
		}


	}

	private static Integer Integer(int k2) {
		// TODO 自动生成的方法存根
		return null;
	}

}
