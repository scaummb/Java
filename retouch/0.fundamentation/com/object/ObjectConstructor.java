package com.object;

public class ObjectConstructor {
	public static void main(String[] args){
		Duck duck = new Duck();
	}
}

class Duck{
	public Duck(){
		System.out.println("开往白天的夜，有没有终点");
	}
}