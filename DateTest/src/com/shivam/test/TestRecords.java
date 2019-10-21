package com.shivam.test;

import com.shivam.support.MyDate;

public class TestRecords {
	MyDate startdate;
	MyDate endDate;
	int exectedOutput;

	public TestRecords(MyDate myDate, MyDate myDate2, int i) {
		// TODO Auto-generated constructor stub
	}

	public MyDate getStartdate() {
		return startdate;
	}

	public void setStartdate(MyDate startdate) {
		this.startdate = startdate;
	}

	public MyDate getEndDate() {
		return endDate;
	}

	public void setEndDate(MyDate endDate) {
		this.endDate = endDate;
	}

	public int getExectedOutput() {
		return exectedOutput;
	}

	public void setExectedOutput(int exectedOutput) {
		this.exectedOutput = exectedOutput;
	}

	@Override
	public String toString() {
		return "TestRecords [startdate=" + startdate + ", endDate=" + endDate + ", exectedOutput=" + exectedOutput
				+ "]";
	}
	
	

}

