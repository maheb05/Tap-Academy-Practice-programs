package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ParticularWordCount {
	
	static int words(String s,String input) {
		String[] arr = s.split(" ");
		int count = 0;
		for(String word : arr) {
			if(input.equals(word)) {
				count ++;
			}
		}
		return count;
	}
	
	/// By using sets,,,output incorrect
	static int particularWordCount(String s, String input) {
	    int count = 0;

	    HashSet<String> set = new HashSet<String>();
	    String[] arr = s.split(" ");
	    for (String w : arr) {
	        set.add(w);
	    }

	    for (String c : set) {
	        if (c.equals(input)) {
	            count++;
	        }
	    }
	    return count;
	}

	/////
	
	static int countParticular(String s, String input) {
		int count = 0;
		String[] arr = s.split(" ");
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		for(String w : arr) {
			map.put(w,map.getOrDefault(w, 0)+1);
		}
		count = map.getOrDefault(input, 0);
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String input = scanner.next();
		//System.out.println(words(s,input));
		//System.out.println(particularWordCount(s, input));
		System.out.println(countParticular(s, input));
		
	}
}
