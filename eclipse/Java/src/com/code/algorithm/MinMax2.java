package com.code.algorithm;

public class MinMax2 {
	static int Max;
	static int Min;
	
	public static void GetMaxMin(int[] arr){
		int len = arr.length;
		Max = Min = arr[0];
		for(int i = 0; i < len; i++){
			if(arr[i] > Max){
				Max = arr[i];
			}else if(arr[i] < Min){
				Min = arr[i];
			}
		}
	}

	public static void main(String[] args) {
		int[] a = {1,53,6546,67,252,444};
		GetMaxMin(a);
		System.out.println("2 Min: "+Min);
		System.out.println("2 Max: "+Max);
	}

}
