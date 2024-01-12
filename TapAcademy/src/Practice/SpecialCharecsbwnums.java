package Practice;

import java.util.Scanner;

public class SpecialCharecsbwnums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[]  a = new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		charSpecial(a);
	}
	
	
	static void charSpecial(int[] a) {
		
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]%2==0 && a[i+1]%2==0) {
				System.out.print(a[i]+"#");
			}
			else if(a[i]%2 !=0 && a[i+1]%2 !=0) {
				System.out.print(a[i]+"$");
			}
			else {
				System.out.print(a[i]+"*");
			}
		}
		System.out.print(a[a.length-1]);
	}

}
