package oops;
interface Printable1
{
	// methods are abstract by default
	void display();
	void fun();
	}
interface drawable extends Printable1
{
	void draw();
	}
interface Sayble
{
	void say();
	}
class Print1 implements drawable
{

	@Override
	public void display() {
		System.out.println("this is a msg");
		
	}

	@Override
	public void fun() {
		System.out.println("java is fun");
		
	}

	@Override
	public void draw() {
		System.out.println("draw something");
		
	}
	}
class Message1 implements drawable,Sayble
{

	@Override
	public void display() {
		System.out.println("Hello world");
		
	}

	@Override
	public void fun() {
		System.out.println("Programming is fun");
		
	}

	@Override
	public void say() {
		System.out.println("say something");
		
	}

	@Override
	public void draw() {
		System.out.println("Draw rectangle");
		
	}
	
	}
public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		Print1 pr=new Print1();
		pr.display();
		pr.fun();
		pr.draw();
		Message1 msg=new Message1();
		msg.say();
		msg.display();
		msg.fun();
		msg.draw();

	}

}