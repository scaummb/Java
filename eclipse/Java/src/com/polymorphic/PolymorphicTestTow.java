package com.polymorphic;

/*
 * 	多态的成员访问特点：
		A:成员变量
			编译看左边，运行看左边。
		B:成员方法
			编译看左边，运行看右边。

			为什么呢?
				因为成员方法有重写，而变量没有。
		C:静态方法
			编译看左边，运行看左边。

			静态方法其实没有重写这一说。因为它是跟类相关。
 * */

class AnimalTwo {
	public int age = 40;	
	public void show() {
		System.out.println("show animal");
	}	
	public static void method() {
		System.out.println("method animal");
	}
}
class DogTwo extends AnimalTwo {
	public int age = 20;
	public void show() {
		System.out.println("show dog");
	}
	public static void method(){
		System.out.println("method dog");
	}
	public  void method2() {
		System.out.println("method dog..wangwang");
	}
}
public class PolymorphicTestTow {

	public static void main(String[] args) {
		//多态，使用的方法其实是父类的定义好的方法，而指向了子类，表示假如子类有方法复写，就会使用它
		AnimalTwo a = new DogTwo();
		System.out.println(a.age);
		//System.out.println(a.num);
		a.show();
		a.method();
		
//		a.method2();//没有为类型 AnimalTwo 定义方法 methodd（）

	}

}
