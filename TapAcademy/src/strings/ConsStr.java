package strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ConsStr {
	
	static LinkedHashSet<String> rev(String s) {
		
		String[] ar = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<ar.length;i++) {
			set.add(ar[i]);
		}
		return set;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		LinkedHashSet<String> result = rev(s);
		for (String word : result) {
			System.out.print(word+" ");
		}
		
	}
}
