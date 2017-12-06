package com.object;

public class Phone1 {
	public static void main(String[] args){
		Phone2 p = new Phone2();
		
		//使用成员变量
		System.out.println("品牌是："+p.brand);
		System.out.println("价格是："+p.price);
		System.out.println("颜色是："+p.color);
		System.out.println("----------------");
		
		//给成员变量赋值
		p.brand = "xiaomi";
		p.price = 2599;
		p.color = "black";
		
		//再次使用成员变量
		System.out.println("品牌是："+p.brand);
		System.out.println("价格是："+p.price);
		System.out.println("颜色是："+p.color);
		System.out.println("----------------");
		
		p.call("mmb");
		p.sendMessage();
	}

}
/*
 * 	手机类
		成员变量：品牌，价格，颜色
		成员方法：打电话，发短信
 * */
class Phone2{
	//brand
	String brand;
	
	//price
	int price;
	
	//color
	String color;
	
	public void call(String name){
		System.out.println("To "+name+" calling..");
	}
	
	public void sendMessage(){
		System.out.println("Message to everybody..");
	}
}