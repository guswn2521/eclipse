package chap09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorEx1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			Object obj = it.next();
//			System.out.println(obj);
//		}
		System.out.println();
		ListIterator<String> lt = list.listIterator();
		while(lt.hasNext()) {
			String s = lt.next();
			System.out.println(s);
		}
		System.out.println();
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}

	}

}
