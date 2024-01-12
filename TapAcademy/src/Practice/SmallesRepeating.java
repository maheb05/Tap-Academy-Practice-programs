package Practice;
import java.util.Scanner;
public class SmallesRepeating {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		
		int r = sr(a);
		System.out.println(r);
	}
	
	
	private static int sr(int[] a) {
		int s = 0;
        for(int i=0;i<a.length-1;i++) {
        	if(a[i] == a[i+1]){
        		if(a[i]<s) {
        			s = a[i];
        			return s;
        		}
//        		return a[i];// No repeating element found
        	}
        }
        return -1;
    }
}
