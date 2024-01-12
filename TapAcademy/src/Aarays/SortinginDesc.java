package Aarays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortinginDesc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Integer[] a = new Integer[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		
		Arrays.sort(a,Collections.reverseOrder());

		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		
	}

}
