package com.object;
/*
 * first:
 * 基本类型作为形式参数传递，直接传递基本类型的值即可。
 * */

/*
 * second:
 * 匿名对象：没有名字的对象。
	使用场景：
		A:调用方法,该方法仅仅被使用一次的时候适用。
		B:作为实际参数传递
 * */
public class AnonymousObject {
	public static void main(String[] args){
		//first condition
		StudentDemo student = new StudentDemo();
		Demone s = new Demone();
		student.test(s);
		
		//second condition
		//创建对象
		Demotwo ss = new Demotwo();
		ss.love();

		//匿名对象，只采用一次的方法（少用）
		new Demone().student();
		new Demotwo().love();

		//有名字的情况
		//StudentDemo sd = new StudentDemo();
		//Student s = new Student();
		//sd.test(s);

		//没有名字的情况
		//StudentDemo sd = new StudentDemo();
		//sd.test(new Student());

		//不妨在来一步
		new StudentDemo().test(new Demotwo());
	}

}

class StudentDemo {
	//Student是类，类是引用数据类型。
	public void test(Demone s) {
		s.student();
	}
	
	public void test(Demotwo s){
		s.love();
	}
}

class Demone{
	public void student(){
		System.out.println("学生爱学习");
	}
}

//定义学生类，写一个love方法
class Demotwo  {
	public void love() {
		System.out.println("学生喜欢放假");
	}
}
