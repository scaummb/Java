package com.java.myself;

public class DyadicArray {
	public static void main(String[] args){
		Array a = new Array();
		a.sort();
	}
}

class Array {
	public static void sort(){
		int [][] arr = {{22,66,45},{45,66,88},{55,2,33,23},{78,23,35,45}};
		int sum = 0;
		for (int i=0; i < arr.length; i++){
			for  (int j=0; j<arr[i].length; j++){
				sum += arr[i][j];
			}
		}
		System.out.println("加法结果为： "+sum);
	}
}