package basic;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		for(int i=n; i>0; i--) {
			for(int j=0; j<n; j++) {
				if(j<i)
				System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
