package chap09;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		for(int j=0;j<5;j++) {
			
			for(int i=0; set.size()<6;i++) {
				int num = (int)(Math.random()*45)+1;
				set.add(new Integer(num));
			}
			List<Integer> list = new LinkedList<Integer>(set);
			Collections.sort(list);
			System.out.println(list);
			set.clear();
		}
	}

}
