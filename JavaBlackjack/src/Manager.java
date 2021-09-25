import CustomException.*;

public class Manager {
	Dealer dealer = new Dealer();
	Gamer gamer = new Gamer();
	Deck deck = new Deck();
	
	public void firstDraw() {
		dealer.draw(deck.getCrd());
		gamer.draw(deck.getCrd());
		dealer.draw(deck.getCrd());
		gamer.draw(deck.getCrd());
	}
	
	public String play() throws GamernumberException{
		firstDraw();
		playUserTurn();
		checkDealerDeck();
		return printResultToUser();
	}
	
	public void playUserTurn() throws GamernumberException{
		while(this.gamer.questionGoOrStop()) {
			this.gamer.draw(deck.getCrd());
			if (this.gamer.sum() > 21)
				throw new GamernumberException();
		}
	}
	
	public void checkDealerDeck() {
		if(this.dealer.sum() < 17)
			this.dealer.draw(this.deck.getCrd());
	}
	
	public String printResultToUser(){
		int rstbol = decisionVictory(gamer.sum(), dealer.sum());
		
		return rstbol > 0 ? UtilityFunction.inventAllResultMessage[0] : rstbol < 0 ? UtilityFunction.inventAllResultMessage[1] : UtilityFunction.inventAllResultMessage[2];
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
