package chap07;

import java.util.Vector;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	//Himart[] item = new Himart[10];
	Vector item = new Vector();
	int i = 0;
	
	void buy(Himart p) {
		if(money < p.price) {
			System.out.println("money 부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
		//item[i++] = p;
		item.add(p);
	}
	
	void summary() {
		int sum = 0;
		int bSum = 0;
		String itemList = "";
//		for(int i=0;i<item.length;i++) {
//			if(item[i] == null) break;
//			
//			if(i!=0) {
//				itemList = itemList + ",";
//			}
//			
//			sum += item[i].price;
//			bSum += item[i].bonusPoint;
//			itemList = itemList + item[i] ;
//		
//		}
		if(item.isEmpty()) {
			System.out.println("구입한 제품 없음");
			return;
		}
		for(int i=0;i<item.size();i++) {
			Himart p = (Himart)item.get(i);
			sum = sum + p.price;
			bSum = bSum + p.bonusPoint;
			itemList += (i==0)? "" + p : "," + p;
		}
		
		System.out.println("Sum = " + sum);
		System.out.println("bSum = " + bSum);
		System.out.println("ItemList = " + itemList);
	}
	
	
}
