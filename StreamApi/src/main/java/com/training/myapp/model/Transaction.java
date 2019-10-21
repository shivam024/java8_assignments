package com.training.myapp.model;

import java.util.Objects;

public class Transaction {
private Trader trader;
private int transactionYear;
private int transactionValue;
public Transaction() {
	// TODO Auto-generated constructor stub
}

public Transaction(Trader trader, int transactionYear, int transactionValue) {
	super();
	this.trader = trader;
	this.transactionYear = transactionYear;
	this.transactionValue = transactionValue;
}


@Override
public String toString() {
	return "Transaction [trader=" + trader + ", transactionYear=" + transactionYear + ", transactionValue="
			+ transactionValue + "]";
}

public Trader getTrader() {
	return trader;
}
public void setTrader(Trader trader) {
	this.trader = trader;
}
public int getTransactionYear() {
	return transactionYear;
}
public void setTransactionYear(int transactionYear) {
	this.transactionYear = transactionYear;
}
public int getTransactionValue() {
	return transactionValue;
}
public void setTransactionValue(int transactionValue) {
	this.transactionValue = transactionValue;
}

@Override
public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;
Transaction obj =  (Transaction) o;
return
Objects.equals(trader, obj.getTrader());
}
 
@Override
public int hashCode() {
return Objects.hash(trader);
}



}
