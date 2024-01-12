package exceptionhandling;
import java.util.*;

class Demo{
	void fun() throws Exception {
		System.out.println("conn 2 estd");
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Numerator");
			int n = scan.nextInt();
			System.out.println("Enter denominator");
			int d = scan.nextInt();
			int a = n/d;
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println("Handled in fun same method");
			System.out.println("Invalid input");
			throw e;
		}
		finally {
			System.out.println("conn 2 terminated");
		}
	}
}





public class ReThrowingException {
	public static void main(String[] args) {
		System.out.println("conn 1 estd");
		try {
			Demo d1 = new Demo();
			d1.fun();
		}
		
		catch(Exception e) {
			System.out.println("Handled inside Main");
		}
		
		System.out.println("conn 1 terminated");
	}
}
