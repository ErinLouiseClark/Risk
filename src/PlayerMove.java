import java.util.Scanner;
public class PlayerMove {
	
	String move;
	int moveIndex;
	String startingSpace;
	String letterOption1;
	String letterOption2;
	String letterOption3;
	int numberOption1;
	int numberOption2;
	int column1 = 0;
	String row1;
	int column2;
	String row2;
	int startIndex;
	
	public void startMove(){
		System.out.println("From which of your territories would you like to start your attack? Ex: A1");
		Scanner userInput2 = new Scanner(System.in);
		startingSpace = userInput2.nextLine().toUpperCase();
		column1 = Integer.parseInt(move.substring(1,2));
		row1 = move.substring(0,1);
		if(startingSpace.length() < 2 || startingSpace.length() > 2){
			System.out.println("Not a valid choice.");
			startMove();
		}
		for(int i = 0; i < 30; i++){
			if(Territory.spaces.get(i).getNameOfSpace().equals(startingSpace)){
				if(Territory.spaces.get(i).getPlayerInControl().equals(Player.name1)){
					startIndex = i;
					selectMove();
				}
			}
		}
		System.out.println("Not a valid choice.");
		startMove();
	}
	
	public void selectMove(){
		System.out.println("What territory would you like to invade? Ex: A1");
		Scanner userInput = new Scanner(System.in);
		move = userInput.nextLine();
		column2 = Integer.parseInt(move.substring(1,2));
		row2 = move.substring(0,1).toUpperCase();
		if(move.length() < 2 || move.length() > 2){
			System.out.println("Not a valid move.");
			selectMove();
		}
		
		checkIfValidRow();
	}
	
	public void checkIfValidRow(){
		
		for(int i = 0; i < Territory.letters.size(); i++){
			if(row2.equalsIgnoreCase(Territory.letters.get(i))){
				letterOption3 = Territory.letters.get(i);
				if(i == 0){
					letterOption1 = Territory.letters.get(i+1);
					checkIfValidColumn();
				}
				else if(i == 5){
					letterOption1 = Territory.letters.get(i-1);
					checkIfValidColumn();
				}
				else{
					letterOption1 = Territory.letters.get(i+1);
					letterOption2 = Territory.letters.get(i-1);
					checkIfValidColumn();
				}
			}
		}
		System.out.println("Not a valid move");
		selectMove();
		
	}
	
	public void checkIfValidColumn(){

		if((column2 > 0 && column2 < 7)){
			checkIfValidMove();
		}
		
	}
	
	public void checkIfValidMove(){
		if((Math.abs(column2-column1) == 1 || Math.abs(column2-column1) == 0) || ((row2.equals(letterOption1))||(row2.equals(letterOption2)) || (row2.equals(letterOption3)))){
			enterTerritory();
		}
		else{
			System.out.println("Not a valid move");
			selectMove();
		}
	}	
	
	public void	enterTerritory(){
		for(int i = 0; i < 30; i++){
			if(Territory.spaces.get(i).getNameOfSpace().equalsIgnoreCase(move)){
				moveIndex = i;
				if(Territory.spaces.get(i).getPlayerInControl().equals(Player.name2)){
					System.out.println("Oh no! The computer has control of this territory!");
					System.out.println("There are " + Territory.spaces.get(startIndex).getArmiesInTerritory() + " armies your starting spot.");
					System.out.println("There are " + Territory.spaces.get(moveIndex).getArmiesInTerritory() + " armies in " + move.toUpperCase() + ".");
					System.out.println("Would you like to (1) battle or (2) choose a new space? Enter 1 or 2");
					Scanner userInput3 = new Scanner(System.in);
					int continueMove = userInput3.nextInt();
					if(continueMove == 1){
						BattleMove.battleMove();
					}
					else if(continueMove == 2){
						System.out.println("Ok, let's start again.");
						startMove();
					}
					else{
						System.out.println("That is not a valid answer. Let's start again.");
						startMove();
					}
				}
				else if(Territory.spaces.get(i).getPlayerInControl().equals(Player.name1)){
					System.out.println("You already have control of this territory! Let's start again.");
					startMove();
				}
				else{
					Territory.spaces.get(i).setPlayerInControl(Player.name1);
					System.out.println("You now have control of " + Territory.spaces.get(i).getNameOfSpace() + ".");
					System.out.println("Your starting territory had " + Territory.spaces.get(startIndex).getArmiesInTerritory() + " armies.");
					System.out.println("How many armies would you like to move from your starting territory into your new territory? You must place at least one army.");
					Scanner userInput3 = new Scanner(System.in);
					int movedArmies = userInput3.nextInt();
					if(movedArmies > 1 && movedArmies < Territory.spaces.get(startIndex).getArmiesInTerritory()){
						Territory.spaces.get(startIndex).setArmiesInTerritory(Territory.spaces.get(startIndex).getArmiesInTerritory()-movedArmies);
						Territory.spaces.get(moveIndex).setArmiesInTerritory(movedArmies);
					}
					else{
						System.out.println("Not a valid choice.");
						
					}
				}
			}
		}

	}
}
