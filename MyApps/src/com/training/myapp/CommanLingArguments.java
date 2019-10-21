package com.training.myapp;

import java.util.Scanner;

public class CommanLingArguments {
	
	
	public static void main(String args[]) {
//		CommanLingArguments x=new CommanLingArguments();
//		x.arguments();
int num;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of integers");
		num=input.nextInt();
		
		int array[] = new int[num];
		 System.out.println("Enter "+num+"of elements");
		for(int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
			
		}
		
		
		// TODO Auto-generated method stub
		for(int i=0;i<num;i++)
			System.out.println(array[i]);
//		return array;
		
	}
	

}
