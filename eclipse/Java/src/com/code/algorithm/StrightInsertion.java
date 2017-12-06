package com.code.algorithm;

import java.util.Arrays;

/*
 * 下面是两个例子：直接插入StrightInsertionSort定义在另一个类里面，另一种插入排序方法则是定义在同一个类中
 * */

public class StrightInsertion {
	int k ;
	public static void main(String[] args){
		int[] arr = {12,15,13,46,55,1,5,3};
//		StrightInsertionSort  sis = new StrightInsertionSort();
//		sis.strightinsertion(arr);
//		System.out.println("********");
//		strightinsertion(arr);
		StrightInsertionSort si = new StrightInsertionSort();
		int i = 0;
		int n = arr.length;
		si.strightInsertion(arr);
		try{
			while(i++ < n){
				System.out.print(arr[i]+" ");
			}
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("end.");
		}
	}

	public void a(){}
	public static void strightinsertion(int [] arr){
		int tmp ;
		//不能对非静态字段 k 进行静态引用
//		k = 10;
		//不能对类型 StrightInsertion 中的非静态方法 a（）进行静态引用
//		a();
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
	public final void strightInsertion(int [] arr){
		if( arr != null){
			int n = arr.length;
			for(int i=1; i < n; i++){
				int temp = arr[i] ;
				int j = i;
				if (arr[j-1] > temp){
					while(j > 0 && arr[j-1] > temp){
						arr[j] = arr[j -1];
						j--;
					}
				}
				arr[j] = temp;
			}			
		}
	}
	
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
	
	public void strightinsertion2(int [] arr){
		for(int i = 1;i<arr.length;i++){
			int j = i-1;//previous
			int temp = arr[i];//latter
//			while(j>=0 && arr[j]>temp){
//				arr[j+1] = arr[j];//if the previous bigger than the latter
//				j--;
//			}
			for(;j>=0;j--){
				//if the previous bigger than the latter
				if(arr[j]>temp){
					arr[j] = temp;
				}
			}
			
		}
	}
	
}