package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class StremeDao {
	public List<Fruit> findAllFruit() {
		List<Fruit> fruit = Arrays.asList(
				new Fruit("Apple", 100, 200, "Red"), 
				new Fruit("Orange", 50, 80, "orange"),
				new Fruit("Banana", 200, 20, "yello"),
				new Fruit("Kiwi", 100, 20, "Reddies")

		);
		return fruit;
	}
	
	public List<News> findAllNews() 
	{
		List<News> news = Arrays.asList(
				new News(1001, "Socail", "Anit-Socail", "this is fake news"),
				new News(1123, "NDTV", "Good News", "Gives real news"),
				new News(1001, "Zee", "BJP Based", "this is fake news")
				
				);
		return news;
	}
}
