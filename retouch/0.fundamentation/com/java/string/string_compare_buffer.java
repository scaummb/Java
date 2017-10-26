package com.java.string;
class TestStringBuffer{
	static long time1 ;
	public static  void test(){
//	StringBuffer sb = "Come on";//StringBuffer不能使用赋值实现
		StringBuffer sb1 = new StringBuffer("Hello***");
	    String sb2 = "*mmvb";
		System.out.println(sb1+" and "+sb2);
		long start = System.currentTimeMillis();
		for(int a = 0;a<=1000;a++){
			sb1.append(sb2);
			System.out.println(a+" : sb1: "+sb1);
		}
		long end = System.currentTimeMillis();
		long runtime = end - start;
		time1 = runtime;
		System.out.println("runtime: "+runtime);
	
	}
}
class TestString{
	static long time2;
	public static void test(){
		String s = "Hello world";
		String s1 = new String("Hello China");
		long start = System.currentTimeMillis();
		for(int a = 0;a<=1000;a++){
			s+=s1;
			System.out.println(a+" : s: "+s);
		}
		long end = System.currentTimeMillis();
		long runtime = end - start;
		time2 = runtime;
		System.out.println("runtime: "+runtime);
		
	}
	
}
public class string_compare_buffer {

	public static void main(String[] args) {
//		TestString.test();//不能对类型 TestString 中的非静态方法 test（）进行静态引用
		TestString.test();
		TestStringBuffer.test();
		System.out.println(TestString.time2);
		System.out.println(TestStringBuffer.time1);
		long a = TestString.time2;
		long b = TestStringBuffer.time1;
		if (a > b){
			System.out.println("string costs much more time.");
		}else if (a == b){
			System.out.println("costs the same time.");
		}else{
			System.out.println("stringbuffer costs much more time.");
		}

	}

}
