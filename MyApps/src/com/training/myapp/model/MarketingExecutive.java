package com.training.myapp.model;

public class MarketingExecutive extends Employee {
private double kiloMeters;
private double tourAllowance;
private double telephoneAllowance=1500;

public double getKiloMeters() {
	return kiloMeters;
}

public void setKiloMeters(double kiloMeters) {
	this.kiloMeters = kiloMeters;
}

public double getTourAllowance() {
	return tourAllowance;
}

public void setTourAllowance(double tourAllowance) {
	this.tourAllowance = tourAllowance;
}

public double getTelephoneAllowance() {
	return telephoneAllowance;
}

public void setTelephoneAllowance(double telephoneAllowance) {
	this.telephoneAllowance = telephoneAllowance;
}

public MarketingExecutive(int employeeId, String employeeName, double basicSalary,double kiloMeters) {
	super(employeeId, employeeName, basicSalary);
	// TODO Auto-generated constructor stub
	this.kiloMeters=kiloMeters;
	this.tourAllowance=5*kiloMeters;
		
}

@Override
	public double grossSalary() {
		// TODO Auto-generated method stub
	double grossSalary=getBasicSalary()+getTourAllowance()+getTelephoneAllowance()+getHra()+getMedical();
		return grossSalary;
	}
@Override
	public double netSalary() {
		// TODO Auto-generated method stub
	double netSalary=(getBasicSalary()+getHra()+getMedical())-(getPt()+getPf());
		return super.netSalary();
	}

@Override
public String toString() {
	return "MarketingExecutive [getKiloMeters()=" + getKiloMeters() + ", getTourAllowance()=" + getTourAllowance()
			+ ", getTelephoneAllowance()=" + getTelephoneAllowance() + ", grossSalary()=" + grossSalary()
			+ ", netSalary()=" + netSalary() + "]";
}
@Override
	public void showDetails(Employee employee) {
		// TODO Auto-generated method stub
	System.out.println("Employee Id:"+employee.getEmployeeId()+"\n"+"Employee Name:"+employee.getEmployeeName()+"\n"+"Basic Salary:"+employee.getBasicSalary()+"\n"+"MarketingExecutive [KiloMeters travelled=" + getKiloMeters() + ", TourAllowance()=" + getTourAllowance()
	+ ",TelephoneAllowance()=" + getTelephoneAllowance() + ", grossSalary()=" + grossSalary()
	+ ", netSalary()=" + netSalary() + "]");
	}




}
