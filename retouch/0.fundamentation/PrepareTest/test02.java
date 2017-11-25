package PrepareTest;
//输入一个正数n，输出所有和为n的连续正数序列
public class test02 {

	public static void main(String[] args) {
		getAns(15);
	}

	private static void getAns(int n) {
		int min = 1;
		int sum = 1;
		int max = 1;
		while(min <= n/2+1){
			if(sum == n){
				for(int k=min;k<=max;k++){
					System.out.println(k+" ");
				}
				System.out.println();
				sum = sum - min;
				min++;max++;sum=sum+max;
			}
			if(sum>n){
				sum = sum - min;
				min++;
			}else{
				max++;
				sum = sum +max; 
			}
		}
	}

}
