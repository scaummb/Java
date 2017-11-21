package com.test;

import java.util.HashMap;

interface Hashmapp{
	abstract void check(HashMap hs);
}

interface checkhashmap extends Hashmapp{
	public void check(HashMap hs);
}

class ICheckHashMap implements checkhashmap{
	public HashMap hs = null;
	public ICheckHashMap(){
		
	}
	@Override
	public void check(HashMap hs) {
		
	}
	
}

public class interfaceTest {

	public static void main(String[] args) {
		
	}

}
