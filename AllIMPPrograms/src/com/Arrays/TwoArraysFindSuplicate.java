package com.Arrays;

public class TwoArraysFindSuplicate {

	public static void main(String[] args) {
		
		String a[]= {"as", "bg", "fr", "vf" ,"dfgf"};
		
		String b[]= {"fd", "fr", "fde", "as", "ki"};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i] == b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
