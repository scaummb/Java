package com.object;

/*
 * 	我们曾经说过，起名字，要做到见名知意，而现在的n和a都不是一个好的变量名称。

	由于变量在查找的时候，采用的是就近原则，所以，这个时候，就产生了问题。
	本来想给成员变量赋值的，确赋值给了局部变量。
	那么，我们该如何解决这个问题呢?
	java针对这种情况，就提供了一个关键字：this

	this：代表本类的对象

	应用场景：
		局部变量隐藏成员变量
 * */

public class ThisObject {
	public static void main(String [] args){
		ThisDemo thisdemo = new ThisDemo();
		thisdemo.setAge(23);
		thisdemo.setName("mmb");
		int age = thisdemo.getAge();
		String name = thisdemo.getName();
		
		System.out.println("0.  name :"+name+" age : "+age);
		
		//使用成员变量
		thisdemo.show();
		//给成员变量赋值
		thisdemo.setName("林青霞");
		thisdemo.setAge(28);

		//再次使用成员变量
		thisdemo.show();

		System.out.println("姓名是："+thisdemo.getName()+",年龄是："+thisdemo.getAge());
	}

}

class ThisDemo{
	private String name;
	private int age;
	
	public void setName(String name){
		this.name = name;
	} 
	
	public String getName(){
		return name;  //其实这里隐含了this
	}
	
	public void setAge(int a){
		this.age = a;
	}
	
	public int getAge(){
//		return this.age;
		return age;   //其实这里隐含了this
	}
	
	//显示类的所有成员变量的方法
	public void show() {
		System.out.println("姓名是："+name+",年龄是："+age);
	}
}