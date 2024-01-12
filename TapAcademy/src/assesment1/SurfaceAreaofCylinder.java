package assesment1;

import java.util.Scanner;
public class SurfaceAreaofCylinder {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double r = s.nextDouble();
		double h = s.nextDouble();
		double pi = 3.142;
		double f = 2*pi*r*(r+h);
		System.out.printf("%.4f",f);
	}

}
