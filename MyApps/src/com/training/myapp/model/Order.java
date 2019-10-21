package com.training.myapp.model;

public class Order {

private int orderNumber;
private String orderNAme;
private double orderPrice;
private String orderStatus;
public int getOrderNumber() {
	return orderNumber;
}
public void setOrderNumber(int orderNumber) {
	this.orderNumber = orderNumber;
}
public String getOrderNAme() {
	return orderNAme;
}
public void setOrderNAme(String orderNAme) {
	this.orderNAme = orderNAme;
}
public double getOrderPrice() {
	return orderPrice;
}
public void setOrderPrice(double orderPrice) {
	this.orderPrice = orderPrice;
}
public String getOrderStatus() {
	return orderStatus;
}
public void setOrderStatus(String orderStatus) {
	this.orderStatus = orderStatus;
}
public Order(int orderNumber, String orderNAme, double orderPrice, String orderStatus) {
	super();
	this.orderNumber = orderNumber;
	this.orderNAme = orderNAme;
	this.orderPrice = orderPrice;
	this.orderStatus = orderStatus;
}
public Order() {
	super();
}
@Override
public String toString() {
	return "Order [orderNumber=" + orderNumber + ", orderNAme=" + orderNAme + ", orderPrice=" + orderPrice
			+ ", orderStatus=" + orderStatus + "]";
}


	
}
