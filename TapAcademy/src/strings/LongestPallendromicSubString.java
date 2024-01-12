package strings;

import java.util.Scanner;

public class LongestPallendromicSubString {
	
	static boolean isPallin(String s) {
		
		int i = 0;
		int j = s.length()-1;
		
		while(i <= j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	static String longestPallinSubString(String s) {
		String res = "";
		int n = s.length();
		for(int len=1;len<=n;len++) {
			for(int st = 0;st<=n-len;st++) {
				String temp = "";
				for(int e = st;e<(st+len);e++) {
					temp = temp + s.charAt(e);
				}
				 if(isPallin(temp)) {
					 if(temp.length() > res.length()) {
						 res = temp;
					 }
				}
			}
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.print(longestPallinSubString(s));
	}

}
