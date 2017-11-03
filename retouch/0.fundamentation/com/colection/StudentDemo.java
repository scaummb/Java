package com.colection;
/*
 * 需求：请定义一个数组，存储三个学生对象，然后遍历该数组，得到每一个学生对象的成员变量值。
 * 
 * Student[]	对象数组。
 */
public class StudentDemo {

	public static void main(String[] args) {
		// 创建对象数组
		Student [] students= new Student[3];
		
		// 默认值是null
		for(int i = 0;i < students.length;i ++){
			System.out.println(students[i]);
		}
		// 创建学生对象元素
		Student s1 = new Student("mmb1",23);
		Student s2 = new Student("mmb2",24);
		Student s3 = new Student("mmb3",25);
		
		// 把元素放到数组中
		students[0] = s1;
		students[2] = s3;
		students[1] = s2;	
		
		// 赋值后的学生对象
		for(int c = 0; c < students.length; c ++){
			Student s = students[c];
			System.out.println(s.getName() + "---"+s.getAge());
		}

	}

}
