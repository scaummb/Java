package com.code.algorithm;
import java.util.Arrays;
class SelectionSort{
	public static void selectionSort(int[] a){
		int n = a.length;
		int lable = 0;
		//************1-ok
/*		for (int i = 0; i<n; i++){
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
		}*/
		//**********2-right
        for (int i = 0; i < n; i++) {
            int k = i;
            // �ҳ���Сֵ��С��
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            // ����Сֵ�ŵ���������ĩβ
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
}
public class SelectionSorting {

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int[] a = {9,3,6,14,5,6,6,5};
		ss.selectionSort(a);
	}

}
