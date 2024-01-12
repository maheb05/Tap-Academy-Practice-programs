package Practice;

import java.util.Arrays;
import java.util.*;

public class Col {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		int[] arr =  new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++) {
//				System.out.print(arr[i]+" ");
//		}
		System.out.println(arr[arr.length-2]);
	}
}
