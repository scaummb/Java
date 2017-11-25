package PrepareTest;
//对于一个有序数组，我们通常采用二分查找的方式来定位某一元素，请编写二分查找的算法，在数组中查找指定元素。 
public class test03 {

	public static void main(String[] args) {
        int A[] = { 4, 4, 5, 5, 5, 5 };
        int val = 4;
        int n = A.length;
        int result = getPos(A, n, val);
        System.out.println(result);
	}

	private static int getPos(int[] a, int n, int val) {
		int low = 0,high = n - 1,mid;
		if(a == null && n == 0){
			return -1;
		}
		while(low < high ){
			mid = (low + high)/2;
			if(a[mid] < val){
				low = mid;
			}else if(val < a[mid]){
				high = mid - 1;
			}
			// 当第一次找出相等的位置后需要继续向前查找，最后返回第一次出现的位置
			else if(val == a[mid]){
				for(int j = mid; j >= 0; j--){
					if(a[j] != a[mid]){
						mid = j +1;
						break;
					}
					//处理出现连号的情况时，返回第一个号码的索引
					else if(a[j] == a[mid]){
						mid = j;
						continue;
					}
				}
				return mid;
			}
		}
		return 0;
	}

}
