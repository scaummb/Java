package com.test;
/*
 * 	������
		A:ͨ���۲죬����֪������Ӧ����һ����ά��������ʾ
		B:������ͱ���
		C:������ά���飬��ȡÿһ��Ԫ�أ�Ȼ���ۼӼ��ɡ�
		D:��������
 * */
public class TwoDemensionTest {
	public static void main(String[] args){
		int[][] arr = {{4,5,6},{8,9,6},{6,9,8}};
		Sum s = new Sum();
		int a = s.sum(arr);
		System.out.println("The sum of 9 months is: "+a);
	}

}

class Sum{
	public static int sum(int[][] arr){
		int result = 0;
		for (int a=0; a<arr.length; a++){
			for (int b=0; b<arr[a].length; b++){
				result += arr[a][b];
			}
		}
		return result;		
	}
}