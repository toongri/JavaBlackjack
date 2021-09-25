import java.util.Collections;
import java.util.Stack;

public class Deck {
	private Stack<Card> deck = new Stack<>();
	
	public Card getCrd() {
		return deck.pop();
	}
	
	public Deck() {
		openCardPackage();
		shuffleCardDeck();
	}
	
	private void openCardPackage() {
		for (int i : UtilityFunction.inventAllCardNumber) {
			for(String j : UtilityFunction.inventAllCardShape) {
				deck.push(new Card(i, j));
			}
		}
		
		System.out.println("새 덱 준비완료\n");
	}
	
	private void shuffleCardDeck() {
		Collections.shuffle(deck);
		
		System.out.println("셔플 완료\n");
	}
	
	/*
	@Override
	public String toString() {
		StringBuilder cardNumberAndShapeOfDeck = new StringBuilder();
		
		while(!deck.empty())
			cardNumberAndShapeOfDeck.append(deck.pop().toString()+"\n");
		
		return cardNumberAndShapeOfDeck.toString();
	}
	*/
}
