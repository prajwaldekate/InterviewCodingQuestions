package com.Arrays;

public class MargeTwoArrays {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60};
		int b[]= {70,80,90};
		
		int x[]=new int[a.length+b.length];
		int q=0;
		
		for(int i=0; i<a.length; i++)
		{
			x[q]=a[i];
			q++;
		}
		
		/*for(int i=0; i<b.length; i++)
		{
			x[a.length+i]=b[i];
		}*/
		
		for(int j=0; j<b.length; j++)
		{
			x[q]=b[j];
			q++;
		}
		
		for(int p : x)
		{
			System.out.println(p);
		}
	}
}
