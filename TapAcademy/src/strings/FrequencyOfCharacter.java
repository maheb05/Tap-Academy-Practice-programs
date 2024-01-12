package strings;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FrequencyOfCharacter {
	
	static void frequencyUsingMaps(String s) {
		char[] ch = s.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++) {
//			if(map.containsKey(ch[i])) {
//				Integer v = map.get(ch[i]);
//				map.put(ch[i], v+1);
//			}
//			else {
//				map.put(ch[i], 1);
//			}
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		
		for (Entry<Character, Integer> c : map.entrySet()) {
			System.out.println(c.getKey()+ " "+c.getValue());
		}
	}
	
	static void frequencychars(String s) {
		char[] ch = s.toCharArray();
		//int count = 1;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				continue;
			}
			int count = 1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j] = ' ';
				}
			}
			System.out.println(ch[i]+" "+count);
			//count = 1;
		}
		
	}
	
	 static void frequencyOFWords(String s){
		 String[] ss = s.split(" ");
		 for(int i=0;i<ss.length;i++) {
			 System.out.println(ss[i]+" "+ss[i].length());
		 }
	 }
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//String s = scan.next();
		String in = scan.nextLine();
		//frequencyUsingMaps(s);
		//frequencychars(s);
		frequencyOFWords(in);
	}
}
