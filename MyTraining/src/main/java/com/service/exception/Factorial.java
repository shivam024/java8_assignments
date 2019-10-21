package com.service.exception;

import com.service.exception.shivam.invalidInputException;

public class Factorial {
	
	public static int getFactorial(int number) {
		int factorial = 1;
		try {
			if(number<2) throw new invalidInputException("Enter the proper number");
			else {
				for(int i=number; i>=2;i--) {
					factorial*=i;
					
				}
			}
		}
		catch(invalidInputException e) {
			System.out.println(e.getMessage());
		}
		return factorial;
	}

}
