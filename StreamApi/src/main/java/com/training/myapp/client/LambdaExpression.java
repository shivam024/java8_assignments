package com.training.myapp.client;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpression {
public static void main(String[] args) {
Predicate<Integer> isOdd=(a)->{
	if(a>0) {
	if(a%2!=0)
		return true;
	else
	
		return false;
	}
	return false;
	
};


Predicate<Integer> isPrime=(a)->{
	if(a>0) {
	 for(int i = 2; i <= a/2; ++i)
     {
         // condition for nonprime number
         if(a % i == 0)
         
             return false;
         
         
     }
	 return true;
			
	
	
	}
	return false;
};
Predicate<Integer> isPalindrome=(a)->{
	int sum=0;
	int r;
	int temp=a;
	while(a>0){    
		   r=a%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   a=a/10;    
		  }    
		  if(temp==sum) 
			  return true;
		  else
			  return false;
};
	
	

System.out.println("Check whether number is odd or not "+isOdd.test(67));
System.out.println("Check whether number is odd or not "+isOdd.test(-9));
System.out.println("Check whether number is prime or not "+isPrime.test(13));
System.out.println(isPrime.test(9));
System.out.println(isPrime.test(0));
System.out.println(isPrime.test(-8));
System.out.println("Check whether number is palindrome or not "+isPalindrome.test(123321));
}
}
