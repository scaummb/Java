package com.code.algorithm;

public class NarcissusNumber {
	public static void main(String[] args){
		System.out.println("start 1");
		NarcissusNumberPrint narcissusnumber = new NarcissusNumberPrint();
		narcissusnumber.demo(1);
		System.out.println("end 2");
//		narcissusnumber.demo("1");
//		System.out.println("end 4");
	}

}

class NarcissusNumberPrint{
	public static void demo(String x){
		System.out.println("2");
		double b1,b2,b3,sum;
		int count=0;
	    for (int m=101;m<1000;m++){
		    b1 = m%10;	 //��λ
	        b2 = (m/10)%10;//ʮλ
		    b3 = m/100;//��λ
	    	sum = (Math.pow(b1, 3) + Math.pow(b2, 3) + Math.pow(b3, 3));
		    if (sum == m){
		    	count++;
		    	System.out.println("�� "+count+" ��ˮ�ɻ�����"+m);
		    }
	    }
	}
	
	public static void demo(int x){
		int b1,b2,b3,sum;
		int count =0;
		for(int m = 101;m<1000;m++){
//		for (int m=101;m<1000;m++){
		    b1 = m%10;	 //��λ
	        b2 = (m/10)%10;//ʮλ
		    b3 = m/100;//��λ
//		    int aa1 = b3*b3*b3;
//		    int aa2 = b2*b2*b2;
//		    int aa3 = b1*b1*b1 ;
		    sum = (b3*b3*b3+b2*b2*b2+b1*b1*b1);
//		    System.out.println("b1 "+b1);
//		    System.out.println("b2 "+b2);
//		    System.out.println("b3 " + b3);
//		    System.out.println("aa1 "+aa1);
//		    System.out.println("aa2 "+aa2);
//		    System.out.println("aa3 "+aa3);
//		    System.out.println("sum "+sum);
//		    System.out.println(sum);
		    if (sum == m){
		    	count++;
		    	System.out.println("�� "+count+" ��ˮ�ɻ�����"+m);
		    }			
		}
	}

}