package com.polymorphic;
class Base{
	public Base(){
		g();
		System.out.println("��ִ�� Base b = new Derived(); ʱ�������"
				+ "Base��Ĺ��캯�������ڹ�����ִ����g()�����ڶ�̬���ԣ������Derived���go()");
	}
	public void f(){
		System.out.println("Base f()");
	}
	public void g(){
		System.out.println("Base g()");
	}
	public void g(int a){
		System.out.println("Base g()���ڸ��������غ͸��ǣ�"+a);
	}
/*
 * �����h�������������ע�͵����������಻����h�����������ඨ����h�������ᱨ��
 * */	
//	public void h(){
//		System.out.println("Base h()");
//	}
	public void h() {
		// TODO �Զ����ɵķ������
		
	}
}
class Derived extends Base{
	public void f(){
		System.out.println("Derived f()");
		System.out.println("ʵ�ʴ�������Derived��Ķ��󣬺���ķ������ö������Derived�ķ���");
	}
	public void g(){
		System.out.println("Derived g()");
		System.out.println("ʵ�ʴ�������Derived��Ķ��󣬺���ķ������ö������Derived�ķ���");
	}
	//����ķ��������Ǻ������أ�
	public void g(int a){
		System.out.println("Derived g()�������������Ǻ������أ���"+a);
		System.out.println("ʵ�ʴ�������Derived��Ķ��󣬺���ķ������ö������Derived�ķ���");
	}
/*
 * ���������h()ע�͵��ˣ�û�и��Ǹ����h��������������ø���ķ�����
 * */
	public void h(){
		System.out.println("Derived h()");
	}
}
public class PolymorphicTestFifth {

	public static void main(String[] args) {
		Base b = new Derived();
		b.f();
		b.g();
		b.g(100);//û�ڸ��ඨ��g(int a)֮ǰ�ᱨ������ Base �еķ��� g�������ڲ�����int�������ã�
					 //ֻ�����������ػ����У�����ҲҪ����
		b.h();//�е����ף���̬�Ļ��������Ǽ̳кͷ�������

	}

}
