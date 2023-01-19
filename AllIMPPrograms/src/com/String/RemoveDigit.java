package com.String;

public class RemoveDigit {

	public static void main(String[] args) {
		
		String str="abcd12efgh";
		
		String s = str.replaceAll("[1-9]", "");
		
		System.out.println(s);
	}
}
