package com.colection.ArrayList_Vector_LinkedList.Generic.example;
/*
 * ʵ������ʵ�ַ��ͽӿڵ�ʱ��
 * A:��ʵ�ֽӿڵ�ʱ�����Ѿ���ȷ�˽ӿڵķ��Ͳ�������
 * B:��ʵ�ֽӿڵ�ʱ���һ���֪���ӿڵķ��Ͳ�������
 */
//public class InterImpl implements Inter<String> {
//	@Override
//	public void show(String yy) {
//		System.out.println(yy);
//	}
// }
public class InterImpl implements Inter{
	public  void show(Object xx){
		Object a = xx;
		System.out.println("The value of Object xx is: "+a);
	}


}
