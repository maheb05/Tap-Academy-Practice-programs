package Aarays;

import java.util.Scanner;

public class LargestRepeating {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		//largest(arr);
		lar(arr);
	}
	///////LARGEST REPEATING ELEMENT...................!
	static void largest(int []arr) {
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]==arr[i-1]) {
				System.out.println(arr[i]);
				return;
			}
		}
	}
	////MOST OCCURED ELEMENTS
	static void maxOccur(int[] arr) {
		int count = 1,max=0,ele=0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				if(count> max) {
					max = count;
					ele = arr[i];
					
				}
				count=1;
			}
		}
		System.out.println(ele);
		if(count>max) {
			System.out.println(arr[arr.length-1]);
		}
	}
	
	////ANOTHER METHOD TO PRINT LARGEST EPEATING ELEMENT
	static void lar(int[] arr) {
		int count = 1;
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]==arr[i-1]) {
					count++;
				}
			else {
				if(count > 1) {
					System.out.println(arr[i]);
					break;
				}
				count=1;
			}
		}
	}

}
