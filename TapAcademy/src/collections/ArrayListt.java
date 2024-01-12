package collections;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListt {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(5);
		list.add(10);
		list.add(20);
		list.add(null);
		list.add(40.33);
		list.add("String");
		list.add('c'); 
//		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}
}
