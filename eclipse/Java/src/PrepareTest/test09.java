package PrepareTest;

import java.util.Scanner;

public class test09 {
	public static int compare(int num,int key){
	       if (key >= num) {
	            return 1;
	        } else {
	            return 0;
	        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input min parameters: ");
		int b = sc.nextInt();
		System.out.println("please input max parameters: ");
		int a = sc.nextInt();
		System.out.println("please input key parameters: ");
		int key = sc.nextInt();
		if(a == 0 && b == 0 && key == 0){
			System.out.println("error");
		}else if(b > a){
			System.out.println("error");
		}else{
			  while (a >= b) {
	                for (int i = 0; i < 6; i++) {
	                    int num;
	                    num = (a + b) / 2;
	                    System.out.println("num=" + num);
	                    int s = compare(key, num);
	                    if (s == 0) {
	                        b = num;
	                        System.out.println("0");
	                        break;
	                    } else {
	                        a = num;
	                        System.out.println("1");
	                        break;
	                    }
	                }
	                break;
	            }
		}
		
	}

}
