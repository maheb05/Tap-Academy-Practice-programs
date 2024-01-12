package Aarays;

import java.util.Arrays;
import java.util.Scanner;

public class MissingElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scan.nextInt();
		}
		
//		int expected = arr1.length+1;
//		int total = expected*(expected+1)/2;
//		int sum  = 0;
//		
//		for(int i=0;i<arr1.length;i++) {
//			sum = sum + arr1[i];
//		}
//		
//		int res = total - sum;
//		System.out.println("missing number is "+res);
		
		System.out.println(miss(arr1));
	}
	
	static int miss(int arr[]) {
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1] - arr[i] != 1) {
				return arr[i]+1;
			}
		}
		return 0;
	}
}
