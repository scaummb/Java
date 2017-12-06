package com.test;

public class TwoDemension {
	public static void main(String[] args){
		int[][] arr = new int[3][2];
		System.out.println(arr);//[[I@7d3598c3
		System.out.println(arr[0]); //[I@57125f92
		System.out.println(arr[2]);
		System.out.println(arr[1]);
		System.out.println("***********");
		
		int [][] arr1 = new int[3][];			
		System.out.println(arr1);//[[I@7d3598c3
		System.out.println(arr1[0]);//null
		System.out.println(arr1[2]);//null
		System.out.println(arr1[1]);//null
/*
 * 从输出log可以看到，当二维数组没有声明二维元素数量时，内存并未分配相应的
 * 空间，当二维元素确定数量后，首地址便会被分配，即Java的堆内存。
 * */
		
		arr[0] = new int[3];
		arr[1] = new int[1];
		arr[2] = new int[2];
		
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		System.out.println(arr[1]);

		arr[2][1] = 100;
		arr[0][2] = 200;
		
		System.out.println(arr[0][2]);
		System.out.println(arr[2][1]);
		System.out.println("***********");
				
		Demo demo = new Demo();
		demo.test(null);
	}

}

class Demo{
	public static void test(String[] args){
		/*
		 * 当初始化时直接分配变量时，内地址也会分配，跟第一个情况一样。
		 * */
		int [][] arr = {{4,5,6},{5,5,5,6},{5,4}};
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
