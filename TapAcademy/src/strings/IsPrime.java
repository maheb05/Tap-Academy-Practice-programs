package strings;

import java.util.Scanner;
public class IsPrime {
	
	static boolean prime(int n){
		int count = 0;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	static void printPrime(int n){
		for(int i=2;i<=n;i++) {
			if(prime(i)){
				System.out.println(i);
			}
		}
	}
	
	static int countPrime(int n) {
		int count = 1;
		
		for(int i=2;count<=n;i++) {
			if(prime(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean res = prime(n);
		
		if(res == true) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not A Prime");
		}
		//printPrime(n);
//		int res = countPrime(n);
//		System.out.print(res);
		
//		int P = s.nextInt();
//		
//		for(int i=2;i<P;i++) {
//			if(P%i==0) {
//				System.out.println("Not a prime");
//				break;
//			}
//			else {
//				System.out.println("Prime");
//				break;
//			}
//		}
//		
		
	}

}
