package Aarays;

import java.util.Scanner;
public class AvgOfAllEle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		float [] arr = new float[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextFloat();
		}
		double res = avg(arr);
		System.out.println(res);
	}
	
	static float avg(float[] arr){
		
		float sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i] ;
		}
		return sum;
	
	}

}
