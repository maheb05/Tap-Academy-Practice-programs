package Aarays;

import java.util.Scanner;
public class AgesOfTheStuents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many Classes are there : ");
		int n = sc.nextInt();
		System.out.println("Enter how many student per class : ");
		int m = sc.nextInt();
		int[][] a= new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.println("Enter age of Class "+i+" Student "+j);
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The Aes of the Students are :");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
