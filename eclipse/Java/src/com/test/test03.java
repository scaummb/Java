package com.test;

public class test03 {
	public static void main(String [] args){
		int[] a = {1,6,5,3,2,9};
		insertsort(a);
	}

	private static void insertsort(int[] a) {
		int len = a.length;
		if(len != 0){
			for(int i = 1; i<len; i++){
				int temp = a[i];
				int j = i;
				while(j>0 && a[j-1]>temp){
					a[j] = a[j-1];
					j--;					
				}
				a[j] = temp;
			}
			System.out.println("result: "+a.toString());
			for(int k : a){
				System.out.print(k+" ");
			}
		}
	}

}
