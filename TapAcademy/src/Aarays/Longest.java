package Aarays;

import java.util.Scanner;

public class Longest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		longest2(arr);
	}
	
	static void  longestt(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1] - arr[i] == 1) {
				System.out.print(arr[i]+" ");
			}
			else {
				System.out.println(arr[i]+" ");
			}
		}
		System.out.println(arr[arr.length-1]);
	}
	
	static void longest1(int[] arr) {
		int count = 1;
		int max = 0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1] - arr[i] == 1) {
				count++;
			}
			else {
				if(count > max) {
					max = count;
				}
				//max= Math.max(count, max);
				count = 1;
			}
		}
		if(count > max) {
			max = count;
		}
		//max = Math.max(count, max);
		System.out.println(max);
	}
	static void longest2(int[] arr) {
		int count = 1;
		int max = 0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1] - arr[i] == 1) {
				count++;
			}
			else {
				if(count > max) {
					max = count;
				}
				//max= Math.max(count, max);
				count = 1;
			}
		}
		if(count > max) {
			max = count;
		}
		//max = Math.max(count, max);
		System.out.println(max);
		for(int i=0;i<=max;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
