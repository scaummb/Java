package com.rightshift;

public class RightShift {

	public static void main(String[] args) {
		System.out.println("****************************");
		int i = 4;
		System.out.println("-----int >> : " + i);
		System.out.println("��λǰ�Ķ����ƣ�"+ Integer.toBinaryString(i));
		i >>= 1;
		System.out.println("��λ��Ķ����ƣ�"+Integer.toBinaryString(i));
		System.out.println("-----int >> :"+i);
		System.out.println("****************************");
		
		i = -4;
		System.out.println("-----int >>> : " + i);
		System.out.println("��λǰ�Ķ����ƣ�"+ Integer.toBinaryString(i));
		i >>>=1;
		System.out.println("��λ��Ķ����ƣ�"+Integer.toBinaryString(i));
		System.out.println("-----int >>> :"+i);
		System.out.println("****************************");
		
		short j = -4;
		System.out.println("-----int >>> : " + j);
		System.out.println("��λǰ�Ķ����ƣ�"+ Integer.toBinaryString(j));
		j >>>=1;
		System.out.println("��λ��Ķ����ƣ�"+Integer.toBinaryString(j));
		System.out.println("-----int >>> :"+j);
		System.out.println("****************************");
		
		i = 5;
		System.out.println("-----int >> : " + i);
		System.out.println("��λǰ�Ķ����ƣ�"+ Integer.toBinaryString(i));
		//����λ�����ܳ���32bit����˲�����ȡ��Ĳ�����a>>n == a>>(n%32)
		i >>= 32; 
		System.out.println("��λ��Ķ����ƣ�"+Integer.toBinaryString(i));
		System.out.println("-----int >> :"+i);
		System.out.println("****************************");
		

	}

}
