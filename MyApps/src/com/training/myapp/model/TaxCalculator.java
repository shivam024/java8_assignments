package com.training.myapp.model;

import com.training.myapp.exception.CountryNotValidException;
import com.training.myapp.exception.EmployeeNameInvalidException;
import com.training.myapp.exception.TaxNotEligibleException;

public class TaxCalculator {
private String empName;
private double empSalary;
private boolean isIndian;


public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public double getEmpSalary() {
	return empSalary;
}

public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}

public boolean isIndian() {
	return isIndian;
}

public void setIndian(boolean isIndian) {
	this.isIndian = isIndian;
}



public TaxCalculator(String empName, double empSalary, boolean isIndian) {
	super();
	this.empName = empName;
	this.empSalary = empSalary;
	this.isIndian = isIndian;
}

public static int calculateTax(TaxCalculator t) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
	// TODO Auto-generated method stub
	try {
	if(t.isIndian==false) {
		throw new CountryNotValidException("“The employee should be an Indian citizen for calculating tax”");
	}
	
	if(t.empName==""||t.empName==null) {
		throw new EmployeeNameInvalidException("“The employee name cannot be empty”");
	}
	if(t.empSalary<10000) {
		throw new TaxNotEligibleException("“The employee does not need to pay tax”");
	}
	else {
		if(t.empSalary>1000000) {
			int taxAmount=(int) ((t.empSalary*8)/100);
			
			System.out.println("Tax Amount is "+taxAmount);
			return taxAmount;
		}
		else if(t.empSalary>50000&&t.empSalary<100000) {
int taxAmount=(int) ((t.empSalary*6)/100);
			
			System.out.println("Tax Amount is "+taxAmount);
			return taxAmount;
		}
		else if(t.empSalary>30000&&t.empSalary<50000) {
			int taxAmount=(int) ((t.empSalary*5)/100);
						
						System.out.println("Tax Amount is "+taxAmount);
						return taxAmount;
					}
		else  {
			int taxAmount=(int) ((t.empSalary*4)/100);
						
						System.out.println("Tax Amount is "+taxAmount);
						return taxAmount;
					}
	}
	
	
	}
	catch(CountryNotValidException | EmployeeNameInvalidException |TaxNotEligibleException e) {
		
		System.out.println(e.getMessage());
			throw e;
		}

	
		
	}
//public class CountryNotValidException extends Exception{
//	public CountryNotValidException(String message) {
//		super(message);
//	}
//}

}




