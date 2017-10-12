package com.code.algorithm;
import java.lang.Math;

public class NarcissusNumber {
	public static void main(String[] args){
		System.out.println("1");
		NarcissusNumberPrint narcissusnumber = new NarcissusNumberPrint();
		narcissusnumber.demo(1);
		System.out.println("end 2");
		narcissusnumber.demo("1");
		System.out.println("end 4");
	}

}

class NarcissusNumberPrint{
	public static void demo(String x){
		System.out.println("2");
		double b1,b2,b3,sum;
		int count=0;
	    for (int m=101;m<1000;m++){
		    b1 = m%10;	 //个位
	        b2 = (m/10)%10;//十位
		    b3 = m/100;//百位
	    	sum = (Math.pow(b1, 3) + Math.pow(b2, 3) + Math.pow(b3, 3));
		    if (sum == m){
		    	count++;
		    	System.out.println("第 "+count+" 个水仙花数："+m);
		    }
	    }
	}
	
	public static void demo(int x){
		System.out.println("4");
		int b1,b2,b3;
		for (int m=101;m<1000;m++){
//			b3 = m/100;
//			b2 = m%100/10;
//			b1 = m%10;
		    b1 = m%10;	 //个位
	        b2 = (m/10)%10;//十位
		    b3 = m/100;//百位
//		    int sum = (b3*b3*b3+b2*b2*b2*+b1*b1*b1 );
//		    System.out.println(sum);
//			if( sum == m){
		    if((Math.pow(b1, 3) + Math.pow(b2, 3) + Math.pow(b3, 3)) == m){
				System.out.println(b1+b2+b3);
				System.out.println(m+"is a narcissusnumber");
			}
		}
	}

}