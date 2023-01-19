package com.OtherPrograms;

import java.util.Scanner;

public class AddNaturalNumber {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number>>");
		int a = scanner.nextInt();
		
		int b=a*(a+1)/2;
		System.out.println(b);
	}
}
