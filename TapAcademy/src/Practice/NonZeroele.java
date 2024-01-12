package Practice;

import java.util.Scanner;

public class NonZeroele {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
//		int[] res = aNonZero(arr);
//		for(int i=0;i<res.length;i++) {
//			System.out.print(res[i]+" ");
//		}
		
		nonZero(arr);
	}
	
	
	static void nonZero(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				System.out.print(arr[i]+" ");
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.print(arr[i]+" ");
			}
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

				j++;
			}
		}
		return arr;
	}

}
