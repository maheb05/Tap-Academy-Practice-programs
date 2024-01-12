package important;

import java.util.Iterator;
import java.util.Scanner;

public class Convertingtouppercasewithoutusinginbuilt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		String res = converter(s);
		System.out.println(res);
		
		
	}
	
	
	static String converter(String s) {
		
		String t = "";
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(ch>='a' && ch<='z') {
				t = t + (char)(ch-32);
			}
		}
		return t;
	}

}
