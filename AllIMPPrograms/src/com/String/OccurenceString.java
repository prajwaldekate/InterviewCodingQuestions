package com.String;

import java.util.HashMap;

public class OccurenceString {

	public static void main(String[] args) {
		
		String str="prajwaldekate";
		
		HashMap<Character, Integer> hashMap = new HashMap<>();
		
		for(int i=str.length()-1; i>=0; i--)
		{
			if(hashMap.containsKey(str.charAt(i)))
			{
				Integer count = hashMap.get(str.charAt(i));
				hashMap.put(str.charAt(i), ++count);
			}
			else
			{
				hashMap.put(str.charAt(i), 1);
			}
		}
		System.out.println(hashMap);
	}
}
