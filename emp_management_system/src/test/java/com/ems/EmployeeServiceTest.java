package com.ems;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ems.service.EmployeeService;

class EmployeeServiceTest {
EmployeeService empService; // reference variable
@BeforeEach
void setup() {
	empService = new EmployeeService();
}
@AfterEach
void cleanup() {
	empService = null;
	System.out.println("garbage collected");
}
	@Test
	@DisplayName("Test for addEmployee method")
public void addEmployeeTest() {
		empService.addEmployee(101, "Samuel", 35000, "Kolkata", "India");
		empService.addEmployee(102, "Arnold", 35000, "Kolkata", "India");
		assertEquals(2, empService.lengthOfList());
	}
	@Test
	@DisplayName("Test For displayAll Employee")
	public void testDisplayAll() {
		empService.addEmployee(101, "Samuel", 35000, "Kolkata", "India");
		assertThat(empService.displayAll()).isNotNull();
	}

}
