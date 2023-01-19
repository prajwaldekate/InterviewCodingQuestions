package com.Arrays;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,80,10,20,50,70};
		int x=0;
		
		Arrays.sort(arr);
		
		int a[]=new int[arr.length];
		
		for(int i=0; i<arr.length-1; i++)
		{
				if(arr[i] != arr[i+1])
				{
					a[x]=arr[i];
					x++;
				}
		}
		
		a[x]=arr[arr.length-1];
		
		for(int v:a)
		{
			System.out.println(v);
		}
	}
}
