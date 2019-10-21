	package com.service.inheritance;

public class Training {
	int id;
	String subject;
	double fees;
	
	public Training() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Training(int id, String subject, double fees) {
		super();
		this.id = id;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Training [id=" + id + ", subject=" + subject + ", fees=" + fees + "]";
	}
	
	
	
	

}
