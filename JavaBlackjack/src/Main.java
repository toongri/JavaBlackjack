import java.util.InputMismatchException;
import CustomException.*;

public class Main {

	public static void main(String[] args) {
		UtFnc.menu();
		
		Manager manager = new Manager();
		try {
			System.out.println(manager.play());
		}catch(InputMismatchException e) {
			System.out.println("�Է��� �߸��ϼ̽��ϴ�.");
		}catch(GamernumberException e) {
			System.out.println("ī�� ������ 21�� �Ѱ���ϴ٤�");
			System.out.println(UtFnc.rstPrt[1]);
		}
	}

}
