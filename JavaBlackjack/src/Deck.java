import java.util.Collections;
import java.util.Stack;

public class Deck {
	private Stack<Card> deck = new Stack<>();
	
	public Card getCrd() {
		return deck.pop();
	}
	
	public Deck() {
		for (int i : UtFnc.arrCNb)
			for(String j : UtFnc.arrCSp)
				deck.push(new Card(i, j));
		
		System.out.println("»õ µ¦ ÁØºñ¿Ï·á\n");
		Collections.shuffle(deck);
		System.out.println("¼ÅÇÃ ¿Ï·á\n");
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		while(!deck.empty())
			sb.append(deck.pop().toString()+"\n");
		
		return sb.toString();
	}
}
