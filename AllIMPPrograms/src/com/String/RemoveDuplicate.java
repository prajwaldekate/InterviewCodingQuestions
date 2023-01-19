package com.String;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String str="rajeshdhonde" ;
		
		char ch[] = str.toCharArray();
		
		Arrays.sort(ch);
		
		for(int i=0; i<ch.length-1; i++)
		{
			if(ch[i] != ch[i+1])
			{
				System.out.println(ch[i]);
			}
		}
		
		System.out.println(ch[str.length()-1]);
	}
}
