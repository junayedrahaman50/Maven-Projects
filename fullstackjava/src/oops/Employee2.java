package oops;
class dataEmp{
// instance variables
	int empId, basicSalary, servedYear, travelAllowance;
	String empName, designation;
// setter method
public void setData(int id, int Salary, int Year, String Name, String Designation) {
// assigning values of local variables in instance variables using this keyword
	this.empId = id;
	this.basicSalary = Salary;
	this.servedYear = Year;
	this.empName = Name;
	this.designation = Designation;
	
}
// method to check served year and 10% increment to salary if server year is > 1
public void getAppriasal() {
	if(servedYear > 1) {
		basicSalary += basicSalary * 0.10;
	}
}
// method to calculate travel allowance
public void calculateTA(){
	if(designation.equals("manager")) {
		basicSalary += 3000;
		travelAllowance = 3000;
	}
	else {
		basicSalary += 1000;
		travelAllowance = 1000;
	}
}
// getter method
public void getData() {
		System.out.println("Emp id: " + empId + " Salary: " + basicSalary+ " Year: " +
servedYear + " Name: "+empName+ " Designation: "+ designation+ " Travel Allowance: "+ travelAllowance);

	}
}

public class Employee2 {

	public static void main(String[] args) {
		// object creation
		dataEmp D1  = new dataEmp();
		// passing values to setData method
		D1.setData(101, 30000, 2, "Arjun", "manager");
		// call getAppriasal method
		D1.getAppriasal();
		// call calculatTA method
		D1.calculateTA();
		// call getData method
		D1.getData();

	}

}
