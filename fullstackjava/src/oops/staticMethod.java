package oops;
import java.util.Scanner;
class data{
	int id;
	String name;
	long phoneNumber;
	static String collegeName="WBSU"; // static variable
	//static block
	static {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter College Name: ");
		collegeName = sc.nextLine();
	}
    data(int id, String name, long phoneNumber){
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public void getData() {
		System.out.println("Id: " +id+ ", Name: "+
	name+ ", College Name: " +collegeName+ ", Phone Number: "+phoneNumber);
	}
	public static void changeCollege() {
		collegeName="CU";
		
	}
	
}
public class staticMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data d1 = new data(100, "Arjun", 1234567890l);
		d1.getData();
//		data.changeCollege();
		
		data d2 = new data(101, "Anmol", 1234567890l);
		d2.getData();
	}

}
