package Aarays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {   
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Rows ");
		int rows = scan.nextInt();
		System.out.println("Enter cols ");
		int cols = scan.nextInt();
		
		int[][] matrix = new int[rows][cols];
		System.out.println("Enter Data ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j]=scan.nextInt();
			}
		}
		System.out.println("the matrix is ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
//		Arrays.sort(matrix);
//		
//		for(int[] data : matrix) {
//			for(int x : data) {
//				System.out.print(x+" ");
//			}
//			System.out.println();
//		}
//		
//		for(int[] data : matrix) {
//			System.out.println(Arrays.toString(data));
//		}
//		
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				System.out.print(matrix[j][i]+" ");
//			}
//			System.out.println();
//		}
		
	}
	
}
