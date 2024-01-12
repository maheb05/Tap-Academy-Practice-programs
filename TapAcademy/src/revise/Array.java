package revise;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		sA(arr);
		
	}
	
	static void sA(int[] arr) {
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}

}

	
