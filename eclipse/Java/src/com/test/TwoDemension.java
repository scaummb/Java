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
 * �����log���Կ���������ά����û��������άԪ������ʱ���ڴ沢δ������Ӧ��
 * �ռ䣬����άԪ��ȷ���������׵�ַ��ᱻ���䣬��Java�Ķ��ڴ档
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
		 * ����ʼ��ʱֱ�ӷ������ʱ���ڵ�ַҲ����䣬����һ�����һ����
		 * */
		int [][] arr = {{4,5,6},{5,5,5,6},{5,4}};
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
