package PrepareTest;
//查找第一个重复的元素
import java.util.HashSet;

public class test01 {

	public static void main(String[] args) {
		String A = "qyweyfs22334d";
		int n = A.length();
		char b = findFirstRepeat(A);
		System.out.println(b);
	}

	private static char findFirstRepeat(String a) {
		HashSet hs = new HashSet();
		int length = a.length();
		//toCharArray() String to char
		char[] b = a.toCharArray();
		//利用HashSet返回值判断
		for(int i=0; i < length; i++){
			System.out.println("-----");
			boolean c = hs.add(b[i]);
			System.out.println(c);
			if(c == false){
				return b[i];
			}
		}
		return 0;
	}

}
