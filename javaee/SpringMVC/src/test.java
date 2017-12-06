
public class test {
	public static void main(String[] args){
		int[] a1 = {8,9,7,5,2,1,6,3};
		int[] a2 = {8,9,7,5,2,1,6,3};
		int[] a3 = {8,9,7,5,2,1,6,3};
		show(a1);
		System.out.println("\n ----------1");
		sort1(a1);
		System.out.println("\n ----------2");
		sort2(a2);
		System.out.println("\n ----------3");
		sort3(a3);
	}
	public static void sort1(int[] arr){
		/*
		 * ≤Â»Î≈≈–Ú∑®
		 * */
		int len = arr.length;
		for(int i = 1; i<len;i++){
			int temp = arr[i];
			int j = i;
			while(j>0 && arr[j-1]>temp){
				arr[j-1]=arr[j] ;
				j--;
			}
			arr[j] = temp;
		}
		System.out.println("arr1: "+arr.toString());
		show(arr);
	}
	public static void sort2(int[] arr){
		/*
		 * √∞≈›≈≈–Ú∑®
		 * */
		int len = arr.length;
		int temp ;
		for(int j = 0;j<len;j++){
			for(int i = 1;i<len-j;i++){
				if(arr[i-1]>arr[i]){
					temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
				}
			}
		}
		System.out.println("arr2: "+arr.toString());
		show(arr);
	}
	public static void sort3(int[] arr){
		/*
		 * —°‘Ò≈≈–Ú∑®
		 * */
		int len = arr.length;
		for(int i=0;i<len;i++){
			int temp=arr[i];
			int j = i;
			for(int k=1;k<len;k++){
				if(arr[k]<temp){
					temp = arr[k];
					j=k;
				}
			}
			if(j != i){
			}
		}
		System.out.println("sort3: "+arr.toString());
		show(arr);
		
	}
	public static void show(int[] arr){
		for(int a:arr){
			System.out.print(a+" ");
		}
	}
}

