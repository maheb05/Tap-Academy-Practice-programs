package Practice;

import java.util.Scanner;

public class Merger {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter 1st Array Size");
		int n = sc.nextInt();
		
		System.out.println("Enter 1st Array Elements");
		
		int[] a1 = new int[n];
		for(int i=0;i<a1.length;i++) {
			a1[i] = sc.nextInt();
		}
		
		System.out.println("Enter 2nd Array Size");
		int m = sc.nextInt();
		int[] a2 = new int[m];
		
		System.out.println("Enter 2nd Array Elements");
		for(int j=0;j<a2.length;j++) {
			a2[j] = sc.nextInt();
		}
		
	 	int[] result = merge(a1,a2);
	 	
	 	for(int i=0;i<result.length;i++) {
	 		System.out.print(result[i]+" ");
	 	}
	 	
	 	
	}
		
	static int[] merge(int[] a1, int[] a2) {
	    int[] res = new int[a1.length + a2.length];
	    int i = 0;
	    int j = 0;
	    int k = 0;

	    while (i < a1.length && j < a2.length) {
	        if (a1[i] < a2[j]) {
	            res[k] = a1[i];
	            i++;
	        } else {
	            res[k] = a2[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < a1.length) {
	        res[k] = a1[i];
	        i++;
	        k++;
	    }

	    while (j < a2.length) {
	        res[k] = a2[j];
	        j++;
	        k++;
	    }
	    return res;
	}

}
