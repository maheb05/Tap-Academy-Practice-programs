package assesment1;

import java.util.Scanner;
public class FarehnitToCelcius {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int f = s.nextInt();
		double c=(f-32)*5/9;
		System.out.printf("%.4f",c);
	}

}
