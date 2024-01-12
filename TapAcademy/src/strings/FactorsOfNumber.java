package strings;

import java.util.Scanner;
public class FactorsOfNumber {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Factors of a Given Number");
		factors(n);
		
		System.out.println();
	}
	
	
	
	
	
	
	static void factors(int n){
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				System.out.print(i+" ");
			}
		}
	
	}

}
