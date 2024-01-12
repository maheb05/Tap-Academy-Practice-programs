package Aarays;

import java.util.Scanner;

public class ConsequitiveOnes {
	
	static int consOnes(int[] arr) {
		int maxi = 0;
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
				maxi =Math.max(maxi,count);
			}
			else {
				count = 0;
			}
		}
		return maxi;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		int res = consOnes(arr);
		System.out.println(res);
	}

}
