package com.colection;
/*
 * �����붨��һ�����飬�洢����ѧ������Ȼ����������飬�õ�ÿһ��ѧ������ĳ�Ա����ֵ��
 * 
 * Student[]	�������顣
 */
public class StudentDemo {

	public static void main(String[] args) {
		// ������������
		Student [] students= new Student[3];
		
		// Ĭ��ֵ��null
		for(int i = 0;i < students.length;i ++){
			System.out.println(students[i]);
		}
		// ����ѧ������Ԫ��
		Student s1 = new Student("mmb1",23);
		Student s2 = new Student("mmb2",24);
		Student s3 = new Student("mmb3",25);
		
		// ��Ԫ�طŵ�������
		students[0] = s1;
		students[2] = s3;
		students[1] = s2;	
		
		// ��ֵ���ѧ������
		for(int c = 0; c < students.length; c ++){
			Student s = students[c];
			System.out.println(s.getName() + "---"+s.getAge());
		}

	}

}
