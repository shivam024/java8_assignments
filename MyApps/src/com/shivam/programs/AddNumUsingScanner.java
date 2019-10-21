package com.shivam.programs;

import java.util.Scanner;

public class AddNumUsingScanner {
	public static void main(String[] args) {
		int num1,num2,sum;
		System.out.println("Enter the first number");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("Enter the secand number");
		
		num2 = sc.nextInt();
		sc.close();
		sum = num1 + num2;
		System.out.println();
		
	}
}
