package Practice;

import java.util.Scanner;
public class Lcm {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		
		int res = lcm(n,m);
		
	}
	
	
	
	static int lcm(int n,int m){
		
//		if(n>m) {
//			return n;
//		}
//		else {
//			return m;
//		}
		
		int res = Math.max(n, m);
		int i;
		while(true) {
			if(n%i==0 && m%i==0) {
				
				
				
				
			}
		}
		
	}

}
