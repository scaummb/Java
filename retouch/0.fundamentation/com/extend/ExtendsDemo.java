package com.extend;
/*
 * 	java中的继承特点：
		A:Java只支持单继承，不支持多继承。
		B:Java支持多层继承(继承体系)
 * */
class A{}
class B extends A{}
class C extends B{}

/*
 * 	java中的继承注意事项：
		A:子类只能继承父类所有非私有的成员(成员方法和成员变量)
		B:子类不能继承父类的构造方法，但是可以通过super(后面讲)关键字去访问父类构造方法。
		C:不要为了部分功能而去继承
			class A {
				public void show(){}
				public void show2(){}
			}

			class B extends A {
				//public void show(){}
				public void show3(){}
			}
	那么，我们什么时候考虑使用继承呢?
		继承中类之间体现的是：”is a”的关系。
		如果两个类满足这个关系：xxx is a yyy，那么他们就可以使用继承。
		举例：类A和类B，如果类A is a 类B或者类B is a 类A 能念通过，就可以考虑使用继承。
		      否则不可以。
 * */
class Fu {
	private int num1 = 100;
	public int num2 = 100;
	
	private void show(){
		System.out.println("show");
	}
	
	public void show2(){
		System.out.println("show2");
	}
}

class Zi extends Fu{
	
}

public class ExtendsDemo {
	public static void main(String [] args){
		Zi z = new Zi();
//		z.show();
		z.show2();
		System.out.println(z.num2+"**");
		
		Fu f = new Fu();
		//看Fu行不行
//		System.out.println(f.num1);
		System.out.println(f.num2);
	}	

}
