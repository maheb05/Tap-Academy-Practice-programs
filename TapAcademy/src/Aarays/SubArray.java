package Aarays;

import java.util.Scanner;

public class SubArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		subArray(arr);
	}
	
	//ALL POSSIBLE SUBARRAYS
	
	static void subArray(int[] arr) {
		for(int size=1;size<arr.length;size++) {
			for(int i=0;i<=arr.length-size;i++) {
				for(int j=i;j<i+size;j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	///SUBARRAY ......!
	static void sub(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	////SUB ARRAY WITH EQUAL TO SUM.......
	static void subSum(int []arr,int k) {
		for(int size=1;size<arr.length;size++) {
			for(int i=0;i<=arr.length-size;i++) {
				int sum = 0;
				for(int j=i;j<i+size;j++) {
					sum = sum + arr[j];
				}
				if(sum==k) {
					for(int j=i;j<i+size;j++) {
						System.out.print(arr[j]+" ");
					}
					System.out.println();
				}
			}
		}
	}
	
	//// ANOTHER METHOD SUBARRAY WITH EQUAL TO SUM
	static void sumSub(int[] arr,int k) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum = 0;
				for(int f=i;f<=j;f++) {
					sum = sum + arr[f];
				}
				if(sum == k) {
					for(int f=i;f<=j;f++) {
						System.out.print(arr[f]+" ");
					}
					System.out.println();
				}
			}
		}
	}
}
