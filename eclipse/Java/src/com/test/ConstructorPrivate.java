package com.test;

public class ConstructorPrivate {
//	private
//	public
	//���� �����ĵط����������棺1. ���η���2. ����ֵ���� void����3. ��������������������һ����
	protected//���ǣ����ܱ���static / synchronized / abstract / final��Ҳû�з���ֵ
	ConstructorPrivate(){
		System.out.println("This is a constructor.");
	}
	static{
		System.out.println("This is a static block.");
	}
	public static void main(String [] args){
		System.out.println("**");
	}

}
