package com.object;

/*
 * 	�Ƚ����������Ƿ���ȡ��������ͷֱ�Ϊ����byte���ͣ�����short���ͣ�
	����int���ͣ�����long���ͣ�����main�����н��в���
 * */

/*
 * 	�������أ�
		��ͬһ�����У��������һ�����ϵ�ͬ��������ֻҪ���ǵĲ����������߲������Ͳ�ͬ���ɡ�
		�ͷ���ֵ�����޹ء�
 * */
public class MethodRestructure {
	public static void main(String[] args){
		//test
		byte a = 10;
		byte b = 10;
		short a1 = 233;
		short b1 = 766;
		
		System.out.println(compare(a1,b1)+" 0");
		
		System.out.println(compare(a,b)+" 1");
		
		System.out.println(compare(10,10)+" 2");
	}
	//byte
	public static boolean compare(byte a,byte b){
		System.out.print("byte ");
		return a == b;
	}
	
	//short
	public static boolean compare(short a,short b){
		System.out.print("short ");
		return a == b;
	}

	//int
	public static boolean compare(int a,int b) {
		System.out.print("int ");
		return a == b;
	}
	
	//long
	public static boolean compare (long a,long b){
		System.out.print("long ");
		return a == b;
	}
}

