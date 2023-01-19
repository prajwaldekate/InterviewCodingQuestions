package com.String;
//How do you reverse a given string in place? (solution)

public class ReverseString {

	public static void main(String[] args) {
		
		String str="abcdef";
		
		char[] ch = str.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}	
		
	}
}
