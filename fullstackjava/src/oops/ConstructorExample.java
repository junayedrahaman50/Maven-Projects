package oops;
class Employee
{
	// instance variables
	int id;
	String name,city,state,designation,country;
	long phno,salary;
	// parameterized constructors
	public Employee(int id,String name,String city)
	{
		// storing values of local variables in instance variables using this keyword
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public Employee(int id, String name,String city,String country,String state)
	{
		this(id,name,city);
		this.country=country;
		this.state=state;
	}
	public Employee(int id, String name,String city,String country,String state,long phno,long salary,String designation)
	{
		this(id,name,city,country,state);
		this.phno=phno;
		this.salary=salary;
		this.designation=designation;
}
	@Override
	// overriding toString method
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id = ");
		builder.append(id);
		builder.append(", Name = ");
		builder.append(name);
		builder.append(", City = ");
		builder.append(city);
		builder.append(", State = ");
		builder.append(state);
		builder.append(", Designation = ");
		builder.append(designation);
		builder.append(", country = ");
		builder.append(country);
		builder.append(", Phone number = ");
		builder.append(phno);
		builder.append(", Salary = ");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	}
// implementation class
public class ConstructorExample {

	public static void main(String[] args) {
		// constructor overloading and pass by value	
		Employee emp1=new Employee(101, "Suvojit", "kolkata");
		System.out.println(emp1.getId()+" "+emp1.getName()+" "+emp1.getCity());
		Employee emp2=new Employee(102, "Arpan","Sreerampore", "India", "WB");
		System.out.println(emp2.getId()+" "+emp2.getName()+" "+emp2.getCity()+" "+emp2.getCountry()+" "+emp2.getState());
		
		Employee emp3=new Employee(103, "Arjun","Delhi", "India", "Delhi", 988888888l,50000l, "Fire Fighter");
		System.out.println(emp3.getId()+" "+emp3.getName()+" "+emp3.getCity()+" "+emp3.getCountry()+" "+emp3.getState()+" "+emp3.getPhno()+" " +emp3.getSalary()+" "+emp3.getDesignation());
		System.out.println(emp3);
	}

}



