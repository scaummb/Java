package com.inherit;

class Animal{
	String name;
	int age;
	public Animal(){
		System.out.println("This is an animal constructor. ");
	}
	public Animal(String args){
		System.out.println("This is an animal constructor with name: "+args);
	}
	public String getName(){
		return this.name;
	}
	public void setName(String n){
		this.name = n;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int a){
		this.age = a;
	}
	public void show(){
		System.out.println("age: "+this.age+"  name: "+this.name);
	}
}

class Cat extends Animal{
	public Cat (){
		System.out.println("Cat constructor.");
	}
	public Cat(String name){
		this.name = name;
		System.out.println("Cat constructor with name: "+this.name);
	}
	public void catchMouse(){
		System.out.println("catchMouse method.");
	}
}

class Dog extends Animal{
	public Dog(){
		System.out.println("Dog constructor.");
	}
	public Dog(String name){
		System.out.println("Dog constructor with name: "+name);
	}
	public void lookDoor(){
		System.out.println("lookDoor method.");
	}
}

public class InheritTest {
	static {System.out.println("**Begin**");}
	private InheritTest(){	}
	public static void main(String [] args){
		Animal animal = new Animal("mmb");
		Cat cat = new Cat("Killty");
		Dog dog = new Dog("001");
		cat.catchMouse();
		dog.lookDoor();
		cat.show();
		dog.show();
		animal.show();
	}

}

