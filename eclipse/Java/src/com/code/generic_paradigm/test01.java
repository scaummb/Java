package com.code.generic_paradigm;
//类型类 + 类型方法
class FX<T>{
	private T ob;
	public FX(T ob){
		this.ob = ob ;		
	}
	public T getob(){
		return ob;
	}
	public void showetype(){
		System.out.println("T real parttern is :"+ob.getClass().getName());
	}
}

public class test01 {
	public static void main(String [] args){
		FX<Integer> intob = new FX<Integer>(100) ;
		intob.showetype();
		System.out.println("value="+intob.getob());
		System.out.println("------------------");
		
		FX<String> strob = new FX<String>("mmb");
		strob.showetype();
		System.out.println("value="+strob.getob());
	}

}
