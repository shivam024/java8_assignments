package com.training.myapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarList implements Comparable<CarList> {
	private String make;
	private String model;
	private double price;
	private int year;
	private static CarList list;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static CarList getList() {
		return list;
	}

	public static void setList(CarList carList) {
		CarList.list = carList;
	}

	public CarList() {

	}

	public CarList(String make, String model, double price, int year) {
		this.list = new CarList();
		this.make = make;
		this.model = model;
		this.price = price;
		this.year = year;
	}

	public String getMake() {
		return make;

	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static boolean addElementsToList() {
		return ((List<CarList>) list).add(new CarList("make", "model", 80000, 2019));
	}

	@Override
	public String toString() {
		return "CarArrayList [make=" + make + ", model=" + model + ", price=" + price + ",year" + year + "]";
	}

	@Override
	public int compareTo(CarList o) {
		// TODO Auto-generated method stub
		return this.model.compareTo(o.model);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if ((obj == null) && (getClass() != this.getClass()))
			return false;
		CarList car = (CarList) obj;
		if ((this.make == car.make) && (this.model == car.model))
			return true;
		return false;

		// return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(make, model);
	}

}
