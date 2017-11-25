package PrepareTest;

import java.util.Scanner;

//类型转化
public class test05 {

	public static void main(String[] args) {
		//(1)string --->> char/char[]
		String str = "mmb";
		char str0 = str.charAt(0);
		char str2 = str.charAt(2);
		System.out.println(str0+" "+str2);
		
		char a[] = str.toCharArray();
		System.out.println(a[0]+" "+a[2]);
		
		//(2)char/char() --->> string
		//static String	valueOf(char[] data) 
        //返回 char 数组参数的字符串表示形式。
		char m = 'a';
		String str3 = String.valueOf(m);
		System.out.println(str3);
		char [] mm = {'a','b'};
		String str4 = String.copyValueOf(mm);
		System.out.println(str4);
		
		//(3)int --->> String
		System.out.println("Please input an Integer: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		String s = String.valueOf(i);
		System.out.println("string s : "+ s);
		String ss = Integer.toString(i);
		System.out.println("string ss : "+ ss);
		String sss = " " + i;
		
		//String ----》 int
		System.out.println("Please input an Integer: ");
		Scanner sc1 = new Scanner(System.in);
		String string  = sc1.nextLine();
		//Question
		int ii = Integer.parseInt(string,2);
		int iii = Integer.parseInt(string,2);
		System.out.println("ii : "+ii+"\n"+"iii : "+iii);
		
	}

}
