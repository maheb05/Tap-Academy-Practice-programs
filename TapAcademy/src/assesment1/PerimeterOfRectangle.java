package assesment1;

import java.util.Scanner;
public class PerimeterOfRectangle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int w = s.nextInt();
		int perimeter =2*(l+w);
		System.out.println(perimeter);
	}

}
