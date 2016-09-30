
public class RiskRunner {

	public static void main(String[] args) {
		//Setup is complete
		//Battle, player, and computer moves needed - fix player move
		//Add armies after each round based on territories owned
		
		//introduction();
		Player.namePlayers();
		Territory.makeSpaces();
		Setup.setupIntro();
		Board.showBoard();
		if(Player.players.get(0).getName().equals(Player.name1)){
			PlayerMove.startMove();
		}
		else{
			ComputerMove.computerMove();
		}
	}
	
	public static void introduction(){
		System.out.println("Welcome to Risk!");
		System.out.println("This is a simplified, two-player version of Risk.");
		System.out.println("Your goal is to take control of the entire board!");
		System.out.println("Let's get started!");
	}

}
