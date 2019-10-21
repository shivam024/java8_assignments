package com.training.myapp.model;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hra;
	private double medical = 100;
	private double pf;
	private double pt = 200;
	private double netSalary;
	private double grossSalary;

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getPt() {
		return pt;
	}

	public void setPt(double pt) {
		this.pt = pt;
	}

	public Employee() {

	}

	public Employee(int employeeId, String employeeName, double basicSalary) {
		super();
		this.hra = 0.5 * basicSalary;
		this.pf = 0.12 * basicSalary;

		this.netSalary = this.netSalary();
		this.grossSalary = this.grossSalary();

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}

	public double grossSalary() {
		this.grossSalary = basicSalary + this.hra + this.medical;
		return this.grossSalary;
	}

	public double netSalary() {
		this.netSalary = this.grossSalary() - (this.pt + this.pf);
		return this.netSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Id:" + employeeId + "\n" + "Employee Name:" + employeeName + "\n" + "Basic Salary:"
				+ basicSalary + "\n" + "Net Salary" + this.netSalary() + "\n" + "Gross Salary" + this.grossSalary()
				+ "\n" + "hra" + hra + "\n" + "pt" + pt + "\n" + "pf" + pf + "\n" + "medical" + medical;
	}

	public void showDetails(Employee employee) {
		System.out.println("Employee Id:" + employee.getEmployeeId() + "\n" + "Employee Name:"
				+ employee.getEmployeeName() + "\n" + "Basic Salary:" + employee.getBasicSalary() + "\n" + "Net Salary"
				+ this.netSalary() + "\n" + "Gross Salary" + this.grossSalary());

	}

}
