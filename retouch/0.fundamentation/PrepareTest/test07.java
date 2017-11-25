package PrepareTest;

import java.util.ArrayList;
import java.util.Scanner;

public class test07 {

	public static void main(String[] args) {
		System.out.println("please input two numbers: ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(sumcount(m, n));
	}
	
	public static double sumcount(int m, int n){
		ArrayList arr = new ArrayList();
		double sum = 0,temp = n;
		for(int i = 1; i <= m; i++){
			sum += temp;
			temp = Math.pow(temp, 2); 
		}
		return sum;
	}

}
