package com.code.algorithm;

public class ShellSort {
	
	public static void shellsort(int[] a){
		int len = a.length;
		int i,j;
		int h;
		int temp;
		for(h = len/2; h > 0; h = h/2){
			for(i = h;i < len;i++){
				temp = a[i];
				for(j = i - h; j >= 0; j -= h){
					if(temp < a[j]){
						a[j + h] = a[j];
					}
					else{
						break;
					}
					a[j+h] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int i = 0;
		int[] a = {5,4,26,545,9,8,7,4,3};
		int len = a.length;
		shellsort(a);
		for(i = 0; i < len; i++){
			System.out.println(a[i]);
		}
	}

}
