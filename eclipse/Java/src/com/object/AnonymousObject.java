package com.object;
/*
 * first:
 * ����������Ϊ��ʽ�������ݣ�ֱ�Ӵ��ݻ������͵�ֵ���ɡ�
 * */

/*
 * second:
 * ��������û�����ֵĶ���
	ʹ�ó�����
		A:���÷���,�÷���������ʹ��һ�ε�ʱ�����á�
		B:��Ϊʵ�ʲ�������
 * */
public class AnonymousObject {
	public static void main(String[] args){
		//first condition
		StudentDemo student = new StudentDemo();
		Demone s = new Demone();
		student.test(s);
		
		//second condition
		//��������
		Demotwo ss = new Demotwo();
		ss.love();

		//��������ֻ����һ�εķ��������ã�
		new Demone().student();
		new Demotwo().love();

		//�����ֵ����
		//StudentDemo sd = new StudentDemo();
		//Student s = new Student();
		//sd.test(s);

		//û�����ֵ����
		//StudentDemo sd = new StudentDemo();
		//sd.test(new Student());

		//��������һ��
		new StudentDemo().test(new Demotwo());
	}

}

class StudentDemo {
	//Student���࣬���������������͡�
	public void test(Demone s) {
		s.student();
	}
	
	public void test(Demotwo s){
		s.love();
	}
}

class Demone{
	public void student(){
		System.out.println("ѧ����ѧϰ");
	}
}

//����ѧ���࣬дһ��love����
class Demotwo  {
	public void love() {
		System.out.println("ѧ��ϲ���ż�");
	}
}
