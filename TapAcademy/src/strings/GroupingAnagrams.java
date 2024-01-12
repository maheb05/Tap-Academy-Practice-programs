package strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GroupingAnagrams {
	static String sortChars(String input) {
		char[] ch = input.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
	
//	static void groupinAnagrams(String sentence) {
//		String[] words = sentence.split(" ");
//		
//		LinkedHashMap<String, List<String>> map = new LinkedHashMap<String,List<String>>();
//		
//		for(String word : words) {
//			String sorted = sortChars(word);
//			if(! map.containsKey(sorted)) {
//				map.put(sorted, new LinkedList<>());
//			}
//			map.get(sorted).add(word);
//		}
//		
//		for(List<String> groups: map.values()) {
//			System.out.print(groups);
//		}
//	}
	
	static void anagramGroups(String sentence) {
	    String[] words = sentence.split(" ");

//	    LinkedList<String> list = new LinkedList<String>();
	    for (int i = 0; i < words.length; i++) {
	    	LinkedList<String> list = new LinkedList<String>();
	    	list.add(words[i]);
	        if (words[i] == null) {
	            continue;
	        }
	        for (int j = i+ 1; j < words.length; j++) {
	            if (words[j] != null && sortChars(words[i]).equals(sortChars(words[j]))) {
	                list.add(words[j]);
	                words[j] = null;
	            }
	        }
	        System.out.print(list);
	       // list.clear();
	    }
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		//sortWordsInArray(sentence);
		//groupinAnagrams(sentence);
		anagramGroups(sentence);
	}
}
