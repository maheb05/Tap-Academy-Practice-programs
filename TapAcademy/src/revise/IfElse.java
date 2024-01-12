package revise;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a no to check even or odd");
		int n = s.nextInt();
		
		if(n%3==0 && n%5==0) {
			System.out.println("BTM");
		}
		
		else if(n%3==0) {
			System.out.println("TAP");
		}
		else if(n%5==0) {
			System.out.println("ACADEMY");
		}
		
	}

}
