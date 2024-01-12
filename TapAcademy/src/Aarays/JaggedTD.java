package Aarays;

import java.util.Scanner;
public class JaggedTD {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] a = new int[2][];
		a[0] = new int[3];
		a[1] = new int[5];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Class "+i+" Students "+j);
				a[i][j] = s.nextInt();
			}
		}
		System.out.println();
		System.out.println("The Ages Are :");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println();
	}

}
