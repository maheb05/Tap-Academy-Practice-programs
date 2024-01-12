package Aarays;

import java.util.Scanner;

public class RotationOfArrayDplaces {
	
	static int[] rotationOfDplaces(int a[],int n,int d) {
		
		d = d%n;
		int temp[] = new int[d];
		
		for(int i=0;i<d;i++) {
			temp[i] = a[i];
		}
		
		for(int i=d;i<n;i++) {
			a[i-d] = a[i];
		}
		
		for(int i=n-d;i<n;i++) {
			a[i] = temp[i-(n-d)];
		}
		
		return a;
	}
	    	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size ");
		int n = sc.nextInt();
		System.out.println("Enter how many places to rotate ");
		int d = sc.nextInt();
		System.out.println("Enter Elements ");
		int a[] = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		int res[] = rotationOfDplaces(a,n,d);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}

}
