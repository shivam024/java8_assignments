package com.shivam.inheritance;

public class CorporateTraining extends Training {

	int days;

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public CorporateTraining(int id, String subject, Double fees, int days) {
		super(id, subject, fees);
		// TODO Auto-generated constructor stub
	}

	public double getOrderValue() {
		return days * getFees();

	}

}
