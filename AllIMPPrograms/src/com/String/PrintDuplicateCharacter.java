package com.String;

import java.util.Arrays;

//How do you print duplicate characters from a string? (solution)

public class PrintDuplicateCharacter {

	public static void main(String[] args) {
		
		String str="abcdefab";
		
		char ch [] =str.toCharArray();
		
		Arrays.sort(ch);
		
		for(int i=0; i<ch.length-1; i++)
		{
			if(ch[i]==ch[i+1])
			{
				System.out.println(ch[i]);
			}
		}
	}
}
