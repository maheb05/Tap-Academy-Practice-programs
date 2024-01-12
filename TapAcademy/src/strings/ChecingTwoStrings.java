package strings;

import java.util.Arrays;
import java.util.Scanner;

public class ChecingTwoStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		
		System.out.println(check(s1,s2));
	}
	
	static boolean check(String s1,String s2) {
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		String t1 = "";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) != ' ') {
				t1 = t1 + s1.charAt(i);
			}
		}
		s1 = t1;
		
		String t2 = "";
		for(int i=0;i<s2.length();i++) {
			if(s2.charAt(i) != ' ') {
				t2 = t2 + s2.charAt(i);
			}
		}
		s2 = t2;
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		s1 = new String(c1);
		s2 = new String(c2);
		
		return s1.equals(s2);
	}
	
}
