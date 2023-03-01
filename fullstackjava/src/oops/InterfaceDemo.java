package oops;
// interface
interface Printable{
	int x = 100;
	void display(); // abstract by default
	void fun();
}
class Print implements Printable{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of display");
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of fun");
		
	}

}
class Print2 implements Printable{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of display by Print2 class");
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of fun by Print2 class");
		
	}

}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UP Casting
		Printable P1 = new Print();
		P1.display();
		P1.fun();
		P1 = new Print2();
		P1.display();
		P1.fun();

	}

}
