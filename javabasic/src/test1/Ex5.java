package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ex5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Stu("홍",1,1,100,100,100));
		list.add(new Stu("김",1,2,80,90,70));
		list.add(new Stu("남",1,2,90,70,80));
		list.add(new Stu("이",1,3,80,80,90));
		list.add(new Stu("최",1,4,70,90,70));
		list.add(new Stu("피",1,5,60,100,80));
		
//		Stu a = new Stu("d", 1, 1, 0, 0, 0);
//		System.out.println(a);
		
		Collections.sort(list);
		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
//		System.out.println(list);

	}

}
