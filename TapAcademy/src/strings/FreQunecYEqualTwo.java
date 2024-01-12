package strings;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FreQunecYEqualTwo {
	static void frequency(String s) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), s.charAt(i)+1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		
		for (Entry<Character, Integer> c : map.entrySet()) {
			if(c.getValue()==2) {
				System.out.println(c.getKey()+" "+c.getValue());
			}
		}
	}
}
