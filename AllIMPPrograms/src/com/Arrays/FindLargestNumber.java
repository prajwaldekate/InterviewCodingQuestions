package com.Arrays;

import java.util.Arrays;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		int arr[]= {10,50,70,6,90,8,99,10,20,5,60};
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-1]);
	}
}
