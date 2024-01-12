package Practice;
import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 3 valuea that should form any one triangle");
		
		System.out.println("Enter  a vlaue ");
		int a = s.nextInt();
		
		System.out.println("Enter b value ");
		int b = s.nextInt();
		
		System.out.println("Enter c value ");
		int c = s.nextInt();
		
		triangle(a,b,c);
		
		
	}
	
	
	
	static void triangle(int a, int b, int c) {
		
		if((a+b+c)==180) {
			
			if(a==60 && b==60 && c==60) {
				System.out.println("3rd Price");
			}
			
			else if(a==90 || b==90 || c==90) {
				System.out.println("2nd prize");
			}
			else {
				System.out.println("1st Prize");
			}
		}
		
		else {
			System.out.println("No Prize");
		}
	}

}
