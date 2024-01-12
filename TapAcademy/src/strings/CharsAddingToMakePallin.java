package strings;

import java.util.Arrays;
import java.util.Scanner;

public class CharsAddingToMakePallin {
	
	static void charsAddingToMakePallin(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		int i = 0;
		int count = 0;
		while(i < c.length) {
			if(i < c.length-1 && c[i] == c[i+1]) {
				i = i + 2;
			}
			else {
				count++;
				i++;
			}
		}
		if(count > 1) {
			System.out.println("You have to add "+(count-1)+" Charceters to make it as Pallindrome");
		}
		else {
			System.out.println("NULL");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		charsAddingToMakePallin(s);
	}

}
