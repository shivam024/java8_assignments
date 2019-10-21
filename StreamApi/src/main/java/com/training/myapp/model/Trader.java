package com.training.myapp.model;

import java.util.Objects;

public class Trader {
private String traderName;
private String traderCity;
public Trader() {
	super();
}
public Trader(String traderName, String traderCity) {
	super();
	this.traderName = traderName;
	this.traderCity = traderCity;
}
public String getTraderName() {
	return traderName;
}
public void setTraderName(String traderName) {
	this.traderName = traderName;
}
public String getTraderCity() {
	return traderCity;
}
public void setTraderCity(String traderCity) {
	this.traderCity = traderCity;
}
@Override
public String toString() {
	return "Trader [traderName=" + traderName + ", traderCity=" + traderCity + "]";
}
//@Override
//public int hashCode() {
//	
//	
//	return Objects.hash(traderName,traderCity);
//}
//@Override
//public boolean equals(Object obj) {
//	Trader o=(Trader) obj;
//	if(this==null && obj==null)
//		return false;
//	if(this==obj)
//		return true;
//	if(getClass()!=obj.getClass())
//		return false;
//	return  Objects.equals(this.getTraderCity(), o.getTraderCity());
//	
//	 
//
//	
//}
@Override
public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;
Trader obj =  (Trader) o;
return
Objects.equals(traderCity, obj.getTraderCity());
}
 
@Override
public int hashCode() {
return Objects.hash(traderCity);
}

}
