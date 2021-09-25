import java.util.InputMismatchException;

public class Gamer extends User {
	int userAnswer;
	
	public boolean questionGoOrStop(){
		System.out.print("go -> 1, stop -> 2 : ");
		try {
			return receiveUserAnswer();
		} catch(InputMismatchException e) {
			UtilityFunction.scanner.nextLine();
			System.out.println("값을 잘못 입력하셨습니다. 다시 입력해주세요. \n");
			return questionGoOrStop();
		}
	}
	
	private boolean receiveUserAnswer() throws InputMismatchException{
		userAnswer = UtilityFunction.scanner.nextInt();
		if(isCorrectAnswer(userAnswer)) {
			System.out.println();
			return userAnswer == 1 ? true : false;
		}else {
			throw new InputMismatchException();
		}
	}
	
	private boolean isCorrectAnswer(int userAnswer) {
		return (userAnswer == 1 || userAnswer == 2 ) ? true : false;
	}
}
