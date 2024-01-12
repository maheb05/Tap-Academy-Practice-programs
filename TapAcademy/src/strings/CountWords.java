package strings;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int res = wordCount(s);
		System.out.println(res);
		
	}
	
	static int wordCount(String s) {
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		return count+1;
	}

}
