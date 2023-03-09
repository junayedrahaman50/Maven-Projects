package basic_string;

import java.util.Scanner;

public class FormatString {


	public static void main(String[] args) {
		

		// create scanner object
		Scanner sc = new Scanner(System.in);
		// taking input
		String input = sc.nextLine();
		// getting length of input
		int number = input.length();
		char[] arr = new char[number];
		// getting character at 0th index
		
		for(int i = 0; i<number;i++) {
			char fc = input.charAt(i);
			arr[i] = fc; 
			
			System.out.println(arr[i]);
			//int fcl = fc.lenght();
			//String hexString = String.format("%c%x",fc, number);
		}
		// string format method to convert from integer to hexadecimal
		
		
		//System.out.print(hexString);

	}

}
