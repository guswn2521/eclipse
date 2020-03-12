package chap09;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		//ArrayList 중요
		ArrayList list1 = new ArrayList();
		list1.add(new Integer(5)); //인덱스 0
		list1.add(new Integer(4)); //인덱스 1
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		System.out.println(list1.toString());
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println(list1.toString());
		System.out.println(list2);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		
		System.out.println(list2);
		
		list2.set(3, "AA");
		System.out.println(list2);
		
		System.out.println("list1.retainAll(list2) : "+ list1.retainAll(list2));
		
		//
		for(int i=list2.size()-1;i>=0;i--){
			if(list1.contains(list2.get(i))) {
				System.out.println(list2);
				list2.remove(i);
			}
		}
		System.out.println(list1);
		System.out.println(list2);
		

	}
}
