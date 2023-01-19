package com.Arrays;

public class SumArrays {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60,70,80,90};

		int x=0;
		
		for(int i=0; i<arr.length; i++)
		{
			x = x + arr[i];
		}
		System.out.println("Total Sum>>" + x);
	}
}
