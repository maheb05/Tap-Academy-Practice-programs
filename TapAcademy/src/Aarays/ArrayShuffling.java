package Aarays;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ArrayShuffling {
	
	static void ShufflingByRandomClass(int arr[]) {
		
		Random random = new Random();
		
		for(int i=0;i<arr.length;i++) {
			
			int j = random.nextInt(arr.length);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	static void shufflingArrayByFisher_yatesAlgorithm(int arr[]) {
		
		Random random = new Random();
		
		for(int i = arr.length-1 ; i > 0; i--) {
			
			int j = random.nextInt(i+1);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		//ShufflingByRandomClass(arr);
		shufflingArrayByFisher_yatesAlgorithm(arr);
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}
}
