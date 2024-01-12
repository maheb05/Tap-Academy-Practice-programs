package exceptionhandling;

import java.util.*;

public class BasicExceptionHandling {
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter numerator");
			int n = scan.nextInt();
			System.out.println("Enter denominator");
			int d = scan.nextInt();
			int a = n/d;
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println("Invalid Input");
		}
	}

}
