package strings;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Dot2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		for(char ch:set) {
			System.out.print(ch);
		};
	}

}
