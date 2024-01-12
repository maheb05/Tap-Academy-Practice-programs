package Aarays;

import java.util.Scanner;

public class EvenOdd {

    public static void evenOdd(int[] arr) {
       int n = arr.length;
       int[] t = new int[n];
       
       int index = 0;
       
       for(int i=0;i<n;i++) {
    	   
    	   if(arr[i] % 2 == 0) {
    		   t[index++] = arr[i];
    	   }
       }
       
       for(int i=0;i<n;i++) {
    	   if(arr[i] % 2 != 0) {
    		   t[index++] = arr[i];
    	   }
       }
       
       System.arraycopy(t, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        evenOdd(arr);
        for (int i : arr) {
			System.out.print(i+" ");
		}
    }
}
