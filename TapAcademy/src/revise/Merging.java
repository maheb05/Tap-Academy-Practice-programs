package revise;

import java.util.Scanner;

public class Merging {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		
		int[]  a1 = new int[n];
		for(int i=0;i<a1.length;i++) {
			a1[i] = s.nextInt();
		}
		
		int[] a2 = new int[m];
		for(int j=0;j<a2.length;j++) {
			a2[j] = s.nextInt();
		}
		
		System.out.println("the Merged Array is :");
		int[] result = merge(a1,a2);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
		
	}
	
	
	
	static int[] merge(int[] a1,int[] a2) {
		int[] res = new int[a1.length + a2.length];
		
		int i=0,j=0,k=0;
		
		while(i<a1.length && j<a2.length) {
			
			if(a1[i] < a2[j]) {
				res[k++] = a1[i++];
			}
			else {
				res[k++] = a2[j++];
			}
		}
		while(j<a2.length) {
			res[k++] = a2[j++];
		}
		while(i<a1.length) {
			res[k++] = a1[i++];
		}
		
		return res;
	}

}
