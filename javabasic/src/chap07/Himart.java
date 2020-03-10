package chap07;

public class Himart {
	int price;
	int bonusPoint;
	
	public Himart(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10);
	}
}
