package com.interfaceTest;

//接口，定义了一个方法
interface IntCompare{
	public int cmp(int a,int b);
}

class Cmp1 implements IntCompare{
	public int cmp(int a,int b){
		if (a > b){
			return 1;
		}else if (a < b){
			return -1;
		}else {
			return 0;
		}
	}
}

class Cmp2 implements IntCompare{
	public int cmp(int a,int b){
		if (a > b){
			return -1;
		}else if(a <b ){
			return 1;
		}else{
			return 0;
		}
	}
}

public class TestTwo {
	public static void insertSort(int [] a,IntCompare cmp){
		if (a != null){
			for (int i  = 1;i<a.length;i++){
				int temp = a[i],j = i;
				if (cmp.cmp(a[j -1], temp) == 1){
					while(j >= 1 && cmp.cmp(a[j-1], temp) == 1){
						a[j] = a[j - 1];
						j--;
					}
				}
				a[j] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int [] array1 = {7,6,8,55,11,2,3,9};
		insertSort(array1, new Cmp1());
		System.out.println("升序排列： ");
		for (int i = 0;i< array1.length;i++)
			System.out.print(array1[i]+" ");
		System.out.println();
		int [] array2 = {8 ,6,2,55,44,11,3,2};
		insertSort(array2, new Cmp2());
		System.out.println("降序排列： ");
		for (int i = 0;i< array2.length;i++)
			System.out.print(array2[i]+" ");
	}

}
