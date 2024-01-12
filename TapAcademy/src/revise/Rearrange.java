package revise;

import java.util.Scanner;

public class Rearrange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		
		sub(a);
	}
	
	static void sub(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				System.out.println(a[i]+" ");}
			
		}
		
		for(int i=0;i<a.length;i++) {
		if(a[i]>0) {
			System.out.println(a[i]+" ");
		}
		}
		
			
	}

}
