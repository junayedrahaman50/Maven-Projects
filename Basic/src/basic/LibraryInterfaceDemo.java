package basic;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// creating instances of KidUsers class
		KidUsers kid1=new KidUsers(11,"Kids");
		KidUsers kid2=new KidUsers(18,"Fiction");
		
		// calling registerAcount method for KidUsers instances
		kid1.registerAccount();
		kid2.registerAccount();
		
		System.out.println("====================================");
		// calling requestBook method for KidUsers instances
		kid1.requestBook();
		kid2.requestBook();
		System.out.println("====================================");
		
		// creating instances of KidUsers class
		AdultUsers adt1=new AdultUsers(3, "Kids");
		AdultUsers adt2=new AdultUsers(20, "Fiction");
		
		// calling registerAcount method for AdultUsers instances
		adt1.registerAccount();
		adt2.registerAccount();
		System.out.println("====================================");
		
		// calling requestBook method for AdultUsers instances
		adt1.requestBook();
		adt2.requestBook();
		
	}

}
