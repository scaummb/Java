package com.code.algorithm;
/*
 * 2的n次方检测：二进制数为0001向左移位。
 * */
public class PowerTwo {

	public static void main(String[] args) {
		System.out.println(isPower(4));
		System.out.println(isPower(6));
		
		System.out.println(isPower2(8));
		System.out.println(isPower2(16));
	}
	
	public static boolean isPower(int n){
		if(n<0){
			return false;
		}	
		int i =1;
		while(i <= n){
			if(i == n){
				return true;
			}
			i <<= 1;			
		}
		return false;
	}
	
	public static boolean isPower2(int j){
		if(j<1) return false;
		int m = j & (j-1);
		return m==0;
	}
}
