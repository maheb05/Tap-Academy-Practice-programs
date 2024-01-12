package maps;

import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class One {
	public static void main(String[] args) {
		//HashMap<String, Integer> map = new HashMap<String,Integer>();
		//LinkedHashMap<String, Integer> map = new LinkedHashMap<String,Integer>();
		
		Compare1 com = new Compare1();
		
		Compare2 com1 = new Compare2();
		
		Compare3 com2 = new Compare3();
		
		TreeMap<String, Integer> map = new TreeMap<String,Integer>(com2);
		
		map.put("india", 5000);
		map.put("usa", 500);
		map.put("uae", 300);
		map.put("uk", 8000);
		map.put("china", 500);
		map.put("japan", 400);
		map.put("italy", 400);
		map.put("india", 9000);
		
		//System.out.println(map);
		
//		Set<String> keys = map.keySet();
//		
//		for( String key:keys) {
//			Integer value = map.get(key);
//			System.out.println(key+" : "+value);
//		}
		
//		Set<Entry<String, Integer>> set = map.entrySet();
//		for(Entry e :set) {
//			System.out.println(e);
//		}
		
//		IdentityHashMap<String, Integer> mapp = new IdentityHashMap<>();
//		mapp.putAll(map);
//		
//		System.out.println(mapp.size());
		
		Set<Entry<String, Integer>> set = map.entrySet();
		for(Entry e:set) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}  
}

class Compare1 implements Comparator<String>{
	public int compare(String s1 ,String s2) {
		return s1.compareTo(s2);
	}
}

class Compare2 implements Comparator<String>{
	public int compare(String s1,String s2) {
		return s1.compareTo(s2) * -1;
	}
}

class Compare3 implements Comparator<String>{
	public int compare(String s1,String s2) {
		
		int o = s1.length();
		int p = s2.length();
		
		if(o == p) {
			return s1.compareTo(s2);
		}
		else {
			return o - p ;
		}
	}
}
