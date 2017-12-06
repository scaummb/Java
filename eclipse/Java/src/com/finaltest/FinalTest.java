package com.finaltest;

/*	很多时候，我们可能不想让子类修改我的内容。这个时候该怎么半呢?
	针对这种情况，java又提供了一个状态修饰符：final。

	final:最终的意思。

	作用：
		可以修饰类，成员变量，成员方法。

	特点：
		类：类被final修饰，说明该类是最终类，不能被继承。
		       硬来，会报错：类型 B 不能成为终态类 A 的子类
		成员变量：变量被final修饰后，就变成了常量。值不能被修改。
		       硬来，会报错：标记“{”上有语法错误，在此标记之后应为 {
		成员方法：方法不能被子类重写。
		       硬来，会报错：不能覆盖 父类中的终态方法
		*/
//final class A{
class A{
//private class A{
	final int a = 20;
	public final void Go(){
//		this.a = 200;
		int k = 200 + a;//变量与产量相加
		System.out.println("123,Go!");
	}
}
//class B extends A{
//	public void Go(){}
//	super.a =10;
//	int b = super.a;
//	System.out.println(super.a);
//}
public class FinalTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
