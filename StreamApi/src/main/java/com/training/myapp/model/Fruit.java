package com.training.myapp.model;

import java.util.Comparator;

public class Fruit {
	private String fruitName;
	private int fruitCalories;
	private int fruitPrice;
	private String fruitColur;

	public Fruit() {
		super();
	}

	public Fruit(String fruitName, int fruitCalories, int fruitPrice, String fruitColur) {
		super();
		this.fruitName = fruitName;
		this.fruitCalories = fruitCalories;
		this.fruitPrice = fruitPrice;
		this.fruitColur = fruitColur;
	}

	@Override
	public String toString() {
		return "Fruit [fruitName=" + fruitName + ", fruitCalories=" + fruitCalories + ", fruitPrice=" + fruitPrice
				+ ", fruitColur=" + fruitColur + "]";
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public int getFruitCalories() {
		return fruitCalories;
	}

	public void setFruitCalories(int fruitCalories) {
		this.fruitCalories = fruitCalories;
	}

	public int getFruitPrice() {
		return fruitPrice;
	}

	public void setFruitPrice(int fruitPrice) {
		this.fruitPrice = fruitPrice;
	}

	public String getFruitColur() {
		return fruitColur;
	}

	public void setFruitColur(String fruitColur) {
		this.fruitColur = fruitColur;
	}

	public static class FruitCalorieComparator implements Comparator<Fruit> {

		@Override
		public int compare(Fruit o1, Fruit o2) {
			if (o1.getFruitCalories() > 100 && o2.getFruitCalories() > 100)
				return Integer.compare(o2.getFruitCalories(), o1.getFruitCalories());
			return 0;
		}

	}

}
