package com.OtherPrograms;

import java.util.Arrays;

public class OccurencePrograms {

	public static void main(String[] args) {
		
		String str="abcdefghabcd";
		
		char ch[] = str.toCharArray();
		
		Arrays.sort(ch);
		
		char c[] = new char[ch.length];
		int x=0;
		
		for(int i=0; i<ch.length-1; i++)
		{
			for(int j=i+1; j<ch.length-1; j++)
			{
				if(ch[i] != ch[j])
				{
					System.out.println();
					/*ch[x]=ch[j];
					x++;*/
				}
			}		
		}
		
		//System.out.println(ch[str.length()-1]);
		
		for(char a : c)
		{
			System.out.println(a);
		}
		
		
	}

}
