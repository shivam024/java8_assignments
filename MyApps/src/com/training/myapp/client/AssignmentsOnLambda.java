package com.training.myapp.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class AssignmentsOnLambda {
public static void main(String[] args) {
	List<String> fruits= new ArrayList<String>();
	fruits.add("apple");
	fruits.add("pineapple");
	fruits.add("banana");
	fruits.add("orange");
	fruits.add("watermelon");
	fruits.add("pear");
	fruits.add("pomegranate");
	StringBuilder str=new StringBuilder();
	fruits.forEach((s)->{		
		str.append(s.charAt(0));		
	});
	System.out.println(str.toString());
	//System.out.print(str.length());
	//-----UnaryOperator Interface and it has apply method it is inherited some default methods from function
	//it takes a type and return the same type UnaryOpertion<T t> and  public T apply(T t)
	UnaryOperator<String> uppercaseFirstLetter=(s)->{
		char[] array=s.toCharArray();
		array[0]=Character.toUpperCase(array[0]);
		return new String(array);
	};
	fruits.replaceAll(uppercaseFirstLetter);
		fruits.forEach((s)->System.out.println(s));
	}
	
}

