package collections;

import java.util.LinkedList;

public class Link {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("Hello");
		list.add(44);
		list.add(44.99);
		list.add(true);
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
