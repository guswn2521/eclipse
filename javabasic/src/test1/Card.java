package test1;

public class Card {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind, number;
	
	public Card(int kind, int number) {//입력받은 int형 k,n을 Card의 변수 kind와 number에 넣음.
		this.kind = kind;
		this.number = number;
	}
	public Card() {
		this(SPADE,1);
	}
	@Override
	public String toString() {
		String [] kinds = {"CLOVER","HEART","DIAMOND","SPADE"};
		String numbers = "123456789XJQK";
		String s = "kind : " + kinds[this.kind];
		s = s + ", number : " + numbers.charAt(this.number);
		return s;
	}
}
