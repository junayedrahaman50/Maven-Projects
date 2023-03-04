package basic;

public class CountPair {

	public static void Count(int[] arr) { 
	// initialize variables
		int i = 0;
		int sum = 0;
		int count = 0;
		// add 0 index element with indexes greater than 0
		for(i=1;i<arr.length;i++) {
			sum = arr[0] + arr[i];
			if(sum == 6)
				count++;
			//System.out.println(sum + " " +count);

		}
		// add 1 index element with indexes greater than 1
		for(i=2;i<arr.length;i++) {
			sum = arr[1] + arr[i];
			if(sum == 6)
				count++;
			//System.out.println(sum +" " +count);
		}
		// add 2 index element with indexes greater than 2
		for(i=3;i<arr.length;i++) {
			sum = arr[2] + arr[i];
			if(sum == 6)
				count++;
			//System.out.println(sum +" " +count);
		}
		// print count
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 5, 7, -1};
		Count(arr);
		
	}

}
