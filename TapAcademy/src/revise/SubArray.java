package revise;

import java.util.Scanner;

public class SubArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int size = s.nextInt();
		int k = s.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		
		array(a,size,k);
	}
	
	
	static void array(int[] a,int size,int k) {
		
		for(int i=0;i<=a.length-size;i++) {
			int sum  = 0;
			for(int j=i;j<size+i;j++) {
				sum = sum + a[j];
			}
//			System.out.println(sum+" ");
			if(sum == k) {
				for(int j=i;j<size+i;j++) {
					System.out.print(a[j]);
				}
				System.out.println();
			}
			
	}
		System.out.println();
	}

}
