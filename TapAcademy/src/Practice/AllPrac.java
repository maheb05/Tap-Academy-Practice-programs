package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class AllPrac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt(); 
		}
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = sc.nextInt();
		}
		
		union(arr1,arr2);
		
		
	}
	
	static int binarySearch(int[] arr,int k) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == k) {
				return i;
			}
		}
		return -1;
		
	}
	
	static void union(int[] arr1,int[] arr2) {
		int i=0,j=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] == arr2[j]) {
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
			else if(arr2[j]<arr1[i]) {
				j++;
			}
			else {
				i++;
			}
		}
	}
	
	static void pattern(int n) {
		for(int i=1;i<n;i++) {
			for(int j=1;j<n;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
	
}
