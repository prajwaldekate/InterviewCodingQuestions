package com.Arrays;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,80,10,20,50,70};

		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] != arr[i+1])
			{
				System.out.println(arr[i]);
			}
		}
	}
}
