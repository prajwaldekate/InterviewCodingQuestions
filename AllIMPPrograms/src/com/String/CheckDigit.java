package com.String;

public class CheckDigit {

	public static void main(String[] args) {
		
		String str="abcd15se";
		
		String string = str.replaceAll("[a-z]", "");
		
		System.out.println(string);
	}
}
