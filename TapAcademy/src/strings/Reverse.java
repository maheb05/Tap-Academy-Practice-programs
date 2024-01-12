package strings;

import java.util.Scanner;

public class Reverse {
	
	static String reverse(String s) {
		char []c = s.toCharArray();
		int i = 0,j=c.length-1;
		
		while(i <= j) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;
		}
		return new String(c);
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println("Normal String "+s);
		
		s = reverse(s);
		System.out.println("Reversed String "+s);
	}

}
