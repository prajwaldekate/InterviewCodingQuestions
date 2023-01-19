package com.Arrays;

import java.util.Arrays;

public class RemoveElements {

	public static void main(String[] args) {
		
		int arr[]= {1,25,15,56,56,985,65,89};
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=25)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
