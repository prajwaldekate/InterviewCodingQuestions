package com.Arrays;

public class CountEvenOdd {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,5,6,77,88,5,55,64,78,13,56};
		
		int Evencount=0;
		int Oddcount=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				Evencount++;
			}
			else
			{
				Oddcount++;
			}
		}
		
		System.out.println("Even numbeer>>" + Evencount);
		System.out.println("Odd Number>>" + Oddcount);
	}
}
