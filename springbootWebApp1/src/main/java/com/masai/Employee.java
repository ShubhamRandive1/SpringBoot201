package com.masai;

public class Employee {
	
	private int empId;
	
	private String empName;
	
	private String empDepartment;
	
	private double salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int empId, String empName, String empDepartment, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.salary = salary;
	}
	
	

}
