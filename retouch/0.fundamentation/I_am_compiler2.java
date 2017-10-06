package com.java.myself;

public class I_am_compiler2 {
	public static void main(String[] args){
		DVDPlayer d = new DVDPlayer();
		d.canRecord = true;
		d.playDVD();
		
		if (d.canRecord == true){
			d.recordDVD();
		}
	}

}

class DVDPlayer{
	boolean canRecord = false;
	
	void recordDVD(){
		System.out.println("DVD redording...");
	}
	
	void playDVD(){
		System.out.println("DVD playing...");
	}
}