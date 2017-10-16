package com.object;
/*
 * 网友评论：
 * 多态就是说：只用它俩共有的，也就是说，上层有的都可以用，如果下层重写了，用下层的，下层单独的，无效。
首先要弄清他们之间的关系。
A是最上层类，B是A的子类，C，D是B的子类，也就是A的孙子类。
A——B——(C,D);
然后， A.show(D d)说明：A——D = a,d; A对孙子D情有独钟。
A.show(A a)说明：A——A = a.a;A对自己，子类，孙子类也不放过
B.show(A a)说明：B——A = b.a;B的参数与上一个一样，这就是重写，意味着，如果出现多态，用这个，不用上面那个。
B.show(B b)说明：B——B = b.b;这是b自己的方法。多态的话无效。（下层单独的，无效）
==================
a.show(b)和a.show(c)是一样的用a.show(A a);方法：就是直接对孙子下手。
a.show(d),依旧情有独钟。
==================
a2.show(b)，首先A里没有单独的方法，因为是多态：B有单独的方法是无效的。那招共有重写的，所以就把b当作b.show(A a)处理。
a2.show(c)同上。
首先这是多态：
还是这句：上层单独有的直接用，如果下层重写了的，用下层的，下层单独的，无效。
a2.show(d)依旧情有独钟（上层单独有的直接用）。
==================
b.shw(b)====这是b自己的方法。直接用
b.show(c)====b没有单独对c的方法，去父类看看，也没有单独的，好嘛，show(A a)直接就重写了。
b.show(d)====b没有单独对d的方法，那我们就去父类看看，依旧情有独钟。
 * */
class A{
	public String show(D obj){
		return ("A and D ");
	}
	public String show(A obj){
		return ("A and A ");
	}
}

class B extends A{
	public String show(B obj){
		return ("B and B ");
	}
	public String show(A obj){
		return ("B and A ");
	}

}

class C extends B{}

class D extends B{}

public class PolymorphicTestOne {
	public static void main(String[] args){
		A a1 = new A();  //A类实例
		A a2 = new B();  //多态
		B b = new B();
		C c = new C();
		D d = new D();
		//共9种情况
		System.out.println("1 "+a1.show(b));
		System.out.println("2 "+a1.show(c));
		System.out.println("3 "+a1.show(d));
		System.out.println("4 "+a2.show(b));
		System.out.println("5 "+a2.show(c));
		System.out.println("6 "+a2.show(d));
		System.out.println("7 "+b.show(b));
		System.out.println("8 "+b.show(c));
		System.out.println("9 "+b.show(d));
	}
/*
 * 解析：
①,②,③调用a1.show()方法，a1 属于A类，A类有两个方法show(D obj)和show(A obj)。
①a1.show(b)，参数b为A类的子类对象，这里为向上转型，相当于A obj=b；所以调用show(A obj)方法，得到A and A结果。
②同理，
③参数为d,调用show(D obj)，得到A and D。
④，⑤，⑥调用a2.show()方法，A a2 = new B();是向上转型，所以对a2方法的调用，使用A1类的方法show(D obj)和show(A obj)，但此时show(A obj)已经被重写为return ("B and A")， 
④a2.show(b)，调用show(A obj)，得到B and A。
⑤同理，
⑥调用show(D obj)，得到A and D。
⑦，⑧，⑨调用b.show()方法,b为B类，B类的show方法有继承的show(D obj)，自己的两个show(B obj)、show(A obj)。
⑦调用show(B obj)，得到B and B，
⑧向上转型，调用show(B obj)，得到B and B
⑨show(D obj)，得到A and D
 * */
}
