package Practice;

import java.util.Scanner;

public class SymbolsBWE {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i] =s.nextInt();
		}
		re(a);
	}
	
	static void re(int[] a) {
		
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]%2 == 0 && a[i+1]%2 == 0) {
				System.out.println(a[i]+"#"+a[i+1]);
			}
			
			else if(a[i]%2 == 0 && a[i+1]%2 != 0) {
				System.out.println(a[i]+"$"+a[i+1]);
			}
			
			else if(a[i]%2 != 0 && a[i+1]%2 != 0) {
				System.out.println(a[i]+"*"+a[i+1]);
			}
		}
	}
}
