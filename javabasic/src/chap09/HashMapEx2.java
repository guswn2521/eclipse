package chap09;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("김자바", new Integer(90));
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			String key = (String)e.getKey();
			int value = (int)e.getValue();
			System.out.println("key : " +key + ", value : " + value);
		}
		
		set = map.keySet();
		System.out.println("key(name) : " + set);
		
		Collection<Integer> values = map.values();
		it = values.iterator();
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i.intValue();// object -> int
		}
		System.out.println("total : " + total);
		System.out.println("avg : " + total/set.size());
		System.out.println("max : " + Collections.max(values));
		System.out.println("min : " + Collections.min(values));
		

	}

}
