package srevletTest.jdbc_test;

public class test_bean {
	public int[] get_insertsort(int [] a){
		int len = a.length;
		for(int i = 1; i<len; i++){
			int temp = a[i];
			int j = i;
			while(j>0 && temp > a[j-1]){
				a[j] = a[j-1];
				j--;
			}
			temp = a[j];
		}
		System.out.println(a.toString());
		return a;
	}
}
