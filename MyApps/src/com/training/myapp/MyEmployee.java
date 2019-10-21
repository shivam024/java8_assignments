package com.training.myapp;

import com.training.myapp.model.Employee;
import com.training.myapp.model.Manager;
import com.training.myapp.model.MarketingExecutive;

public class MyEmployee {
	public static void main(String[] args) {
		Employee e=new Employee(101,"khairu",120000);
		System.out.println(e);
		//System.out.println(e.);
		Manager e1=new Manager(112,"siri",50000);
		e1.showDetails(new Employee(112,"siri",50000));
		Employee ex=new MarketingExecutive(113,"sahithi",80000,90);
		ex.showDetails(new Employee(113,"sahithi",80000));
//		System.out.println("My Gross Salary is"+e1.grossSalary());
//		MarketingExecutive m1=new MarketingExecutive(123,"Sree Lekha",200000,500);
//		System.out.println(m1);
		
		
	}

}
