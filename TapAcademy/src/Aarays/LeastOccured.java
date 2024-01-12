package Aarays;
import java.util.*;

public class LeastOccured {
		static int leastOccured(int[] arr) {
			int xor = 0;
			for(int i=0;i<arr.length;i++) {
				xor = xor ^ arr[i];
			}
			return xor;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		int res = leastOccured(arr);
		System.out.println(res);
	}

}

