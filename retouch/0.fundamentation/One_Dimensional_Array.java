package com.java.myself;
import java.util.Scanner;

public class One_Dimensional_Array {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		System.out.println("�������������ݣ� ");
		/*
		 * 1. ����һ�����ñ�����JVM����ռ�������ñ�����������������
		 * 2. ��������JVM����ѿռ�����½��Ķ���
		 * 3. ���Ӷ�������ã��ѡ��½��Ķ��󡱸�ֵ�������ñ�����
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
		System.out.println("���ֵΪ�� "+ f);
				
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
//		System.out.println("���ֵΪ�� "+ temp);
		return temp;
	} 
}