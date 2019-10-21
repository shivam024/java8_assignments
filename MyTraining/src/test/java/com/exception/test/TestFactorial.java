package com.exception.test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.service.exception.Factorial;
import com.service.exception.shivam.invalidInputException;

public class TestFactorial {
	
	Scanner sc = new Scanner(System.in);
	int number;
	
	@Before
	public void inputNumber() {
		number = sc.nextInt();
	}
	
	

	@Test
	public void testNumberIsGreaterThan2() throws invalidInputException{
		assertEquals(Factorial.getFactorial(number), Factorial.getFactorial(number));
	}
	@Test
	public void testNumberIsLessThan2() throws invalidInputException{
		assertEquals(Factorial.getFactorial(1), Factorial.getFactorial(number));
	}
	@After
	public void endTest() {
		sc.reset();
	}
	
	
	
	
	
	

}
