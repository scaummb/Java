package com.rightshift;

public class RightShift {

	public static void main(String[] args) {
		System.out.println("****************************");
		int i = 4;
		System.out.println("-----int >> : " + i);
		System.out.println("移位前的二进制："+ Integer.toBinaryString(i));
		i >>= 1;
		System.out.println("移位后的二进制："+Integer.toBinaryString(i));
		System.out.println("-----int >> :"+i);
		System.out.println("****************************");
		
		i = -4;
		System.out.println("-----int >>> : " + i);
		System.out.println("移位前的二进制："+ Integer.toBinaryString(i));
		i >>>=1;
		System.out.println("移位后的二进制："+Integer.toBinaryString(i));
		System.out.println("-----int >>> :"+i);
		System.out.println("****************************");
		
		short j = -4;
		System.out.println("-----int >>> : " + j);
		System.out.println("移位前的二进制："+ Integer.toBinaryString(j));
		j >>>=1;
		System.out.println("移位后的二进制："+Integer.toBinaryString(j));
		System.out.println("-----int >>> :"+j);
		System.out.println("****************************");
		
		i = 5;
		System.out.println("-----int >> : " + i);
		System.out.println("移位前的二进制："+ Integer.toBinaryString(i));
		//右移位数不能超过32bit，因此采用了取余的操作：a>>n == a>>(n%32)
		i >>= 32; 
		System.out.println("移位后的二进制："+Integer.toBinaryString(i));
		System.out.println("-----int >> :"+i);
		System.out.println("****************************");
		

	}

}
