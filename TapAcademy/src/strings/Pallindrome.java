package strings;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String p = s.next();
		boolean res = Pi(p);
		
		if(res == true) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		
	}
	
	static boolean Pi(String p) {
		
		int i=0;
		int j = p.length()-1;
		
		while(i<j) {
			if(p.charAt(i)==p.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		
		return true;
	}

}
