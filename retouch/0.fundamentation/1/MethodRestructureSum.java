package com.object;

public class MethodRestructureSum {
	public static void main(String[] args){
		//需求：请写一个功能，实现两个数据的求和
		System.out.println(sum(10,20));

		//需求：请写一个功能，实现三个数据的求和
		//System.out.println(sum2(10,20,30));
		System.out.println(sum(10,20,30));

		System.out.println(sum(1.5,2.5));
		
		System.out.println(sumNest(10,20,30));
	}
	
	public static int sum(int a,int b){
		System.out.print("Int Result : "+a +"+"+b+" = ");
		return a+b;
	}
	
	public static int sum(int a,int b,int c){
		System.out.print("Int Result : "+a +"+"+b+"+"+c+ "= ");
		return a+b+c;
	}
	
	public static double sum(double a,double b){
		System.out.print("Double Result : "+a +"+"+b+ "= ");
		return a+b;
	}
	
	public static int sumNest(int a,int b,int c){
		System.out.print("Int Nest Result : "+a +"+"+b+"+"+c+ "= ");
		int result = sum((a + b),c);
		return result;
	}
	

}
