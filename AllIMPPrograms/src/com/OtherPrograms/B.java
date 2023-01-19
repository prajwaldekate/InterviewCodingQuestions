package com.OtherPrograms;

public class B extends A {
	
	
	public B()
	{
		System.out.println("Hellow");
	}
	
	
	public B(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		B b = new B(10);
	}
}
