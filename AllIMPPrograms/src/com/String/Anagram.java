package com.String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1="abba";
		String s2="abac";
				
		if(s1.length() == s2.length())
		{
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean b = Arrays.equals(ch1, ch2);
			
			if(b)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("non anagram");
			}
		}
		else
		{
			System.out.println("non anagrams");
		}
	}
}
