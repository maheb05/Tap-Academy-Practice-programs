package Aarays;

import java.util.Scanner;

public class RotationofArray {
	
	static int[] rotatin(int[] a,int n) {
		
		int temp = a[0];
		for(int i=1;i<a.length;i++) {
			a[i-1] = a[i];
		}
		a[n-1] = temp;
		return a;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Size of the Array ");
		int n = sc.nextInt();
		System.out.println("Enter Array Element ");
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array After Rotation ");
		int res[] = rotatin(a,n);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]);
		}
	}
	

}
