package com.extend;
/*
 * 	java�еļ̳��ص㣺
		A:Javaֻ֧�ֵ��̳У���֧�ֶ�̳С�
		B:Java֧�ֶ��̳�(�̳���ϵ)
 * */
class A{}
class B extends A{}
class C extends B{}

/*
 * 	java�еļ̳�ע�����
		A:����ֻ�ܼ̳и������з�˽�еĳ�Ա(��Ա�����ͳ�Ա����)
		B:���಻�ܼ̳и���Ĺ��췽�������ǿ���ͨ��super(���潲)�ؼ���ȥ���ʸ��๹�췽����
		C:��ҪΪ�˲��ֹ��ܶ�ȥ�̳�
			class A {
				public void show(){}
				public void show2(){}
			}

			class B extends A {
				//public void show(){}
				public void show3(){}
			}
	��ô������ʲôʱ����ʹ�ü̳���?
		�̳�����֮�����ֵ��ǣ���is a���Ĺ�ϵ��
		������������������ϵ��xxx is a yyy����ô���ǾͿ���ʹ�ü̳С�
		��������A����B�������A is a ��B������B is a ��A ����ͨ�����Ϳ��Կ���ʹ�ü̳С�
		      ���򲻿��ԡ�
 * */
class Fu {
	private int num1 = 100;
	public int num2 = 100;
	
	private void show(){
		System.out.println("show");
	}
	
	public void show2(){
		System.out.println("show2");
	}
}

class Zi extends Fu{
	
}

public class ExtendsDemo {
	public static void main(String [] args){
		Zi z = new Zi();
//		z.show();
		z.show2();
		System.out.println(z.num2+"**");
		
		Fu f = new Fu();
		//��Fu�в���
//		System.out.println(f.num1);
		System.out.println(f.num2);
	}	

}
