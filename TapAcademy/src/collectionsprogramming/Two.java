package collectionsprogramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			ArrayList<Float> al = new ArrayList<Float>();
			
			while(scan.hasNextFloat()) {
				al.add(scan.nextFloat());
			}
			
			Iterator<Float> it = al.iterator();
			
			while(it.hasNext()) {
				Float yes = it.next();
				System.out.println(yes);
			}
	}
}
