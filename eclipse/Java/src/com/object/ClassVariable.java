package com.object;
/*
 * 	��Ա�����;ֲ�����������
		A:�����е�λ�ò�ͬ
			��Ա���� ���з�����
			�ֲ����� �����ڻ��߷���������
		B:���ڴ��е�λ�ò�ͬ
			��Ա���� ���ڴ�
			�ֲ����� ջ�ڴ�
		C:�������ڲ�ͬ
			��Ա���� ���Ŷ���Ĵ��ڶ����ڣ����Ŷ������ʧ����ʧ
			�ֲ����� ���ŷ����ĵ��ö����ڣ����ŷ����ĵ�����϶���ʧ
		D:��ʼ��ֵ��ͬ
			��Ա���� ��Ĭ�ϵĳ�ʼ��ֵ
			�ֲ����� û��Ĭ�ϵĳ�ʼ��ֵ�������ȶ��壬��ֵ������ʹ�á�

		ע�⣺
			�����ͬ���ı�����һ�����þͽ�ԭ��
 * */
public class ClassVariable {
	public static void main(String [] args){
		VariableDemo vd = new VariableDemo();
		System.out.println(vd.x);
		//�ֲ������Ƿ��ʲ��˵ģ�����ᱨ��
//		System.out.println(vd.y);
	}
}

class VariableDemo{
	//��Ա������ϵͳĬ�ϳ�ʼ��ֵΪ0
	int x;
	public static void variable(){
		//�ֲ�����		
		int y ;
		//System.out.println(y);
	
	}
}