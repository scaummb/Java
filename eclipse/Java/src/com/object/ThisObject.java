package com.object;

/*
 * 	��������˵���������֣�Ҫ��������֪�⣬�����ڵ�n��a������һ���õı������ơ�

	���ڱ����ڲ��ҵ�ʱ�򣬲��õ��Ǿͽ�ԭ�����ԣ����ʱ�򣬾Ͳ��������⡣
	���������Ա������ֵ�ģ�ȷ��ֵ���˾ֲ�������
	��ô�����Ǹ���ν�����������?
	java���������������ṩ��һ���ؼ��֣�this

	this��������Ķ���

	Ӧ�ó�����
		�ֲ��������س�Ա����
 * */

public class ThisObject {
	public static void main(String [] args){
		ThisDemo thisdemo = new ThisDemo();
		thisdemo.setAge(23);
		thisdemo.setName("mmb");
		int age = thisdemo.getAge();
		String name = thisdemo.getName();
		
		System.out.println("0.  name :"+name+" age : "+age);
		
		//ʹ�ó�Ա����
		thisdemo.show();
		//����Ա������ֵ
		thisdemo.setName("����ϼ");
		thisdemo.setAge(28);

		//�ٴ�ʹ�ó�Ա����
		thisdemo.show();

		System.out.println("�����ǣ�"+thisdemo.getName()+",�����ǣ�"+thisdemo.getAge());
	}

}

class ThisDemo{
	private String name;
	private int age;
	
	public void setName(String name){
		this.name = name;
	} 
	
	public String getName(){
		return name;  //��ʵ����������this
	}
	
	public void setAge(int a){
		this.age = a;
	}
	
	public int getAge(){
//		return this.age;
		return age;   //��ʵ����������this
	}
	
	//��ʾ������г�Ա�����ķ���
	public void show() {
		System.out.println("�����ǣ�"+name+",�����ǣ�"+age);
	}
}