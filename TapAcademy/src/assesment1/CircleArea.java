package assesment1;

import java.util.Scanner;
public class CircleArea {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double r = s.nextDouble();
		double pi = 3.142;
		double area = pi*r*r;
		
		System.out.printf("%.4f",area);
	}

}
