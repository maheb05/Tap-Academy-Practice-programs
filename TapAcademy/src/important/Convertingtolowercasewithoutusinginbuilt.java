package important;

import java.util.Scanner;

public class Convertingtolowercasewithoutusinginbuilt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String res = converter(s);
		System.out.println(res+" ");
		
	}
	
	static String converter(String s) {
		
		String t = "";
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				t = t + (char)(ch+32);
			}
		}
		return t;
	}

}
