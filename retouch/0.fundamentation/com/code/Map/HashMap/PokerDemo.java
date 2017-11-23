package com.code.Map.HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
 * A:创建一个HashMap集合
 * B:创建一个ArrayList集合
 * C:装牌
 * D:洗牌
 * E:发牌
 * F:看牌
 */
public class PokerDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		String[] colors = { "♠", "♥", "♣", "♦" };
		String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
				"K", "A", "2" };
		
		int key = 0;
		
		for(String number : numbers){
			for(String color : colors){
				//String.concat:  将指定字符串连接到此字符串的结尾。
				String value = color.concat(number);
				//hashMap:  在此映射中 关联 指定值与指定键。如果 key 没有任何映射关系，则返回值：null，
				hm.put(key, value);
//				System.out.println("------");
//				System.out.println(hm.put(key, value));
				array.add(key);
				key++;
			}
		}
		
		hm.put(key, "little king");
		array.add(key);
		key++;
		hm.put(key, "big king");
		array.add(key);
		
		//Collections 此类完全由在 collection 上进行操作或返回 collection 的静态方法组成。它包含在 collection 上操作的多态算法，
		//即“包装器”，包装器返回由指定 collection 支持的新 collection，以及少数其他内容。
		//shuffle : 使用默认随机源对指定列表进行置换。
		System.out.println("*****"+array.toString());
		Collections.shuffle(array);
		System.out.println("*****"+array.toString());
		
		TreeSet<Integer> caoCao = new TreeSet<Integer>();
		TreeSet<Integer> liuBei = new TreeSet<Integer>();
		TreeSet<Integer> sunQuan = new TreeSet<Integer>();
		TreeSet<Integer> diPai = new TreeSet<Integer>();
		
		for (int x = 0; x < array.size(); x++) {
			if (x >= array.size() - 3) {
				diPai.add(array.get(x));
			} else if (x % 3 == 0) {
				caoCao.add(array.get(x));
			} else if (x % 3 == 1) {
				liuBei.add(array.get(x));
			} else if (x % 3 == 2) {
				sunQuan.add(array.get(x));
			}
		}
		
		// 看牌
		lookPoker("曹操", caoCao, hm);
		lookPoker("刘备", liuBei, hm);
		lookPoker("孙权", sunQuan, hm);
		lookPoker("底牌", diPai, hm);	
		
		
	}
	public static void lookPoker(String name, TreeSet<Integer> array,HashMap<Integer,String> hm){
		System.out.println(name + " \' card is ");
		for(Integer s : array){
			System.out.println(s + " ");
		}
		System.out.println();
	} 

}
