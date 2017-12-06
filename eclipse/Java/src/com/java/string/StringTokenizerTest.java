package com.java.string;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Welcome to the new world mmb.");
		while(st.hasMoreTokens()){
//			System.out.println(st.nextToken());
			System.out.print(st.nextToken());
		}

	}

}
