package com.java.myself;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
	int a ;
	public static void main(String[] args){
		int[] arr = {1,2,3,4,6,5,7,8};
		String[] strarray = {"","����һ","���ڶ�","������","������","������","������","������"};
		
		String string = Arrays.toString(arr);
		System.out.println(string);
		printArray(strarray);
		
		//���
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input num(1-7): ");
		int index = sc.nextInt();
		System.out.println("Your searching date is: "+ strarray[index]);
		
//		printArray(arr);
//		getMax(arr);
//		reverse(arr);
		int index1 = indexOfArray(arr,8);
		System.out.println(index1);
	}
//	public static void printArray(String[] arr) {
	public static  void printArray(String[] arr) {	
		System.out.print("[");
/*    ����ʹ��this��super
		super.a = 0;
		this.a = 0;
 * */	
/*
		���ܶԷǾ�̬�ֶ� a ���о�̬����
		a = 100;
*/
		for (int i=0; i<arr.length; i++) {
			if (i <= arr.length-1) {
				System.out.print(arr[i] +", ");
			}
			System.out.print(arr[i]);
		}
		//Java5 �����ԣ�foreach ѭ��
/*		for (String i : arr){
			System.out.print("88");
			System.out.println(i + ",");
		}*/
		System.out.println("]");
	}

	//��ֵ
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void reverse(int[] arr){
		for (int start=0,end=arr.length-1; start<=end; start++,end--){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		int i = 0;
		while(i<arr.length){
			System.out.println(arr[i]);
			i++;
		}
	}
	public static int indexOfArray (int[] arr,int key){
		int index = -1;
		for (int i=0; i<arr.length; i++){
				if (arr[i] == key){
					index = i;
				}
		}
		return index;
	}
	
}


