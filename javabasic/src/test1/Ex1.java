package test1;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList();
		ArrayList cha = new ArrayList();
		ArrayList hap = new ArrayList();
		
		for(int i=1;i<5;i++) {
			list1.add(i);
			list2.add(i+2);
		}
//		for(int i=0;i<list1.size();i++) {
//			for(int j=0;j<list2.size();j++) {
//				if(list1.get(i) == list2.get(j)) {
//					int temp = (int) list1.get(i);
//					kyo.add(temp);
//				}
//			}
//		}
		kyo.addAll(list1);
		kyo.retainAll(list2);
		
		cha.addAll(list1);
		cha.removeAll(list2);
		
		hap.addAll(list1);
		hap.removeAll(kyo);
		hap.addAll(list2);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(kyo);
		System.out.println(cha);
		System.out.println(hap);

	}

}
