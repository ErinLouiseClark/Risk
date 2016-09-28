import java.util.Scanner;
public class PlayerMove {
	
	String move;
	int moveIndex;
	String startingSpace;
	String letterOption1;
	String letterOption2;
	int numberOption1;
	int numberOption2;
	
	public void playerMove(){
		//order of this class may need to be changed to be more logical
		System.out.println("Type in your move and press enter. Ex: A1");
		Scanner userInput = new Scanner(System.in);
		move = userInput.nextLine();
		for(int i = 0; i < 30; i++){
			if(Territory.spaces.get(i).getNameOfSpace().equalsIgnoreCase(move)){
				moveIndex = i;
			}
		}
		System.out.println("From which space of yours would you like to attack from?");
		Scanner userInput2 = new Scanner(System.in);
		startingSpace = userInput2.nextLine();
		//make sure starting space is a valid choice
		for(int i = 0; i < 30; i++){
			if(Territory.spaces.get(i).getNameOfSpace().equalsIgnoreCase(startingSpace)){
				System.out.println("There are " + Territory.spaces.get(i).getArmiesInTerritory() + " armies your starting spot.");
				System.out.println("There are " + Territory.spaces.get(moveIndex).getArmiesInTerritory() + " armies in " + move.toUpperCase() + ".");
				System.out.println("Would you still like to continue with this move? (1) Yes or (2) No. Enter 1 or 2.");
				Scanner userInput3 = new Scanner(System.in);
				int continueMove = userInput3.nextInt();
				if(continueMove == 1){
					break;
				}
				else if(continueMove == 2){
					System.out.println("Ok, let's start again.");
					playerMove();
				}
				else{
					System.out.println("That is not a valid answer. Let's start again.");
					playerMove();
				}
			}
		}
		
		for(int i = 0; i < 30; i ++){
			if(move.equalsIgnoreCase(Territory.spaces.get(i).getNameOfSpace())){
				if(Territory.spaces.get(i).getPlayerInControl().equalsIgnoreCase(Player.name1.substring(0,1))){
					System.out.println("You already own that spot!");
					playerMove();
				}
				else if(Territory.spaces.get(i).getPlayerInControl().equals(" ")){
					Territory.spaces.get(i).setPlayerInControl(Player.name1.substring(0,1));
					System.out.println("You know have control of " + move.toUpperCase() + "!");
				}
				else{
					System.out.println("The " + Player.name2 + " owns this spot!");
					System.out.println("Would you like to (1) battle or (2) pick another spot? Enter 1 or 2.");
					Scanner userInput1 = new Scanner(System.in);
					int choice = userInput1.nextInt();
					if(choice == 1){
						BattleMove.battleMove();
					}
					else if(choice == 2){
						playerMove();
					}
					else{
						System.out.println("That is not a valid choice! Try again.");
						playerMove();
					}
				}
			}
		}		
	}
	
	public void checkIfValid(){
		int column = Integer.parseInt(move.substring(1,2));
		String row = move.substring(0,1);
		
		if(move.length()>2 || move.length()<2){
			System.out.println("Invalid Move.");
			playerMove();
		}
		
		for(int i = 0; i < Territory.letters.size(); i++){
			if(row.equalsIgnoreCase(Territory.letters.get(i))){
				if(i == 0){
					letterOption1 = letterOption1 = Territory.letters.get(i+1);
				}
				else if(i == 7){
					letterOption1 = Territory.letters.get(i-1);
				}
				else{
					letterOption1 = Territory.letters.get(i+1);
					letterOption2 = Territory.letters.get(i-1);
				}
			}
		}
		
		for(int  i : Territory.numbers){
			if((column == i) && (column > 0 && column < 7)){
				if(i == 0){
					numberOption1 = Territory.numbers.get(i+1);
				}
				else if(i == 7){
					numberOption1 = Territory.numbers.get(i-1);
				}
				else{
					numberOption1 = Territory.numbers.get(i+1);
					numberOption2 = Territory.numbers.get(i-1);
				}
			}
		}
		
	}
}
