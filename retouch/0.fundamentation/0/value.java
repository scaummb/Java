package com.java.myself;
/*
 * 	�������ڳ���ִ�еĹ�������ֵ�����Է����ı�
			��������

	���ࣺ
		A:����ֵ����
			1��12.5
		B:�Զ��峣��(������󲿷ֽ���)

	����ֵ�������ࣺ
		A:�ַ������� ��""������������
		B:�������� ���е���������
		C:С������ ���еĴ�С��������
		D:�ַ����� �õ�����������������
		E:�������� ֻ������ֵ��true��false
		F:�ճ��� null(���鲿��ȥ����)
*/
/*
	������	
		��0,1��ɡ���0b��ͷ
	�˽���	
		��0,1,��7��ɡ���0��ͷ
	ʮ����	
		��0,1,��9��ɡ�����Ĭ����ʮ���Ƶ�
	ʮ������    
		��0,1,��9,a,b,c,d,e,f(��Сд����)����0x��ͷ
 * */
public class value {
	public static void main(String[] args){
		Contant a = new Contant();
		a.print_contant();
		
		Hex b = new Hex();
		b.printHex();
		
		
	}

}

class Contant{
	public static void print_contant(){
		//�ַ�������
		System.out.println("HelloWorld");

		//��������
		System.out.println(100);

		//С������
		System.out.println(12.345);

		//�ַ�����
		System.out.println('A');
		//������Ǵ����
		//System.out.println('BC');
		System.out.println('1');
		
		//��������
		System.out.println(true);
		System.out.println(false);		
	}
}

class Hex{
	public static void printHex(){
		System.out.println(0b01);
		System.out.println(0123);
		System.out.println(123);
		System.out.println(0x123);
	}
}