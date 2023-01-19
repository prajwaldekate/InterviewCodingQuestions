package com.String;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		
		String str="abcdeafbgh" ;
		
		char ch[] = str.toCharArray();
		
		Arrays.sort(ch);  //aabbcdefgh
		
		for(int i=0; i<ch.length-1; i++)
		{
			if(ch[i] != ch[i+1])
			{
				System.out.println(ch[i]);
			}
		}	
	}
}
