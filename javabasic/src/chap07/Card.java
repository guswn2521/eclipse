package chap07;

public class Card {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;//상수정의
	
	static final int SPADE = 4;//상수정의
	static final int DIAMOND = 3;//상수정의
	static final int HEART = 2;//상수정의
	static final int CLOVER = 1;//상수정의
	
	int kind;
	int number; //1장
	
	
	
	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public Card() {
		this(SPADE,1);
	}
	
	@Override
	public String toString() { //
		String[] kinds = {"CLOVER","HEART","DIAMOND","SPADE"};
		String numbers = "123456789XJQK";
		String s = "kind : " + kinds[this.kind];
		s = s + ", number : " + numbers.charAt(this.number);
		return s; 
	}
	
}
