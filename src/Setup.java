import java.util.Scanner;
public class Setup {

	public static void setupIntro(){
		System.out.println("Player One takes the top of the board, and Player Two takes the bottom.");
		System.out.println();
		System.out.println("Each location is a territory, and each row is a continent.");
		System.out.println();
		System.out.println("Both players start with 12 territories, two continents, and 30 armies.");
		System.out.println();
		System.out.println("There must be at least one army in each territory that you own.");
		System.out.println();
		setupBoard();
	}
	
	public static void setupBoard(){
		int armies1 = 30;
		int armies2 = 30;
		int counter1 = 0;
		int counter2 = 18;
			
		if(Player.players.get(0).getName() == Player.name1){
			System.out.println("You control the top 12 territories.");
			System.out.println("You will start filling the board from the top left to the bottom right (from A1 to B6).");
			for(int i = 0; i < 12; i++){
					System.out.println("You have " + armies1 + " armies.");
					System.out.println("How many armies would you like to put in " + Territory.spaces.get(counter1).getNameOfSpace() + "?");
					counter1++;
					Scanner userInput = new Scanner(System.in);
					int choice = userInput.nextInt();
					if(Territory.spaces.get(counter1).getNumOfSpace() == 11){
						Territory.spaces.get(counter1).setArmiesInTerritory(armies1);
						Territory.spaces.get(counter1).setPlayerInControl(Player.players.get(0).getName().substring(0,1));
					}
					if(choice < 0 || choice > armies1){
						System.out.println("Invalid option.");
						setupBoard();
					}
					else{
						armies1 -= choice;
						Territory.spaces.get(counter1).setArmiesInTerritory(choice);
						Territory.spaces.get(counter1).setPlayerInControl(Player.players.get(0).getName().substring(0,1));
					}
				}
		}
		else{
			System.out.println("You control the bottom 12 territories.");
			System.out.println("You will start filling the board from the top left to the bottom right (from D1 to E6).");
			for(int i = 18; i < 30; i++){
				System.out.println("You have " + armies2 + " armies.");
				System.out.println("How many armies would you like to put in " + Territory.spaces.get(counter2).getNameOfSpace() + "?");
				counter2++;
				Scanner userInput = new Scanner(System.in);
				int choice = userInput.nextInt();
				if(Territory.spaces.get(counter2).getNumOfSpace() == 29){
					Territory.spaces.get(counter2).setArmiesInTerritory(armies2);
					Territory.spaces.get(counter2).setPlayerInControl(Player.players.get(0).getName().substring(0,1));
				}
				if(choice < 0 || choice > armies2){
					System.out.println("Invalid option.");
					setupBoard();
				}
				else{
					armies2 -= choice;
					Territory.spaces.get(counter2).setArmiesInTerritory(choice);
					Territory.spaces.get(counter2).setPlayerInControl(Player.players.get(0).getName().substring(0,1));
				}
			}
		}
	}
}
