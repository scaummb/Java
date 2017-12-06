package com.colection.ArrayList_Vector_LinkedList.Generic.example;

public class InterTest {

	public static void main(String[] args) {
		InterImpl baby = new InterImpl();
		baby.show("I'm a baby.");
		baby.show(100);
		
		//不能实例化类型 Inter，说明接口不能被直接实例化，需要经过类的implements
//		Inter mama = new Inter();

	}

}
