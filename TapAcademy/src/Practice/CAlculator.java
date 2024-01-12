package Practice;

import java.util.Scanner;
public class CAlculator {
	public static void main(String[] args) {
		Scanner S =new Scanner(System.in);
		System.out.println("Enter iron price ");
		int i = S.nextInt();
		
		System.out.println("Enter steel price ");
		float s = S.nextInt();
		
		System.out.println("Enter tungestan price ");
		int t = S.nextInt();
		
		System.out.println("Enter nickle price ");
		int n = S.nextInt();
		
		System.out.println(i+s+t+n);
		System.out.println(calDis(i,s,t,n));
		
	
	}
	
	
	
	static float calDis(float i, float s, float t,float n){
		float d1 = i*(7.0f/100) + s*(5.0f/100) + t*(3.0f/100) + n*(1.0f/100);
		float d2 = i+s+t+n;
		
		if(d2 <=25000) {
			d2 = 0;
		}
		else if(d2 >=25001 && d2<=50000) {
			d2 = 3.0f/100;
		}
		else if(d2 >=50001 && d2<=100000) {
			d2 = 5.0f/100;
		}
		else {
			d2 = 7.0f/100;
		}
		
		System.out.println(d1);
		System.out.println(d2);
		
		if(d1 > d2) {
			return d1;
		}
		else {
			return d2;
		}
		
	}

}
