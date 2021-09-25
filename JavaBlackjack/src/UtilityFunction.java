import java.util.Scanner;

public class UtilityFunction {
	public static final int[] inventAllCardNumber =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		//{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J"};
	public static final String[] inventAllCardShape =
		{"Diamond", "Heart", "Spade", "Clover"};
	public static final String[] inventAllResultMessage =
		{"게이머의 승리입니다!", "딜러의 승리입니다!", "무승부입니다!"};
	public static Scanner scanner = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("======Blackjack Game Start!======");
	}
}
