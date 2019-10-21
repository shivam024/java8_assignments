package com.service.inheritance;

public class CorporateTraining extends Training{
	int days;
	double fees;
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public double getFees() {
		return fees*days;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
				
}
