package com.shivam.transaction;

public class Transaction {
	int id;
	String name;
	String depositDate;
	String withdrowDate;
	double ammount;
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", name=" + name + ", depositDate=" + depositDate + ", withdrowDate="
				+ withdrowDate + ", ammount=" + ammount + "]";
	}
	public Transaction() {
		super();
	}
	public Transaction(int id, String name, String depositDate, String withdrowDate, double ammount) {
		super();
		this.id = id;
		this.name = name;
		this.depositDate = depositDate;
		this.withdrowDate = withdrowDate;
		this.ammount = ammount;
	}
	public Transaction(String name, String depositDate, String withdrowDate, double ammount) {
		super();
		this.name = name;
		this.depositDate = depositDate;
		this.withdrowDate = withdrowDate;
		this.ammount = ammount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepositDate() {
		return depositDate;
	}
	public void setDepositDate(String depositDate) {
		this.depositDate = depositDate;
	}
	public String getWithdrowDate() {
		return withdrowDate;
	}
	public void setWithdrowDate(String withdrowDate) {
		this.withdrowDate = withdrowDate;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	
	
	
}
