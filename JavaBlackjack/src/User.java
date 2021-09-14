import java.util.ArrayList;

public class User {
	protected ArrayList<Card> arrCrd = new ArrayList<>();
	
	public ArrayList<Card> getarrCrd(){
		return this.arrCrd;
	}
	
	public void draw(Card crd) {
		System.out.println(this.getClass().getName()+" "+crd.toString());
		this.arrCrd.add(crd);
	}
	
	public int sum() {
		int sum = 0;
		for(Card card : arrCrd)
			sum+=card.getCrdNum();
		
		return sum;
	}
}
