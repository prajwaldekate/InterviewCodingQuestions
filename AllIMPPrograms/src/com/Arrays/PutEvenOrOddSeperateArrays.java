package com.Arrays;
//26)	Put Even and Odd Elements in 2 Separate Arrays

public class PutEvenOrOddSeperateArrays {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		int even[]=new int[arr.length];
		
		int odd[]=new int[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] %2==0)
			{
				even[i]=arr[i];
			}
			else
			{
				odd[i]=arr[i];
			}
		}
		
		for(int x:even)
		{
			System.out.println("Even number>>" + x);
		}
	}
}
