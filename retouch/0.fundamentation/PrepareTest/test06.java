package PrepareTest;
/**
 * ����������ζ����Ʊ��λ����ͬ������
 * 
 * @param m ����m
 * @param n ����n
 * @return ����
 */
public class test06 {

	public static void main(String[] args) {
		System.out.println(countBiDiff(88,99));
	}
	static public int countBiDiff(int m ,int n){
		int x = m ^ n;
		int y = 0;
		while(x>0){
			if((x&1) == 1){
				y += 1;
			}
			x = x >> 1;
		}
		return y;
	}
}
