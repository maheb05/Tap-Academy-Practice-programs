package Practice;

import java.util.Scanner;

public class MergeThreeAry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of 1st Array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter Elements of 1st Array");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter size of 2nd Array");
		int m = sc.nextInt();
		int[] b = new int[m];
		System.out.println("Enter Elements of 2nd Array");
		for(int i=0;i<b.length;i++) {
			b[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter size of 3rd Array");
		int p = sc.nextInt();
		int[] c = new int[p];
		System.out.println("Enter Elements of 3rd Array");
		for(int i=0;i<c.length;i++) {
			c[i] = sc.nextInt();
		}
		
		int[] result = merger(a,b,c);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ")  ;
		}
		System.out.println();
	}
	
	
	static int[] merger(int[] a,int[] b,int[] c) {
		
		int[] res = new int[a.length+b.length+c.length];
		
		int k=0,i=0;
		
		while(k < res.length) {
			
			if(i<a.length) {
				res[k] = a[i];
				k++;
			}
			
			if(i<b.length) {
				res[k] = b[i];
				k++;
			}
			
			if(i<c.length) {
				res[k] = c[i];
				k++;
			}
			
			i++;
		}
		return res;
	}

}
