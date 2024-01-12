package Practice;
import java.util.Scanner;
public class CountNum {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int res = grip(a,b,c);
		System.out.println("count is"+res);
		
	}
	
	
	static int grip(int a , int b, int c) {
		int count = 0;
		for(int i=a;i<=b;i++) {
			if(i % c == 0) {
				count++;
			}
		}
		return count;
	}

}
