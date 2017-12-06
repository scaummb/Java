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
		LinkedHashMap<String,Integer> hashmap = new LinkedHashMap<String,Integer>();//新插入的key-value给value赋初始值都为1
        //用LinkedHashMap来存储键值对
        //HashMap插入和输出顺序不一样
        //但LinkedHashMap插入和输出顺序相同，即先存的先显示，也就是尾插
		//HashSet要求不能存重复元素，但HashMap和LinkedHashMap可以存重复元素。
		System.out.println(a);
		for(int i = 0;i<n;i++){
			//将main中传过来的String类型参数一个字符一个字符的转化为char类型，方便处理。
			char item = a.charAt(i);
			//再将每一个char类型的字符转化为String类型。这一步操作和上一步操作作用是分离出每一个字符。
			String item2 = String.valueOf(item);
			String key = item2;
			// 判断是否包含指定的键值
			boolean contains = hashmap.containsKey(key);
			if(contains){
				sum++;
				hashmap.put(key, sum);				
			}else{
				sum = 1;
				hashmap.put(key, sum);
			}
		}
		//输出存进哈希表中的所有键值对
		System.out.println(hashmap);
		//以下是通过给定的value值反查key的过程
        //将所有的键值对存在一个entrySet中
        //遍历entrySet,若找到value等于给定的value值，则将其对应key值存在keyList中。
		List<String> keyList = new ArrayList<String>();  
		System.out.println("****");
		System.out.println(hashmap.entrySet());
		//为什么这样可以返回 出现第一次的 重复元素呢？ 利用了LinkedHashMap 的插入有序性
		for(Entry<String, Integer> e : hashmap.entrySet()){
			if(e.getValue().equals(2)){
				keyList.add(e.getKey());
			}
		}
		 //最后遍历keyList，输出第一次出现的key即可。
		for(String i : keyList){
			System.out.println(i);
			break;
		}
		
	}

}
