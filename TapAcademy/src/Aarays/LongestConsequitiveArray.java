package Aarays;

import java.util.Scanner;

public class LongestConsequitiveArray {
	
	static int[] longest(int[] a) {
        int[] res = new int[a.length];
        int l = 0;
        int k = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int[] temp = new int[a.length];
            for (int j = i; j < a.length; j++) {
                if ( j == i || a[j] - a[j - 1] == 1) {
                    temp[k] = a[j];
                    k++;
                } else {
                    break;
                }
            }
            
            if (k > l) {
                l = k;
                res = temp.clone();
            }
            
            k = 0; // Reset the temporary array index
        }
        return res;
    }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		
		int[] result = longest(a);
		for(int i=0;i<result.length;i++) {
			if(result[i] != 0) {
				System.out.print(result[i]+" ");
			}
		}
	}
	
	

}
