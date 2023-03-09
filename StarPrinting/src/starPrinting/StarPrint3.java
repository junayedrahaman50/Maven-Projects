package starPrinting;

import java.util.Scanner;

public class StarPrint3 {
	static void printStar(int i, int j, int rows) {	// parameters
		//outer loop
		for(i=1;i<=rows;i++) {
			//inner loop
			for(j=1;j<=rows;j++) {
				if((i+j) <= rows)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int i = 0, j = 0, rows;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Number of rows: ");
			rows = sc.nextInt();
			printStar(i,j,rows); // arguments
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
