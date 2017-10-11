package com.java.myself;
import java.util.Scanner;

public class One_Dimensional_Array {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		System.out.println("请输入三个数据： ");
		/*
		 * 1. 声明一个引用变量，JVM分配空间给“引用变量”，并重命名；
		 * 2. 创建对象，JVM分配堆空间给“新建的对象”
		 * 3. 连接对象和引用，把“新建的对象”赋值给“引用变量”
    	 * int [] arr ;
		 * arr = new int[3];
		 * */
		int [] arr = new int[3];
		int i = 0;
		while (true) {
			arr [i] = sc.nextInt();
			i++;
			if (i >= arr.length) {
				break;
			}
		}	
		MyArray a = new MyArray();
		a.show_Array(arr);
		int f = a.max_Print(arr);
		System.out.println("最大值为： "+ f);
				
	}

}

class MyArray{
	public static void show_Array(int[] a){
		for (int k=0;k <a.length;k++){
			//System.out.println(arr[k]);
			System.out.println("arr[" +k +"]=" +a[k]);
		}
	}
	public static int max_Print(int[] a){
		int temp = 0 ;
		for (int k=1; k < a.length; k++){
//			temp = (a[k]>a[k + 1])? a[k]:a[k + 1];
			a[k] = a[k-1]>=a[k]?a[k-1]:a[k];
			System.out.println(a[k]);
			temp = a[k];
		}
//		System.out.println("最大值为： "+ temp);
		return temp;
	} 
}