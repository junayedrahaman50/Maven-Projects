package oops;
// Abstract Class (Full Abstraction can not be achieved cause it contain concrete class)
abstract class Bank1{
	// Abstract method
	abstract void getLoanInterest();
	// Concrete Method
	public void display() {
		System.out.println("Interest Rate of Banks");
	}
}
class SBI extends Bank1{

	@Override
	// method overriding
	void getLoanInterest() {
		System.out.println("Interest Rate is 7.5%");
	}
	public void display() {
		System.out.println("SBI");
		System.out.println("========================");
	}
	
}
class HDFC extends Bank1{

	@Override
	// method overriding
	void getLoanInterest() {
		System.out.println("Interest Rate is 8%");
	}
	public void display() {
		System.out.println("HDFC");
		System.out.println("========================");
	}
	
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// UP Casting
		Bank1 B1 = new SBI();
		B1.getLoanInterest();
		B1.display();
		B1 = new HDFC();
		B1.getLoanInterest();
		B1.display();
		
	}

}
