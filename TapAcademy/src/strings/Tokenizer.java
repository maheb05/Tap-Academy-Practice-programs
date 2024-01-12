package strings;

import java.util.*;

public class Tokenizer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(s);
		
		for(;st.hasMoreTokens();) {
			System.out.println(st.nextToken());
		}
	}

}
