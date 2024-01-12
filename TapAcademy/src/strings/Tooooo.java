package strings;

import java.util.Scanner;

public class Tooooo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String S = s.nextLine();
		
		String res = toUp(S);
		System.out.println(res);
	}
	
	static String toUp(String S) {
		
		String t = "";
		
		for(int i=0;i<S.length();i++) {
			
			char ch  = S.charAt(i);
			
			if(ch>='a' && ch<='z') {
				t = t+ (char)(ch+32);
			}
			else if(ch>='A' && ch<='Z') {
				t = t+ (char)(ch-32);
			}
			else {
				t = t +ch;
			}
		}
		return t;
	}

}
