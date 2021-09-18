import java.util.ArrayList;

public class User {
	protected ArrayList<Card> arrCrd = new ArrayList<>();
	
	public ArrayList<Card> getarrCrd(){
		return this.arrCrd;
	}
	
	public void draw(Card crd){
		String usr = this.getClass().getName();
		System.out.println(usr + "님의 턴입니다. "+crd.toString() + "를 뽑으셨습니다.");
		this.arrCrd.add(crd);
		System.out.println("현재 " + usr + "님의 카드 총합은 "+ sum() + "입니다.\n");
	}
	
	public int sum() {
		int sum = 0;
		for(Card card : arrCrd)
			sum+=card.getCrdNum();
		
		return sum;
	}
}
