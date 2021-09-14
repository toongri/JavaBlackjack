import java.util.Scanner;

public class UtFnc {
	public static final int[] arrCNb =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		//{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J"};
	public static final String[] arrCSp =
		{"Diamond", "Heart", "Spade", "Clover"};
		//{다이아, 하트, 스페이드, 클로버}
	public static final String[] rstPrt =
		{"게이머의 승리입니다!", "딜러의 승리입니다!", "무승부입니다!"};
	public static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("======Blackjack Game Start!======");
	}
}
