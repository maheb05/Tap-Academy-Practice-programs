package Aarays;

import java.util.Scanner;
public class AgesOfArrayUsingTD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many Schools are There : ");
		int n = sc.nextInt();
		
		System.out.println("Enter how many Classes are in Each School : ");
		int m = sc.nextInt();
		
		System.out.println("Enter how many Students per class : ");
		int k = sc.nextInt();
		
		int[][][] a = new int[n][m][k];
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<m;j++) {
				
				for(int l=0;l<k;l++) {
					
					System.out.println("School "+i+" class "+j+" Student "+l);
					a[i][j][l]=sc.nextInt();
				}
			}
		}
		
		System.out.println("The Ages are :");
		
        for(int i=0;i<n;i++) {
			
			for(int j=0;j<m;j++) {
				
				for(int l=0;l<k;l++) {
					
					System.out.print(a[i][j][l]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
