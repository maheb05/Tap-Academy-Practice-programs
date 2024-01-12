package strings;

import java.util.Iterator;
import java.util.Scanner;

public class ZStringlen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		try {
			String s = scan.nextLine();
			char[] ch = s.toCharArray();
			for (int i=0;true;i++) {
				if(ch[i] !=' ') {
					count++;
				}
			}
		} catch (Exception e) {
			System.out.println(count);
		}
	}
}
