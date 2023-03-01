package oops;
// Grand Parent
interface A {
// abstract by default
void M();
}
// Parent 1
interface B extends A{
void N();
}
// Parent 2
interface C extends A{
	void O();
}
// class D deriving/implementing from interface B & C 
class D implements B, C{
	@Override
	// implementation of method M(), N() & O() 
	public void M() {
		System.out.println("Method of interface A");
	}
	public void N() {
		System.out.println("Method of interface B");
	}
	public void O() {
		System.out.println("Method of interface C");
	}
	
}
//Implementation class
public class multipleInheritance {

	public static void main(String[] args) {
		D D1 = new D();
		D1.M(); // call M()
		D1.N(); // call N()
		D1.O(); // call O()
	}

}
