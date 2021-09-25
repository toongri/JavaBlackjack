
public class Card {
	
	/*
	 */
	private int cardNumber;
	private String cardShape;
	
	public Card(int cardNumber, String cardShape) {
		this.cardNumber = cardNumber;
		this.cardShape = cardShape;
	}
	
	public int getcardNumber() {
		return this.cardNumber;
	}
	public String getcardShape() {
		return this.cardShape;
	}
	
	
	public void setcardShape(String cardShape) {
		this.cardShape = cardShape;
	}
	
	public void setcardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	@Override
	public String toString() {
		return "number : " + this.cardNumber + ", shape : " + this.cardShape;
	}
}
