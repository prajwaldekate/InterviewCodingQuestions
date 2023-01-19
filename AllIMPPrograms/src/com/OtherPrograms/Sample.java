package com.OtherPrograms;
//String
public class Sample {

	public static void main(String[] args) {
		
		String s1="ram";   //1
		String s2= new String("ram");   //2
		String s3="abc"; //1
		String s4="ram"; 
		
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
