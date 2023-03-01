package com.ems.entity;

public class Employee {
private long empID;
private String empName;
private double empSalary;
Address address; //has a relationship
public Employee(long empID, String empName, double empSalary, Address address) {
	super();
	this.empID = empID;
	this.empName = empName;
	this.empSalary = empSalary;
	this.address = address;
}
public long getEmpID() {
	return empID;
}
public String getEmpName() {
	return empName;
}
public double getEmpSalary() {
	return empSalary;
}
public Address getAddress() {
	return address;
}

}
