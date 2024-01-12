package Practice;
import java.util.Scanner;
public class IplussJ {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		
		callij(a);
	}
	
	
	
	
	
	static void callij(int[] a) {
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				System.out.println(a[i]+" "+a[j]);
			}
			System.out.println();
		}
	}

}
