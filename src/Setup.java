import java.util.Scanner;
public class Setup {

	public static void setupBoard(){
		int armies1 = 30;
		int armies2 = 30;
		int counter1 = 0;
		int counter2 = 18;
		//add error code
		//last space in your territories takes all remaining armies
		
		System.out.println("Player One takes the top of the board, and Player Two takes the bottom.");
		System.out.println();
		System.out.println("Each location is a territory, and each row is a continent.");
		System.out.println();
		System.out.println("Both players start with 12 territories, two continents, and 30 armies.");
		System.out.println();
		System.out.println("There must be at least one army in each territory that you own.");
		System.out.println();
		if(Player.players.get(0).getName() == Player.name1){
			System.out.println("You control the top 12 territories.");
			System.out.println("You will start filling the board from the top left to the bottom right (from A1 to B6).");
			for(int i = 0; i < 2; i++){
				for(int j = 0; j < 6; j++){
					System.out.println("You have " + armies1 + " armies.");
					System.out.println("How many armies would you like to put in " + Territory.spaces.get(counter1).getNameOfSpace() + "?");
					counter1++;
					Scanner userInput = new Scanner(System.in);
					int choice = userInput.nextInt();
					armies1 -= choice;
					Territory.spaces.get(counter1).setArmiesInTerritory(choice);
					Territory.spaces.get(counter1).setPlayerInControl(Player.players.get(0).getName().substring(0,1));
				}
			}
		}
		else{
			System.out.println("You control the bottom 12 territories.");
			System.out.println("You will start filling the board from the top left to the bottom right (from D1 to E6).");
			for(int i = 0; i < 2; i++){
				for(int j = 0; j < 6; j++){
					System.out.println("You have " + armies2 + " armies.");
					System.out.println("How many armies would you like to put in " + Territory.spaces.get(counter2).getNameOfSpace() + "?");
					counter2++;
					Scanner userInput = new Scanner(System.in);
					int choice = userInput.nextInt();
					armies2 -= choice;
					Territory.spaces.get(counter2).setArmiesInTerritory(choice);
					Territory.spaces.get(counter2).setPlayerInControl(Player.players.get(0).getName().substring(0,1));
				}
			}
		}
	}
}
