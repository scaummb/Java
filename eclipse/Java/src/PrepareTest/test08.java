package PrepareTest;

import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
		System.out.println("please input tow strings :");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println("mirro string : "+ compare(s1, s2));
		
	}
	public static boolean compare(String s1,String s2){
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		int i1 = a1.length,i2 = a2.length;
		//same length
		if(i1 == i2){
			int k1 = 0;
			int k2 = i1-1;
			try{				
				while(a1[k1] == a2[k2] ){
					System.out.println(a1[k1] +" and "+ a2[k2]);
					if(k1+1 < i1 ){
						k1++;
						k2--;						
					}
					if(k2 == 0 && k1 == i1 -1){
						return true;
					}
				}				
			}catch (Exception e ){
				e.printStackTrace();
			}
		}
		return false;
	}
}
