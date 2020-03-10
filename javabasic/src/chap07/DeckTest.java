package chap07;

public class DeckTest {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Card card = deck.pick(0);
		System.out.println(card);
		deck.shuffle();
		card = deck.pick(0);
		System.out.println(card);
		

	}

}
