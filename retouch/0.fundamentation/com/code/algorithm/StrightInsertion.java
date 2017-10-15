package com.code.algorithm;

import java.util.Arrays;

/*
 * 下面是两个例子：直接插入StrightInsertionSort定义在另一个类里面，另一种插入排序方法则是定义在同一个类中
 * */

public class StrightInsertion {
	public static void main(String[] args){
		int[] arr = {12,15,13,46,55,1,5,3};
		StrightInsertionSort  sis = new StrightInsertionSort();
		sis.strightinsertion(arr);
		System.out.println("********");
		strightinsertion(arr);
		
	}
	
	public static void strightinsertion(int [] arr){
		int tmp ;
		for (int i=1; i<arr.length; i++){
			for(int j=i; j>0; j--){
				if (arr[j]<arr[j-1]){
					tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}

class StrightInsertionSort{
	public void strightinsertion(int [] arr){
		for (int i=1; i<arr.length; i++){
			int j,temp;
			temp = arr[i];
			j = i-1;
			while (j>=0 && arr[j]>temp){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}