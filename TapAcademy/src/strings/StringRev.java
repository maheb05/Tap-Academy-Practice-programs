package strings;

import java.util.Scanner;

public class StringRev {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String S = s.next();
		
		String res = pi(S);
		if(S.equals(res)) {
			System.out.println("Pallin");
		}
		else {
			System.out.println("not Palli");
		}
	}
	
	static String pi(String S) {
		String t = "";
		
		for(int i=S.length()-1;i>=0;i--) {
			   t = t+S.charAt(i);
		}
		return t;
	}		

}
