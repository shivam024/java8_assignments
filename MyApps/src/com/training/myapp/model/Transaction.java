package com.training.myapp.model;


import java.time.LocalDateTime;

public class Transaction {
	private double transactionId;
	private LocalDateTime transactionTimeStamp;
	private double transactionAmount;
	private BankAccount accountId;
	public Transaction(double transactionId, LocalDateTime transactionTimeStamp, double transactionAmount) {
		super();
		this.transactionId = transactionId;
		this.transactionTimeStamp = transactionTimeStamp;
		this.transactionAmount = transactionAmount;
	}
	
	public Transaction() {
		super();
	}
	public double getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(double transactionId) {
		this.transactionId = transactionId;
	}
	public LocalDateTime getTransactionTimeStamp() {
		return transactionTimeStamp;
	}
	public void setTransactionTimeStamp(LocalDateTime transactionTimeStamp) {
		this.transactionTimeStamp = transactionTimeStamp;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	@Override
	public String toString() {
		return "transactionId=" + transactionId + ", transactionTimeStamp=" + transactionTimeStamp
				+ ", transactionAmount=" + transactionAmount ;
	}
	
	
	
	

}
