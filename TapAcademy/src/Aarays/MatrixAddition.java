package Aarays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rows of matrix ");
		int rows = scan.nextInt();
		System.out.println("Enter cols of matrix ");
		int cols = scan.nextInt();
		
		System.out.println("Enter matrix1 data");
		int[][] matrix1 = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix1[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Enter matrix2 data");
		int[][] matrix2 = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix2[i][j]=scan.nextInt();
			}
		}
		System.out.println("Matrix 1 data");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix 2 data");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		int[][] res = new int[rows][cols];
		System.out.println("REsult");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				res[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
//		for(int[] data : res) {
//			System.out.println(Arrays.toString(data));
//		}
	}
}
