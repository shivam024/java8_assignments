package com.training.myapp.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfIntegers {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		Collections.addAll(numbers, 22, 76, 1, 22, 77, 90, 6, 12, 32, 45);
		System.out.println("Numbers in List are");
		numbers.forEach((s) -> System.out.println(s));
		Predicate<Integer> even = (s) -> {
			if (s > 0) {
				if (s % 2 == 0)
					return true;
				else
					return false;
			} else
				return false;
		};
		List<Integer> listOfEvenNumbers = numbers.stream().filter(even).collect(Collectors.toList());
		System.out.println("List of Even numbers");
		listOfEvenNumbers.forEach((s) -> System.out.println(s));
		Predicate<Integer> odd = (s) -> {
			if (s > 0) {
				if (s % 2 != 0)
					return true;
				return false;
			}
			return false;
		};
		List<Integer> listOfOddNumbers = numbers.stream().filter(odd).collect(Collectors.toList());
		System.out.println("List of Odd Numbers");
		listOfOddNumbers.forEach((s) -> System.out.println(s));
		Predicate<Integer> divisibleBy6 = (s) -> {
			if (s > 0) {
				if (s % 6 == 0)
					return true;
				return false;
			}
			return false;
		};
		List<Integer> listOfNumbersDivisibleBy6 = numbers.stream().filter(divisibleBy6).collect(Collectors.toList());
		System.out.println("List Of Numbers Divisible by 6");
		listOfNumbersDivisibleBy6.forEach((s) -> System.out.println(s));
		List<Integer> listOfNumbersLessThan12 = numbers.stream().filter((s) -> (s < 12)).collect(Collectors.toList());
		System.out.println("List of Numbers less than 12");
		listOfNumbersLessThan12.forEach((s) -> System.out.println(s));
		List<Integer> listOfNumbersGreaterThan50 = numbers.stream().filter((s) -> (s > 50))
				.collect(Collectors.toList());
		System.out.println("List of Numbers greater than 50");
		listOfNumbersGreaterThan50.forEach((s) -> System.out.println(s));

	}
}
