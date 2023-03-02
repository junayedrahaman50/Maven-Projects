package basic;

import java.util.Arrays;

public class MoveNegative {

	// static method that returns an array
	public static int[] returnArray() {
		int[] input = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		Arrays.sort(input);
		return input;
	}
	
	public static void main(String[] args) {
	// storing the return value of returnArray() function in output array
	// calling static method needs no object creation
		int[] output = returnArray();
	// printing output array with space
		for(int i=0;i<output.length;i++) {
			System.out.print(output[i] + " ");
		}

	}

}
