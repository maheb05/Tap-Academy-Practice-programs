package strings;

import java.util.TreeSet;
import java.util.Scanner;

public class Dot3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		TreeSet<Character> set = new TreeSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		for(char ch:set) {
			System.out.print(ch);
		}

	}

}
