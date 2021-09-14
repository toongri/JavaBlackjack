import java.util.ArrayList;

public class User {
	protected ArrayList<Card> arrCrd = new ArrayList<>();
	
	public ArrayList<Card> getarrCrd(){
		return this.arrCrd;
	}
	
	public void draw(Card crd){
		String usr = this.getClass().getName();
		System.out.println(usr + "���� ���Դϴ�. "+crd.toString() + "�� �����̽��ϴ�.");
		this.arrCrd.add(crd);
		System.out.println("���� " + usr + "���� ī�� ������ "+ sum() + "�Դϴ�.\n");
	}
	
	public int sum() {
		int sum = 0;
		for(Card card : arrCrd)
			sum+=card.getCrdNum();
		
		return sum;
	}
}
