package strings;

import java.util.Scanner;

public class Indexprinter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int k = sc.nextInt();
		
		printer(s,k);
		
		
	}
	
	static void printer(String s,int k) {
		
		if(k>=0 && k < s.length()) {
			
			char c = s.charAt(k);
			System.out.println(c);
			
		}
		
		else {
			System.out.println("Invalid index");
		}
		
	}

}
