
public class Manager {
	Dealer dealer = new Dealer();
	Gamer gamer = new Gamer();
	Deck deck = new Deck();
	
	public void firstdraw() {
		dealer.draw(deck.getCrd());
		gamer.draw(deck.getCrd());
		dealer.draw(deck.getCrd());
		gamer.draw(deck.getCrd());
	}
	
	public String play() {
		firstdraw();
		
		while(gamer.goorstop())
			gamer.draw(deck.getCrd());
		
		if(dealer.sum() < 17)
			dealer.draw(deck.getCrd());
		int rstbol = decisionVictory(gamer.sum(), dealer.sum());
		return rstbol > 0 ? UtFnc.rstPrt[0] : rstbol < 0 ? UtFnc.rstPrt[1] : UtFnc.rstPrt[2];
	}
	
	public int decisionVictory(int gamer, int dealer) {
		gamer -= 21;
		dealer -= 21;
		
		if( gamer <= 0 && dealer <= 0)
			return gamer - dealer;
		else if(gamer > 0 && dealer > 0)
			return 0;
		else if(gamer > 0)
			return -1;
		else//dealer > 0
			return 1;
	}
}
