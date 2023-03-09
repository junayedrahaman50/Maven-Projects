package basic_string;

import java.util.Scanner;

public class ReverseWords {
	
	static String reverse(String str) {
		 // Split str into words
		String[] words = str.split(" ");
		//new empty stringbuilder to store output
		StringBuilder sb = new StringBuilder();
		
		for(int i= words.length - 1; i>=0; i--) {
	//append words followed by a space in stringbuilder sb
			sb.append(words[i]).append(" ");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		while(3>2) {
		System.out.print("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		//Take input string
		String str = sc.nextLine();
		//pass input to reverse method
		System.out.println(reverse(str));
		System.out.println("Press N to exit: ");
		String exit = sc.nextLine();
		if(exit.equals("N")) 
			break;
		}

	}

}
