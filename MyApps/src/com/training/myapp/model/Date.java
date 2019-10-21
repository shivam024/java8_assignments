package com.training.myapp.model;

import java.io.ObjectInputStream.GetField;

import com.training.myapp.exception.InvalidDayException;
import com.training.myapp.exception.InvalidMonthException;

public class Date {
private int day;
private int month;
private int year;
	
	public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

	public Date(int dd, int mm, int yyyy) {
		super();
		this.day=dd;
		this.month=mm;
		this.year=yyyy;
		
		// TODO Auto-generated constructor stub
	}

	public Date() {
		// TODO Auto-generated constructor stub
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return day+"/"+month+"/"+year;
		}

	public static boolean swapofdates(Date date1, Date date2) {
		Date swapdate1;
		Date swapdate2;
	swapdate1=date1;
	swapdate2=date2;
	System.out.println("Before swapping Dates Date1:"+date1.getDay()+"/"+date1.getMonth()+"/"+date1.getYear()+"Date 2: "+date2.getDay()+"/"+date2.getMonth()+"/"+date2.getYear());
	Date temp;
	temp=date1;
	date1=date2;
	date2=temp;
	System.out.println("After swapping Dates Date1:"+date1.getDay()+"/"+date1.getMonth()+"/"+date1.getYear()+"Date 2: "+date2.getDay()+"/"+date2.getMonth()+"/"+date2.getYear());
	
	if((swapdate1==date2)&&(swapdate2==date1))
		return true;
	else
		return false;
	
	}
	public static boolean checkMonth(Date d1) throws InvalidMonthException {
		if(d1.getMonth()<=12) {
			System.out.println("Valid Date");
			return true;
		}
		else {
			//return false;
			System.out.println("invalid Date");
			
			throw new InvalidMonthException("InValid Date");
			}
	}
	public static boolean checkDay(Date d) throws InvalidDayException {
		if(d.getDay()<=31) {
			System.out.println("Valid Date");
			return true;
		}
		else 
			throw new InvalidDayException("Invalid Date");
	}
	
	
}
