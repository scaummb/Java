package com.polymorphic;

/*
 * 	��̬��ͬһ�������ڲ�ͬʱ�̱��ֳ��ֵĲ�ͬ״̬��

	������
		A:ˮ(ˮ������ˮ����)

		B:è�Ͷ��
			���ұߵ�ֵ��ֵ����ߣ�����ܶ�ͨ������˵�����ԡ�
			���� d = new ����();
			���� dd = new è();
			è m = new è();
			è mm = new ����();  ����

			���� dd = new è();

	�������������?
		A:�м̳й�ϵ	
		B:�з�����д	
		C:�и�������ָ���������
 * */
class Animal {
	public void eat() {
		System.out.println("����Է�");
	}
}
class Dog extends Animal{
	public void eat(){
		System.out.println("������");
	}
}
public class PolymorphicTest {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		//Dog d = new Dog();
		Animal animal = new Dog();//��̬
		animal.eat();
		Dog animal1 = new Dog();
		animal1.eat();
//		Dog animal2 = new Animal();
//		Dog animal2 = (Dog) new Animal();
//		animal2.eat();
	}

}
