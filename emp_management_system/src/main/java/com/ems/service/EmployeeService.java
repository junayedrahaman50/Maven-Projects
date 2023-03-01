package com.ems.service;

import java.util.ArrayList;
import java.util.List;

import com.ems.entity.Address;
import com.ems.entity.Employee;

public class EmployeeService {
private List<Employee> emp = new ArrayList<>();

public void addEmployee(long empId, String name, double sal,String city, String Country){
	Address add = new Address(city, Country);
	emp.add(new Employee(empId, name, sal, add));
}
public List<Employee> displayAll(){
	return emp;
}
public int lengthOfList() {
	return emp.size();
}
}
