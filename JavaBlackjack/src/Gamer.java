import java.util.InputMismatchException;

public class Gamer extends User {
	public boolean goorstop(){
		System.out.print("go -> 1, stop -> 2 : ");
		try {
			int ans = UtFnc.sc.nextInt();
			if(ans == 1 || ans == 2) {
				System.out.println();
				return ans == 1 ? true : false;
			}
			else
				throw new InputMismatchException();
		} catch(InputMismatchException e) {
			UtFnc.sc.nextLine();
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���. \n");
			return goorstop();
		}
	}
}
