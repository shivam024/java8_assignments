package com.shivam.test;

import java.util.ArrayList;

import com.shivam.support.MyDate;

public class MyTestUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<TestRecords> testRecordList= new ArrayList<TestRecords>();
		testRecordList.add(new TestRecords(new MyDate(10, 12, 2012), new MyDate(20, 12, 2012), 10));
	}


	}


