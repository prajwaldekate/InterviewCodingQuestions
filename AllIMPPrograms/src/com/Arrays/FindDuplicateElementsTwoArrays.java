package com.Arrays;

public class FindDuplicateElementsTwoArrays {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		
		int b[]= {60,70,80,10,90,20,100};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i] == b[j])
				{
					System.out.println(b[j]);
				}
			}
		}
	}
}
