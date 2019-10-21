package com.shivam.inheritance;

public class PublicTraining extends Training {

	int participants;

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = 50;
	}

	public PublicTraining() {
		super(id, subject, fees);
		this.participants = participants;
		
	}

	public double getOrderValue() {
		return participants * getFees();
	}

}
