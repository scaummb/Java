package com.object;

class A{
	public String show(D obj){
		return ("A and D ");
	}
	public String show(A obj){
		return ("A and A ");
	}
}

class B extends A{
	public String show(B obj){
		return ("B and B ");
	}
	public String show(A obj){
		return ("B and A ");
	}

}

class C extends B{}

class D extends B{}

public class PolymorphicTestOne {
	public static void main(String[] args){
		A a1 = new A();  //A��ʵ��
		A a2 = new B();  //��̬
		B b = new B();
		C c = new C();
		D d = new D();
		//��9�����
		System.out.println("1 "+a1.show(b));
		System.out.println("2 "+a1.show(c));
		System.out.println("3 "+a1.show(d));
		System.out.println("4 "+a2.show(b));
		System.out.println("5 "+a2.show(c));
		System.out.println("6 "+a2.show(d));
		System.out.println("7 "+b.show(b));
		System.out.println("8 "+b.show(c));
		System.out.println("9 "+b.show(d));
	}
/*
 * ������
��,��,�۵���a1.show()������a1 ����A�࣬A������������show(D obj)��show(A obj)��
��a1.show(b)������bΪA��������������Ϊ����ת�ͣ��൱��A obj=b�����Ե���show(A obj)�������õ�A and A�����
��ͬ��
�۲���Ϊd,����show(D obj)���õ�A and D��
�ܣ��ݣ��޵���a2.show()������A a2 = new B();������ת�ͣ����Զ�a2�����ĵ��ã�ʹ��A1��ķ���show(D obj)��show(A obj)������ʱshow(A obj)�Ѿ�����дΪreturn ("B and A")�� 
��a2.show(b)������show(A obj)���õ�B and A��
��ͬ��
�޵���show(D obj)���õ�A and D��
�ߣ��࣬�����b.show()����,bΪB�࣬B���show�����м̳е�show(D obj)���Լ�������show(B obj)��show(A obj)��
�ߵ���show(B obj)���õ�B and B��
������ת�ͣ�����show(B obj)���õ�B and B
��show(D obj)���õ�A and D
 * */
}
