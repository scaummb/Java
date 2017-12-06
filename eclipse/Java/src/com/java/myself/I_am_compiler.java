package com.java.myself;

public class I_am_compiler {
	
	public static void main(String[] args) {
		tapeDeck t = new tapeDeck();
		t.canRecord = true;
		t.playTape();
		
		if (t.canRecord == true){
			t.recordTape();
		}
	}

}

class tapeDeck{
	boolean canRecord = false;
	void playTape(){
		System.out.println("tape playing");
	}
	
	void recordTape(){
		System.out.println("tape recording");
	}
}

