package test1;

public class DeckTest {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Card card = deck.pick();
		System.out.println(card);
		deck.shuffle();
		card = deck.pick();
		System.out.println(card);

	}

}
