package com.polymorphic;
class Base{
	public Base(){
		g();
		System.out.println("在执行 Base b = new Derived(); 时，会调用"
				+ "Base类的构造函数，而在构造中执行了g()，由于多态特性，会调用Derived类的go()");
	}
	public void f(){
		System.out.println("Base f()");
	}
	public void g(){
		System.out.println("Base g()");
	}
	public void g(int a){
		System.out.println("Base g()，在父类中重载和覆盖："+a);
	}
/*
 * 下面的h（）方法如果被注释掉，即：父类不定义h（），而子类定义了h（），会报错。
 * */	
//	public void h(){
//		System.out.println("Base h()");
//	}
	public void h() {
		// TODO 自动生成的方法存根
		
	}
}
class Derived extends Base{
	public void f(){
		System.out.println("Derived f()");
		System.out.println("实际创建的是Derived类的对象，后面的方法调用都会调用Derived的方法");
	}
	public void g(){
		System.out.println("Derived g()");
		System.out.println("实际创建的是Derived类的对象，后面的方法调用都会调用Derived的方法");
	}
	//父类的方法，覆盖后，再重载，
	public void g(int a){
		System.out.println("Derived g()，带参数，覆盖后，再重载，："+a);
		System.out.println("实际创建的是Derived类的对象，后面的方法调用都会调用Derived的方法");
	}
/*
 * 假如下面的h()注释掉了，没有覆盖父类的h（），则对象会调用父类的方法。
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
		b.g(100);//没在父类定义g(int a)之前会报错：类型 Base 中的方法 g（）对于参数（int）不适用，
					 //只是在子类重载还不行，父类也要重载
		b.h();//有点明白，多态的基础，就是继承和方法覆盖

	}

}
