package com.finaltest;

/*	�ܶ�ʱ�����ǿ��ܲ����������޸��ҵ����ݡ����ʱ�����ô����?
	������������java���ṩ��һ��״̬���η���final��

	final:���յ���˼��

	���ã�
		���������࣬��Ա��������Ա������

	�ص㣺
		�ࣺ�౻final���Σ�˵�������������࣬���ܱ��̳С�
		       Ӳ�����ᱨ������ B ���ܳ�Ϊ��̬�� A ������
		��Ա������������final���κ󣬾ͱ���˳�����ֵ���ܱ��޸ġ�
		       Ӳ�����ᱨ����ǡ�{�������﷨�����ڴ˱��֮��ӦΪ {
		��Ա�������������ܱ�������д��
		       Ӳ�����ᱨ�����ܸ��� �����е���̬����
		*/
//final class A{
class A{
//private class A{
	final int a = 20;
	public final void Go(){
//		this.a = 200;
		int k = 200 + a;//������������
		System.out.println("123,Go!");
	}
}
//class B extends A{
//	public void Go(){}
//	super.a =10;
//	int b = super.a;
//	System.out.println(super.a);
//}
public class FinalTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
