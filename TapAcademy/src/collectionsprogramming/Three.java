package collectionsprogramming;

import java.util.Comparator;
import java.util.TreeSet;

class Mycompare implements Comparator<Integer>{
	public int compare(Integer one,Integer two) {
		return one.compareTo(two);
	}
}

class Mycompare2 implements Comparator<Integer>{
	public int compare(Integer one,Integer two) {
		return 0;
	}
}


public class Three {
	public static void main(String[] args) {
		Mycompare2 compare = new Mycompare2();
		TreeSet set = new TreeSet(compare);
		set.add(150);
		set.add(150);
		set.add(125);
		set.add(125);
		set.add(175);
		set.add(175);
		set.add(75);
		set.add(75);
		set.add(25);
		set.add(25);
		set.add(50);
		set.add(50);
		set.add(100);
		set.add(100);
		
		System.out.println(set);
	}
}
