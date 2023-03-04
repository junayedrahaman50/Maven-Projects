package basic;

import java.util.Arrays;

public class KLargestElement{
public static void kLarge(int[] arr) {
	
	for(int i=0; i<arr.length; i++) {
		// when k = 3
		int k = 3;
		if(i == k-1)
		System.out.println(arr[i]);
		// when k = 4
		k = 4;
		if(i == k-1)
		System.out.println(arr[i]);
		
	}
}
	
public static void main(String[] arg) {
	// Initialize array
	 int arr[] = {7, 10, 4, 3, 20, 15};
	 Arrays.sort(arr);
	 // Pass the sorted array
	 kLarge(arr);
	 
}
}