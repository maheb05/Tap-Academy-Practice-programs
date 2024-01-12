package revise;

import java.util.Scanner;

public class Looops {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
//		boolean f = checkPrime(n);
//		System.out.println(f);
		
		countPrime(n);
		
		
		
	}
	
	
	
	
	
	
	 static void factors(int n) {
		 int count = 0 ;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count > 2) {
			System.out.println("Not A prime");
		}
		else {
			System.out.println("prime");
		}
	}
	 
	 
	 static boolean prime(int n) {
		 int count  =0;
		 for(int i=2;i<n/2;i++) {
			 if(n%i==0) {
				 count++;
			 }
		 }
		 if(count == 0) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 static boolean checkPrime(int n) {
		 for(int i=2;i<=n/2;i++) {
			 if(n%i==0) {
				return false;
			 }
		 }
		 return true;
	 }
	 
	 
	 static void countPrime(int n) {
		 //int count = 0;
		 for(int i=2;i<=n;i++) {
			 if(checkPrime(i)) {
				 System.out.println(i+" ");
			 }
		 }
	 }
	 
}
