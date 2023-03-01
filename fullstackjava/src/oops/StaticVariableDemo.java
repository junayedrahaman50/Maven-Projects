package oops;
public class StaticVariableDemo {
	// initializing static variable count 
	static int count = 0;
	public StaticVariableDemo(){
		count++;
	}
//Stack reference variable
	// object in heap area 
	// Static variable class area
	public static void main(String[] args) {
		StaticVariableDemo s1 = new StaticVariableDemo();
		StaticVariableDemo s2 = new StaticVariableDemo();
		StaticVariableDemo s3 = new StaticVariableDemo();
		System.out.println(count);
	}

}
