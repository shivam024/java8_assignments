package com.shivam.lamda;

public class LamdaImplementation {
	
	public static void main(String[] args) {
		LamdaExpression addition = (a,b)-> a+b;
		LamdaExpression subtraction = (a,b)-> a-b;
		LamdaExpression multiply = (a,b)-> a*b;
		LamdaExpression division = (a,b)-> a/b;
		LamdaExpression modulus = (a,b)->a%b;
		
		
		System.out.println(addition.calculator(10, 20));
		System.out.println(subtraction.calculator(10, 20));
		System.out.println(multiply.calculator(10, 20));
		System.out.println(division.calculator(10, 20));
		System.out.println(modulus.calculator(70, 20));
		
		
		
	}
	

}
