package strings;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String res = replacer(s);
		System.out.println(res);
	}
	
	static String replacer(String s) {
		
		String t = "";
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U' ) {
				t = t + '#';
			}
			else {
				t = t + ch;
			}
		}
		return t;
	}

}
