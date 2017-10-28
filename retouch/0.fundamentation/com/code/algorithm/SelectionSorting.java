package com.code.algorithm;
import java.util.Arrays;
class SelectionSort{
	public static void selectionSort(int[] a){
		int n = a.length;
		int lable = 0;
		for (int i = 0; i<n; i++){
			int k = i;
			//find out the smallest one.
			for (int j = i+1;j < n; j++){
				if (a[j] < a[k]){
					k = j;
				}
			}
			if(k < i){
				int temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
		//**********2-right
        for (int i = 0; i < n; i++) {
            int k = i;
            // 找出最小值的小标
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            // 将最小值放到排序序列末尾
            if (k > i) {
                int tmp = a[i];
                a[i] = a[k];
                a[k] = tmp;
            }
            System.out.println(Arrays.toString(a));
        }
		//************3-worng
//	for(int i = 0; i<n; i++){
//		for(int j = 1; j<n-i; j++){
//			if (a[j-1] > a[j]){
//				lable = j;				
//			}
//		}
//		int temp = a[lable];
//		a[lable] = a[i];
//		a[i] = temp;
//		System.out.println(Arrays.toString(a));
//	}
	
	}
	public static void selectionSort2(int[] a){
		int l = a.length;
		int temp;
		for(int i = 0; i< l; i++){
			int k = i;
			for(int j = i+1; j<l; j++ ){
				if(a[j]<a[k]){
					k = j;//aim to find out the smallest one.
				}
			}
			if(k != i){
				temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}					
		}
		System.out.println("2017/10/21");
		System.out.println(Arrays.toString(a));
	}
}
public class SelectionSorting {
	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int[] a = {9,8,7,6,5,4,3,2,1,0};
//		ss.selectionSort(a);
		ss.selectionSort2(a);
	}
}
