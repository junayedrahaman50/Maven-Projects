package basic;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
		String input = null;
		do {
		System.out.println("Enter number to get factorial");
		int x = sc.nextInt();
		int fact = 1;
		for(int i = 1; i<=x; i++) {
			fact = fact * i;
		}
		String output = String.format("The factorial is %d", fact);
		System.out.println(output);
		System.out.println("Do Again? (Y/N) ");
		input = sc.next();
		}
		while(input.equals("Y"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
