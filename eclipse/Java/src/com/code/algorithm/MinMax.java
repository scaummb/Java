package com.code.algorithm;
//ʹ��˫Ԫ�ط�
public class MinMax {
	static int Max;
	static int Min;
	
	public static void GetMaxMin(int arr[]){
		Max = arr[0];
		Min = arr[0];
		int len = arr.length;
		for(int i = 1; i<len -1; i += 2){
			//�������ֻʣһ������ͬʱ��Max��Min�Ƚϣ�
			if(i + 1 > len){
				if(arr[i] > Max){
					Max = arr[i];
				}
				if(arr[i] < Min){
					Min = arr[i];
				}
			}
			//�����Ƚϣ��ϴ�����Max�Ƚϣ���С����Min�Ƚϣ�
			if(arr[i] > arr[i+1]){
				if(arr[i] > Max){
					Max = arr[i];
				}
				if(arr[i+1] < Min){
					Min = arr[i+1];
				}
			}
			
			if(arr[i] < arr[i+1]){
				if(arr[i] < Min){
					Min = arr[i] ;
				}
				if(arr[i+1] > Max){
					Max = arr[i+1];
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = {1,53,6546,67,252,444};
		GetMaxMin(a);
		System.out.println("Min: "+Min);
		System.out.println("Max: "+Max);
	
	}

}
