package PrepareTest;
//����һ���������飬����ͨ�����ö��ֲ��ҵķ�ʽ����λĳһԪ�أ����д���ֲ��ҵ��㷨���������в���ָ��Ԫ�ء� 
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
			// ����һ���ҳ���ȵ�λ�ú���Ҫ������ǰ���ң���󷵻ص�һ�γ��ֵ�λ��
			else if(val == a[mid]){
				for(int j = mid; j >= 0; j--){
					if(a[j] != a[mid]){
						mid = j +1;
						break;
					}
					//����������ŵ����ʱ�����ص�һ�����������
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
