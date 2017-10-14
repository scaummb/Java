package com.object;
/*
 * 	定义学生类：姓名，年龄

	由于我们创建了对象，所以我们可以通过对象去使用类中的成员。
	而现在的情况是，我们不想对象直接去使用类的成员变量。
	肿么办呢?
	java针对这种情况，就提供了一个关键字：private。

	private:
		A:是一个权限修饰符。
		B:可以修饰成员(成员变量和成员方法)
		C:被private修饰的成员只在本类中才能访问。
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
	//因为年龄出现了负数，不符合现实情况
	//所以，我们要对年龄做出判断
	//而要做判断，就应该写判断语句
	//而写语句就应该在方法中
	public void checkAge(int a){
		if (a<0 || a>100){
			System.out.println("Your input age is worng.");
		}else{
			System.out.println("1");
			age = a;
		}		
	}
	//创建新方法返回私有变量
	public int getAge(){
		return age;
	}
	
	public void setAge(int a){
		age = a;
	}
	
}