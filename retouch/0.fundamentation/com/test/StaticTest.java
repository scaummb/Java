package com.test;

public class StaticTest {
	static int  a ;
	int b;
	static int x = 5;
	static{ x+=5;}
	public static void main(String [] args){
		a = 10;  //�������ʱ����ʹ��
//		b = 20; //���д���һ�������ſ���
//		StaticTest aa = new StaticTest();
//		aa.b = 10;
		
		//˵����ɶ��
		//���ʾ�̬���������������� or ʵ�����󣬼Ӹ���ŷ�.�����
		Mystatic mystatic1 = new Mystatic();
		Mystatic mystatic2 = new Mystatic();
		System.out.println("first: "+mystatic2.c);
		mystatic1.c = 100;
//		Mystatic.c = 100;
		System.out.println("second: "+mystatic2.c);
		
		//���Ծ�̬����飬���о�̬��ʼ������	װ��ʱ��ִ�������
		System.out.println("x="+x);
	}
	static {x -= 5;}

}

class Mystatic {
	static int c =10; //static variable
}