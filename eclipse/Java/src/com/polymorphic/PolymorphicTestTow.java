package com.polymorphic;

/*
 * 	��̬�ĳ�Ա�����ص㣺
		A:��Ա����
			���뿴��ߣ����п���ߡ�
		B:��Ա����
			���뿴��ߣ����п��ұߡ�

			Ϊʲô��?
				��Ϊ��Ա��������д��������û�С�
		C:��̬����
			���뿴��ߣ����п���ߡ�

			��̬������ʵû����д��һ˵����Ϊ���Ǹ�����ء�
 * */

class AnimalTwo {
	public int age = 40;	
	public void show() {
		System.out.println("show animal");
	}	
	public static void method() {
		System.out.println("method animal");
	}
}
class DogTwo extends AnimalTwo {
	public int age = 20;
	public void show() {
		System.out.println("show dog");
	}
	public static void method(){
		System.out.println("method dog");
	}
	public  void method2() {
		System.out.println("method dog..wangwang");
	}
}
public class PolymorphicTestTow {

	public static void main(String[] args) {
		//��̬��ʹ�õķ�����ʵ�Ǹ���Ķ���õķ�������ָ�������࣬��ʾ���������з�����д���ͻ�ʹ����
		AnimalTwo a = new DogTwo();
		System.out.println(a.age);
		//System.out.println(a.num);
		a.show();
		a.method();
		
//		a.method2();//û��Ϊ���� AnimalTwo ���巽�� methodd����

	}

}
