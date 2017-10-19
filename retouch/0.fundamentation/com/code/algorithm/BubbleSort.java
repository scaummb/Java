package com.code.algorithm;

import java.lang.reflect.Array;

public class BubbleSort {
	public static void main(String[] args){
		int[] a = {88,66,999,45,22,1,35,68,88,44,11,99,85,253,44,56};
		System.out.println("The original array is: "+a);
//		Array.toString(a);
		for(int n: a){
			System.out.print(n+" ");
		}
		Bubble bubble = new Bubble();
		a = bubble.sort(a);
		System.out.println("The subsequent array is:"+a);
		for(int n: a){
			System.out.print(n+" ");
		}				
	}

}

class Bubble{
	public static int[] sort(int[] arr){
		int temp = 0;
		for (int a=0; a<arr.length; a++){
			for (int b=1; b<arr.length-a; b++){
				if (arr[b-1] > arr[b]){
					temp = arr[b-1];
					arr[b-1] = arr[b];
					arr[b] = temp;
				}
			}
		}
		for (int a=0; a<arr.length; a++){
			System.out.println("序列的第"+a+"元素是："+arr[a]);
		}
		System.out.println("foreach..");
		for(int i : arr){
			System.out.print(i+",");
		}
//		System.out.println("");
		System.out.println("\nforeach over..");
		return arr;
	}
}