package chap07;

public class Deck {
	final int CARD_NUM = 52;
	Card[] cardArr = new Card[CARD_NUM];
	
	public Deck() {
		int i = 0;
		for(int k=0;k<Card.KIND_MAX;k++) {
			for(int n=0;n<Card.NUM_MAX;n++) {
				cardArr[i] = new Card(k,n);
				i++;
			}
			
		}
//		for(Card card: cardArr) {
//			System.out.println(card.toString());
//		}
	}
	
	Card pick(){
		//cardArr[0~51]
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	Card pick(int index) {
		return cardArr[index];
	}
	
	void shuffle() {
		for(int i=0;i<cardArr.length;i++) {
			int r = (int)(Math.random()*CARD_NUM);
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
	
	
}
