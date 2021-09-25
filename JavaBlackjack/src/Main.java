import java.util.InputMismatchException;
import CustomException.*;

public class Main {

	public static void main(String[] args) {
		UtilityFunction.menu();
		
		Manager manager = new Manager();
		try {
			System.out.println(manager.play());
		}catch(InputMismatchException e) {
			System.out.println("입력을 잘못하셨습니다.");
		}catch(GamernumberException e) {
			System.out.println("카드 총합이 21을 넘겼습니다ㅠ");
			System.out.println(UtilityFunction.inventAllResultMessage[1]);
		}
	}

}
