package Practice;

import java.util.Scanner;
public class SumArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int []a = new int[n];
//		for(int i=0;i<a.length;i++) {
//			a[i] = s.nextInt();
//		}
//		int res =add(a);
//		System.out.print(res +" ");
		pattern();
	}
	
	
	static void pattern() {
		int count=1;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
	}
	
	
static int	add(int[] a){
		
		
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		return sum;
	}

}
