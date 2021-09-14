
public class Gamer extends User{
	public boolean goorstop() {
		System.out.print("go -> 1, stop -> 2 : ");
		return UtFnc.sc.nextInt() == 1 ? true : false;
	}
}
