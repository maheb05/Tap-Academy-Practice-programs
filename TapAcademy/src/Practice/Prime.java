package Practice;

import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		boolean res = prime(n);
		
		if(res == true) {
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		}
	}
	
	
	
	static boolean prime(int n) {
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
