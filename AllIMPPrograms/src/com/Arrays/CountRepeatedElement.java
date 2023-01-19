package com.Arrays;

import java.util.Arrays;

//24)	Count Repeated Elements in Array
public class CountRepeatedElement {

	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,1,6,7,2,8,9,7};  //1,2
		
		Arrays.sort(arr);
		
		int count=0;
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] == arr[i+1])
			{
				count++;
			}
		}
		
		System.out.println("Repeted Elements>>" + count);
	}
}
