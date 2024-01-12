package Practice;
import java.util.Scanner;
public class SmalllestRepeatingELE {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		eleSma(a);
	}
	
	
	static void eleSma(int[] a) {
		
		int min = 0;
		int count = 1;
		int ele = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] < min) {
				count++;
			}
			else {
				
				if(count < min) {
					System.out.println();
				}
				count = 1;
			}
		}
		System.out.println(s);
	}

}
