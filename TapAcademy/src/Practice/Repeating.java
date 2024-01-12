package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Repeating {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		int[] b = new int[m];
		for(int i=0;i<b.length;i++) {
			b[i]=scan.nextInt();
		}
		repeating(a,b);
	}
	
	static void repeating(int[] a,int[] b) {
		int i=0;
		int j = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		while(i<a.length && j < b.length) {
			if(a[i] == b[j]) {
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
			else if(b[j] < a[i]) {
				j++;
			}
			else {
				i++;
			}
		}
	}
}
