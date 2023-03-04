package basic;

import java.util.Arrays;

public class MissingNumber {
	public static void missingValue(int[] arr) {
		for(int i = 0; i<arr.length-1; i++) {
		// check if next element is missing and print missing element
			if(arr[i+1] != arr[i]+1) {
				System.out.println(arr[i]+1);
			}
		}
	}

	public static void main(String[] args) {
		// Initialize array
		int[] arr = {1, 2, 4, 6, 3, 7, 8};
		// Sort the array using Arrays.sort() method
		Arrays.sort(arr);
		// Pass array to static method
		missingValue(arr);
	}

}
