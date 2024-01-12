package Aarays;

import java.util.Scanner;

public class CheckSortedorNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		String res = check(arr);
		System.out.println(res);
	}
	static String check(int arr[]) {
		
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i] >= arr[i-1] ) {
				
			}
			else {
				
				return "No";
			}
		}
		return "yes";
	}

}
