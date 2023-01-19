package com.Arrays;

public class SumEvenOrOdd {

	public static void main(String[] args) {
		
		int arr[]= {10,5,2,20,78,3,65,63,48,12,54,26,78};
		
		int even=0;
		int odd=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				even = even + arr[i];
			}
			else
			{
				odd=odd + arr[i];
			}
		}
		
		System.out.println("EvenSum>>" + even);
		System.out.println("OddSum>>" + odd);
		
	}
}
