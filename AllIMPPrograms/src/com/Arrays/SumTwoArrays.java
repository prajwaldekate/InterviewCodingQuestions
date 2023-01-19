package com.Arrays;

public class SumTwoArrays {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60};
		int b[]= {70,80,90};
		int x=0;
		int y=0;
		
		for(int i=0; i<a.length; i++)
		{
			x=x+a[i];
		}
		
		for(int j=0; j<b.length; j++)
		{
			y=y+b[j];
		}
		
		int z=x+y;
		System.out.println(z );
	}
}
