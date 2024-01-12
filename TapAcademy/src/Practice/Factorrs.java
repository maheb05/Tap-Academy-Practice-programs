package Practice;

import java.util.Scanner;
public class Factorrs {
	
	static void factors(int n){
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		factors(n);
		
	}

}
