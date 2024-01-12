package exceptionhandling;
import java.util.*;
public class EHandlingAccordingtoType {
	public static void main(String[] args) {
		System.out.println("Conn estd");
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Numerator");
			int n = scan.nextInt();
			System.out.println("Enter Denominator");
			int d = scan.nextInt();
			int a = n/d;
			
			System.out.println("Enter array size");
			int size = scan.nextInt();
			int[] arr = new int[size];
			System.out.println("enter element");
			int ele = scan.nextInt();
			System.out.println("enter index");
			int index = scan.nextInt();
			arr[index] = ele;
			
			System.out.println(arr[index]);
			arr = null;
		}
		
		catch(ArithmeticException e) {
			System.out.println("Provide Non zero denominator");
		}
		
		catch(NegativeArraySizeException e) {
			System.out.println("Provide positive array size");
		}
		
		catch(InputMismatchException e) {
			System.out.println("provide only integers");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter valid Index");
		}
		
		catch(Exception e) {
			System.out.println("Invalid Input");
		}
		
		System.out.println("Conn is Terminated");
	}
}
