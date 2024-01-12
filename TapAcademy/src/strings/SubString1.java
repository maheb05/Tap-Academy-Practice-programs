package strings;

import java.util.Scanner;

public class SubString1 {
	/////// ALL POSSIBLE SUBSTRINGS
	static void subString(String s) {
		
		for(int size=1;size<=s.length();size++) {
			for(int i=0;i<=s.length()-size;i++) {
				for(int j=i;j<i+size;j++) {
					System.out.print(s.charAt(j)+" ");
				}
				System.out.println();
			}
		}
	}
	
	//////////SUBSTRING AT GIVEN SIZE
	
	static void subString1(String s,int k) {
		for(int i=0;i<=s.length()-k;i++) {
			for(int j=i;j<i+k;j++) {
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		subString1(s,k);
		
	}

}
