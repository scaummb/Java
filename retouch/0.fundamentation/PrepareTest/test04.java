package PrepareTest;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class test04 {

	public static void main(String[] args) {
        String A = "qyywyer233y3333333tdd";
        int n = A.length();
        findFirstRepeat(A, n);    
	}

	private static void findFirstRepeat(String a, int n) {
		int sum = 1;
		LinkedHashMap<String,Integer> hashmap = new LinkedHashMap<String,Integer>();//�²����key-value��value����ʼֵ��Ϊ1
        //��LinkedHashMap���洢��ֵ��
        //HashMap��������˳��һ��
        //��LinkedHashMap��������˳����ͬ�����ȴ������ʾ��Ҳ����β��
		//HashSetҪ���ܴ��ظ�Ԫ�أ���HashMap��LinkedHashMap���Դ��ظ�Ԫ�ء�
		System.out.println(a);
		for(int i = 0;i<n;i++){
			//��main�д�������String���Ͳ���һ���ַ�һ���ַ���ת��Ϊchar���ͣ����㴦��
			char item = a.charAt(i);
			//�ٽ�ÿһ��char���͵��ַ�ת��ΪString���͡���һ����������һ�����������Ƿ����ÿһ���ַ���
			String item2 = String.valueOf(item);
			String key = item2;
			// �ж��Ƿ����ָ���ļ�ֵ
			boolean contains = hashmap.containsKey(key);
			if(contains){
				sum++;
				hashmap.put(key, sum);				
			}else{
				sum = 1;
				hashmap.put(key, sum);
			}
		}
		//��������ϣ���е����м�ֵ��
		System.out.println(hashmap);
		//������ͨ��������valueֵ����key�Ĺ���
        //�����еļ�ֵ�Դ���һ��entrySet��
        //����entrySet,���ҵ�value���ڸ�����valueֵ�������Ӧkeyֵ����keyList�С�
		List<String> keyList = new ArrayList<String>();  
		System.out.println("****");
		System.out.println(hashmap.entrySet());
		//Ϊʲô�������Է��� ���ֵ�һ�ε� �ظ�Ԫ���أ� ������LinkedHashMap �Ĳ���������
		for(Entry<String, Integer> e : hashmap.entrySet()){
			if(e.getValue().equals(2)){
				keyList.add(e.getKey());
			}
		}
		 //������keyList�������һ�γ��ֵ�key���ɡ�
		for(String i : keyList){
			System.out.println(i);
			break;
		}
		
	}

}
