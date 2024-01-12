package Aarays;

import java.util.Scanner;

public class NearestGreatest {
	static void nearestGreatest(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j = i+1 ; j<arr.length;j++) {
				if(arr[j] > arr[i]) {
					System.out.println(arr[i] +" "+arr[j] );
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		
		nearestGreatest(arr);
	}
}
