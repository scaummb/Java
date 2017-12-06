package com.colection.Set;

import java.util.HashSet;
import java.util.Set;
/*
 * Collection:
 * 		List:元素有序(存储和取出顺序一致)，可重复
 * 		Set:元素无序,唯一
 */
public class SetDemo {

	public static void main(String[] args) {
		//不能实例化类型 Set<String>
//		Set<String> set = new Set<String>();
		// 创建集合对象
		Set<String> set = new HashSet<String>();
		
		set.add("mmb1");
		set.add("mmb2");
		set.add("add");
		
		for(String s : set){
			System.out.println(s);
		}

	}

}
