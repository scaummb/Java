package com.test;
/*
 * 	分析：
		A:通过观察，我们知道，这应该用一个二维数组来表示
		B:定义求和变量
		C:遍历二维数组，获取每一个元素，然后累加即可。
		D:输出结果。
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