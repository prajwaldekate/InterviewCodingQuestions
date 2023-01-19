package com.Arrays;

public class ReverseArrays {

	public static void main(String[] args) {
		
		int arr[]= {10,50,70,6,90,8,99,10,20,5,60};

		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
