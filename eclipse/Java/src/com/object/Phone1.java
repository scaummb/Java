package com.object;

public class Phone1 {
	public static void main(String[] args){
		Phone2 p = new Phone2();
		
		//ʹ�ó�Ա����
		System.out.println("Ʒ���ǣ�"+p.brand);
		System.out.println("�۸��ǣ�"+p.price);
		System.out.println("��ɫ�ǣ�"+p.color);
		System.out.println("----------------");
		
		//����Ա������ֵ
		p.brand = "xiaomi";
		p.price = 2599;
		p.color = "black";
		
		//�ٴ�ʹ�ó�Ա����
		System.out.println("Ʒ���ǣ�"+p.brand);
		System.out.println("�۸��ǣ�"+p.price);
		System.out.println("��ɫ�ǣ�"+p.color);
		System.out.println("----------------");
		
		p.call("mmb");
		p.sendMessage();
	}

}
/*
 * 	�ֻ���
		��Ա������Ʒ�ƣ��۸���ɫ
		��Ա��������绰��������
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