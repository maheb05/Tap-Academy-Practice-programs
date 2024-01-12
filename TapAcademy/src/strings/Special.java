package strings;

import java.util.Scanner;

public class Special {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		String res = remover(s);
		System.out.println(res);
	}
	
	
	static String remover(String s) {
		
		String t = "";
		int sum = 0;
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if((ch>='a' && ch<='z') ||  (ch>='A' && ch<='Z')){
				t = t + ch;
			}
			else if(ch>='0' && ch<='9') {
				sum = sum + (ch-48);
			}
		}
		return t+sum;
	}

}
