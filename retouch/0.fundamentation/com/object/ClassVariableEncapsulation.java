package com.object;
import  com.object.ClassEncapsulation;

public class ClassVariableEncapsulation {
	public static void main(String [] args){
		//��������
		StudentName s = new StudentName();
		//�����Ա������ֵ
		System.out.println(s.getName()+"---"+s.getName());

		//����Ա������ֵ
		s.setName("����ϼ");
		s.setAge(28);

		//�ٴ������Ա������ֵ
		StudentAge sa= new StudentAge();
		System.out.println(s.getName()+"---"+s.getAge(sa, 23));
	}

}

class StudentName{
	private String name;
	private int age;
	
	//���name����get��set����
	public void setName(String n){
		name = n;		
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public int getAge(StudentAge sa,int a){
		System.out.println("   0");
		sa.setAge(a);
		int result = sa.getAge();
		System.out.println(result+"  1");
		return a;
	}
}