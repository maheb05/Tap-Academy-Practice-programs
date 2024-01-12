package collectionsprogramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(scan.hasNextInt()) {
//			int x = scan.nextInt();
//			list.add(x);
			list.add(scan.nextInt());
		}
		
		Iterator<Integer> it = list.iterator();
		
		System.out.println();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
