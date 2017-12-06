package com.polymorphic;
class Super{
	public int f(){
		System.out.println(this.f());
		return 1111;
	}
}
class subClass extends Super{
//	public float f(){
	public int f(){
		System.out.println(super.f());
		return 2222;
	}
} 
public class PolymorphicTestSixth {

	public static void main(String[] args) {
		Super ss = new subClass();
		System.out.println(ss.f());
		
	}

}
