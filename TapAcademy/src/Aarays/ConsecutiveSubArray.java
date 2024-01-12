package Aarays;

import java.util.Scanner;

public class ConsecutiveSubArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]  a = new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		
		subC(a);
	}
	
	static void subC(int[] a) {
		
		int si=0, ei=0, start=0, end=0;
		
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i+1]-a[i]==1) {
				ei++;
			}
			else {
				
				if((ei-si) > (end - start)) {
					end = ei;
					start = si;
				}
				ei=i+1;
				si=i+1;
			}
		}
		
		if((ei-si) > (end-start)) {
			end = ei;
			start = si;
		}
		
		for(int i=start;i<=end;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
