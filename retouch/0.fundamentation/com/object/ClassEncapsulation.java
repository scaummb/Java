package com.object;
/*
 * 	����ѧ���ࣺ����������

	�������Ǵ����˶����������ǿ���ͨ������ȥʹ�����еĳ�Ա��
	�����ڵ�����ǣ����ǲ������ֱ��ȥʹ����ĳ�Ա������
	��ô����?
	java���������������ṩ��һ���ؼ��֣�private��

	private:
		A:��һ��Ȩ�����η���
		B:�������γ�Ա(��Ա�����ͳ�Ա����)
		C:��private���εĳ�Աֻ�ڱ����в��ܷ��ʡ�
 * */
public class ClassEncapsulation {
	public static void main(String[] args){
		StudentAge sa = new StudentAge();
		sa.name = "mmb";
//		sa.age = 32;//error
		sa.checkAge(23);
		int age = sa.getAge();
		System.out.println("2");
		System.out.println(age);
	}

}

class StudentAge{
	String name;
	private int age;
	//��Ϊ��������˸�������������ʵ���
	//���ԣ�����Ҫ�����������ж�
	//��Ҫ���жϣ���Ӧ��д�ж����
	//��д����Ӧ���ڷ�����
	public void checkAge(int a){
		if (a<0 || a>100){
			System.out.println("Your input age is worng.");
		}else{
			System.out.println("1");
			age = a;
		}		
	}
	//�����·�������˽�б���
	public int getAge(){
		return age;
	}
	
	public void setAge(int a){
		age = a;
	}
	
}