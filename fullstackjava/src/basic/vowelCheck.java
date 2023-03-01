package basic;

import java.util.Scanner;

class VC{
	char vowels[] = {'a', 'e', 'i', 'o', 'u'};
	int i;
	public void vowel(String str) {
		int strLength = str.length();
		for(i=0; i<strLength; i++) {
			char c = str.charAt(i);
			if(Character.compare(c, vowels[i]) == 0) {
				System.out.println("vowels are present");
			}
			else {
				System.out.println("vowels are not present");
			}
		}
	}
}
class vowelCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		VC vc = new VC();
		vc.vowel(input);
	}

}
