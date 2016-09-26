
public class RiskRunner {

	public static void main(String[] args) {
		//introduction();
		Player.namePlayers();
		Territory.makeSpaces();
		Setup.setupBoard();
		Board.showBoard();
	}
	
	public static void introduction(){
		System.out.println("Welcome to Risk!");
		System.out.println("This is a simplified, two-player version of Risk.");
		System.out.println("Your goal is to take control of the entire board!");
		System.out.println("Let's get started!");
	}

}
