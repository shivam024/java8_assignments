package com.training.myapp.model;

public class Manager extends Employee {
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	
	public double getPetrolAllowance() {
		return petrolAllowance;
	}

	public void setPetrolAllowance(double petrolAllowance) {
		this.petrolAllowance = petrolAllowance;
	}

	public double getFoodAllowance() {
		return foodAllowance;
	}

	public void setFoodAllowance(double foodAllowance) {
		this.foodAllowance = foodAllowance;
	}

	public double getOtherAllowance() {
		return otherAllowance;
	}

	public void setOtherAllowance(double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}

	public Manager(int empid, String empName, int salary) {
		super(empid,empName,salary);
		
		this.petrolAllowance=0.08*salary;
		this.foodAllowance=0.13*salary;
		this.otherAllowance=0.03*salary;
		
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "Petrol Allowance "+petrolAllowance+"\n"+"Food Allowance"+foodAllowance+"\n"+"Other Allowances "+otherAllowance+"\n"+"Gross Salary"+grossSalary()+"\n"+"Net Salary "+netSalary();
//	}
	
	@Override
	public double grossSalary() {
		double grossSalary=getBasicSalary()+getFoodAllowance()+getPetrolAllowance()+getOtherAllowance()+getHra()+getMedical();
		// TODO Auto-generated method stub
		return grossSalary;
	}
	@Override
	public String toString() {
		return "Manager [petrolAllowance=" + petrolAllowance + ", foodAllowance=" + foodAllowance + ", otherAllowance="
				+ otherAllowance + "]";
	}

	@Override
	public double netSalary() {
		// TODO Auto-generated method stub
		double netSalary=(getBasicSalary()+getHra()+getMedical())-(getPt()+getPf());
		return netSalary;
	}
@Override
public void showDetails(Employee employee) {
	// TODO Auto-generated method stub
	System.out.println("Employee Id:"+employee.getEmployeeId()+"\n"+"Employee Name:"+employee.getEmployeeName()+"\n"+"Basic Salary:"+employee.getBasicSalary()+"\n"+"Manager [petrolAllowance=" + petrolAllowance + ", foodAllowance=" + foodAllowance + ", otherAllowance="
			+ otherAllowance +   ", grossSalary()=" + grossSalary()
			+ ", netSalary()=" + netSalary() +"]");}
	
	

}
