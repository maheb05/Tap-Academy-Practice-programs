package Aarays;

import java.util.Scanner;

public class SubStringWithEqualToK {
	
	static void sub(int[] arr,int size,int k) {
		int count = 0;
		for(int i=0;i<=arr.length-size;i++) {
			int sum = 0;
			for(int j=i;j<i+size;j++) {
				System.out.print(arr[j]+" ");
				sum += arr[j];
			}
			System.out.println();
			
			if(sum==k) {
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		int size = scan.nextInt();
		int k = scan.nextInt();
		sub(arr,size,k);
		
	}
}
