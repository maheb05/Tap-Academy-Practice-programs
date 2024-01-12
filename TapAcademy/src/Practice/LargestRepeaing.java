package Practice;
import java.util.Scanner;
public class LargestRepeaing {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[]  a =new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		
		int res = lr(a);
		System.out.println(res);
	}
	
	
	static int lr(int[] a) {
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				return a[i];
			}
		}
		return -1;
	}

}
