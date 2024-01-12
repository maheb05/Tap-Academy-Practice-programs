package strings;

import java.util.Scanner;

public class ZZreverse {
	
	static String rev(String s,String s1,String s2) {
		
		char[] ss = s.toCharArray();
		char[] scr = s1.toCharArray();
		String res = "";
		int j = 0;
		for(int i=0;i<ss.length-scr.length+1;i++) {
			
			for(j=0;j<scr.length;j++) {
				
				if(scr[j] != ss[i+j]) {
					break;
				}
			}
			
			if(j==scr.length) { 
				res = res + s2;
				i = i+ scr.length-1;
			}
			else {
				res = res + ss[i];
			}
		}
		
		if(j != scr.length) {
			for(int i=ss.length-scr.length+1;i<ss.length;i++) {
				res = res + ss[i];
			}
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		
		s = rev(s,s1,s2);
		System.out.println(s);
		
	}
}
