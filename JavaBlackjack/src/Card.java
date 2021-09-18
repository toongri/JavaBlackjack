
public class Card {
	
	/*
	 */
	private int crdNum;
	private String crdShp;
	
	public Card(int crdNum, String crdShp) {
		this.crdNum = crdNum;
		this.crdShp = crdShp;
	}
	
	public int getCrdNum() {
		return this.crdNum;
	}
	public String getCrdShp() {
		return this.crdShp;
	}
	
	
	public void setCrdShp(String crdShp) {
		this.crdShp = crdShp;
	}
	
	public void setCrdNum(int crdNum) {
		this.crdNum = crdNum;
	}
	
	@Override
	public String toString() {
		return "number : " + this.crdNum + ", shape : " + this.crdShp;
	}
}
