package strings;

import java.util.Scanner;
public class HighestCommonFactor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first and Second Number");
		int n = s.nextInt();
		int m = s.nextInt();
		
		highestCommonFactor(n,m);
			
	}
	
	static void highestCommonFactor(int n , int m){
		
		for(int i=n;i>0;i--) {
			if(n%i==0 && m%i==0) {
				System.out.println(i);
				break;
			}
		}
	}

}
