package strings;

import java.util.Scanner;

//////////////PAMGRAM MEANS , A STRING WHICH CONTAINS ALL THE ALPHABETS WITHOUT LEAVING A SINGLE ALPHABETS(A,B,C......Z);
public class Pangram {
	
	static boolean pangram(String s) {
		
		String t = "abcdefghijklmnopqrstuvwxyz";
		s = s.toLowerCase();
		System.out.println(s);
		int count = 0;
		for(int i=0;i<t.length();i++) {
			if(s.indexOf(t.charAt(i)) >= 0) {
				count ++;
			}
			else {
				break;
			}
		}
		System.out.println(count);
		
		if(count == 26) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		System.out.println(pangram(s));
	}

}
