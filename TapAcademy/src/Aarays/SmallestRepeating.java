package Aarays;

import java.util.Scanner;

public class SmallestRepeating {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		smallest(arr);
		
	}
	static void smallest(int[] arr) {
		int count = 1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
				break;
//				count++;
			}
//			else {
//				if(count==1) {
//					System.out.println(arr[i]);
//					return;
//				}
//				count=1;
//			}
		}
//		if(count==1) {
//			System.out.println(arr[arr.length-1]);
//		}
	}

}
