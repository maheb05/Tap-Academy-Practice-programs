package Aarays;

import java.util.Scanner;

public class ObjectArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter array size ");
		int n = scan.nextInt();
		Object[] arr = new Object[n];
		System.out.println("Enter array elements ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("The elements are ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
