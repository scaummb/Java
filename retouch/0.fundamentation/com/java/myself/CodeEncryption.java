package com.java.myself;
import java.util.Scanner;
/*
 * 加密一个数组
 * */
public class CodeEncryption {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		Encryption jiami = new Encryption();

		//键盘录入数据
		System.out.println("请输入数据(小于8位的整数)：");
		int number = sc.nextInt();
		System.out.println("开始加密。。");
		int result = jiami.jiami(number);
		System.out.println("加密后的结果是： "+ result);
	}

}

class Encryption{
	public static int jiami(int number){
		int[] arr = new int[8];
		int index = 0;
		//FIRST	
		while (number > 0){
			arr[index++] = number%10;
			number /= 10;
			System.out.println("index: "+index);
		}
		System.out.println("index1: "+index);
		
		//SECOND
		for(int x = 0; x<index; x++){
			arr[x] += 5;
			arr[x] %=10;
		}
		System.out.println("index2: "+index);
		
		//Third
		int temp = arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = temp;
		System.out.println("arr[0]: "+arr[0]+" arr[index-1]: "+arr[index-1]);

		//forth
		int f = 0;
		for (int x = 0; x<index; x++) {
			f += arr[x];
		}
		System.out.println("f is : "+f);
		return f;
	}
}