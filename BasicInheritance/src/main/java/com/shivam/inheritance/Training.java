package com.shivam.inheritance;

public class Training {
	int id;
	String subject;
	Double fees;

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
		this.subject = "java";
	}

	public Double getFees() {
		return 5000.00;
	}

	public void setFees(Double fees) {
		this.fees = 5000.00;
	}

	public Training(int id, String subject, Double fees) {
		super();
		this.id = id;
		this.subject = subject;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Training [id=" + id + ", subject=" + subject + ", fees=" + fees + "]";
	}

}
