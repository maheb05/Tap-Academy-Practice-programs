package assesment1;

import java.util.Scanner;
public class SumOfCombinations {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int d = a+b;
		int e = a+c;
		int f = b+c;
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
