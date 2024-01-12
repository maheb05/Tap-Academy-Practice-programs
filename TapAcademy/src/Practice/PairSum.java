package Practice;

import java.util.Scanner;

public class PairSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int k = s.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		
		plus(a,k);
	}
	
	
	static void plus(int[] a ,int k) {
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] - a[j] == k || a[j] - a[i] == k) {
					System.out.println(a[i] +" "+a[j]);
				}
			}
		}
	}

}
