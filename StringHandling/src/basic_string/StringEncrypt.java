package basic_string;

import java.util.Scanner;

public class StringEncrypt {
	
	public static String encryptString(String S) {
	//Initialize an empty StringBuilder to store the encrypted string
	    StringBuilder sb = new StringBuilder();
	//Initialize a variable count to 1 to keep track of the number of characters.
	    int count = 1;
	    char prevChar = S.charAt(S.length() - 1);
	    
	    for (int i = S.length() - 2; i >= 0; i--) {
	        char currChar = S.charAt(i);
	        if (currChar == prevChar) {
	 //If the current character is equal to the previous character increment  count.
	            count++;
	        }
//If the current character is not equal to the previous character, append the character and the //hexadecimal representation of the count to the StringBuilder, reset the count to 1.
	        else {
	        	sb.append(Integer.toHexString(count));
	            sb.append(prevChar);
	            
	            count = 1;
	        }
	        prevChar = currChar;
	    }
//toHexString() method to convert the integer count to its hexadecimal representation.
	    sb.append(Integer.toHexString(count));
	    sb.append(prevChar);

	    
	    //System.out.println(sb);
	    return sb.toString();
	}


	public static void main(String[] args) {
		System.out.print("Enter String to encrypt: ");
		try (Scanner sc = new Scanner(System.in)) {
			String input = sc.nextLine();
			//pass the input and print output
			System.out.println(encryptString(input));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
