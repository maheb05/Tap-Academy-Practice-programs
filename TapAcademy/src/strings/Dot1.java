package strings;

import java.util.Scanner;
import java.util.HashSet;

public class Dot1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		
		HashSet set = new HashSet();
		
		set.add(33);
		set.add(55.7);
		set.add(true);
		set.add("TAp");
		set.add('c');
		
		
		System.out.println(set);
	}

}
