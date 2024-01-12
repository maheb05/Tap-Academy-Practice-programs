package Aarays;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]  arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		int[] res =rerr(arr);
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
	}
	
	static int[] aNonZero(int[] arr) {
		int j = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				j = i;
				break;
			}
		}
		if(j==-1) {
			return arr;
		}
		
		for(int i=j+1;i<arr.length;i++) {
			if(arr[i] != 0) {

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return arr;
	}
	
	static void re(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	
	static int[] ree(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] < 0) {
				
			}
		}
		return arr;
	}
	
	static int[] reer(int[] arr) {
		
		int i=arr.length-1;
		int j = arr.length-1;
		
		while(i >= 0) {
			if(arr[i] == 0) {
				i--;
			}
			else {
				arr[j] = arr[i];
				i--;
				j--;
			}
		}
		while(j >= 0) {
			arr[j] = 0;
			j--;
		}
		return arr;
	}
	
	static int[] rerr(int[] arr) {
		
		int i = 0;
		int j = arr.length-1;
		
		while(i <=j) {
			if(arr[i] >= 0) {
				i++;
			}
			else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		return arr;
	}
}
