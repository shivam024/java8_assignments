package com.training.myapp.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

import com.training.myapp.model.Fruit;

public class MyFruit {
public static void main(String[] args) {
	List<Fruit> fruits=new ArrayList<>();
	Collections.addAll(fruits, new Fruit("Apple",200,120,"Red"),new Fruit("Mango", 600, 80, "Yellow"),new Fruit("Cherry", 50, 30, "Red"),
			new Fruit("Orange", 150, 80, "Orange"),new Fruit("Pomegranate", 300, 80, "Pink"),new Fruit("Banana",200,40,"Yellow"),new Fruit("Grapes", 90, 120, "Green")
			,new Fruit("Dragon", 80, 170, "Pink"),new Fruit("Guava", 30, 50, "Green"));
	
	
	
	Comparator<Fruit> c=(fruit1,fruit2)->{
		
		return Integer.compare(fruit2.getFruitCalories(), fruit1.getFruitCalories());
		
		
	};
	
	//List of fruits sorted in descending order
	List<Fruit> lowCalorieFruits= fruits.stream().filter((fruit)->fruit.getFruitCalories()<100).sorted(c).collect(Collectors.toList());
	 lowCalorieFruits.forEach(s->System.out.println(s));
	 System.out.println("Red colour fruits are ");
	 
	 Function<Fruit, String> fruitName=(F)->F.getFruitName();
	 //Colour wise display the fruits	 
		List<String> redColourFruits=fruits.stream().filter((s)->s.getFruitColur().equals("Red")).map(fruitName).collect(Collectors.toList());
		redColourFruits.forEach((s)->System.out.println(s));
		System.out.println("yellow colour fruits are ");
		List<String> yellowColourFruits=fruits.stream().filter((s)->s.getFruitColur().equals("Yellow")).map(fruitName).collect(Collectors.toList());
		yellowColourFruits.forEach((s)->System.out.println(s));
		System.out.println("Pink colour fruits are ");
		List<String> pinkColourFruits=fruits.stream().filter((s)->s.getFruitColur().equals("Pink")).map(fruitName).collect(Collectors.toList());
		pinkColourFruits.forEach((s)->System.out.println(s));
		System.out.println("Green colour fruits are ");
		List<String> greenColourFruits=fruits.stream().filter((s)->s.getFruitColur().equals("Green")).map(fruitName).collect(Collectors.toList());
		greenColourFruits.forEach((s)->System.out.println(s));
		
		//Display the REd colour fruits and in sorted way
		Comparator<Fruit> p=(fruit1,fruit2)->{
			return Integer.compare(fruit1.getFruitPrice(), fruit2.getFruitPrice());
		};
		List<Fruit> redColourFruitsInSorted=fruits.stream().filter((fruit)->fruit.getFruitColur().equals("Red")).sorted(p).collect(Collectors.toList());
		redColourFruitsInSorted.forEach(s->System.out.println(s));
		
		
}
}
