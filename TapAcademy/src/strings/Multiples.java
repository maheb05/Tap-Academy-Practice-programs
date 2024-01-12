package strings;

import java.util.Scanner;
public class Multiples {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number to print multiples");
		int n = s.nextInt();
		System.out.println("Enter how many multiples to print");
		int m = s.nextInt();
		multiples(n,m);
		
	}
	
	static void multiples(int n , int m){
		for(int i=0;i<=m;i++) {
			System.out.println(n*i);
		}
	}

}
