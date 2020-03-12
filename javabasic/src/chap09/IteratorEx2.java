package chap09;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {

	public static void main(String[] args) {
		ArrayList<String> original = new ArrayList<String>();
		ArrayList<String> copy1 = new ArrayList<String>();
		ArrayList<String> copy2 = new ArrayList<String>();
		
		for(int i=0;i<10;i++) {
			original.add(i+"");
		}
		
		Iterator<String> it = original.iterator();
		while(it.hasNext()) {
			copy1.add(it.next());
		}
		it = original.iterator();
		
		while(it.hasNext()) {
			copy2.add(it.next());
		}
		System.out.println(original);
		System.out.println(copy1);
		System.out.println(copy2);
	}

}
