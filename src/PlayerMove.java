import java.util.Scanner;
public class PlayerMove {
	
	static String move;
	static int moveIndex;
	static String startingSpace;
	static String letterOption1;
	static String letterOption2;
	static String letterOption3;
	static int numberOption1;
	static int numberOption2;
	static int column1 = 0;
	static String row1;
	static int column2;
	static String row2;
	static int startIndex;
	//boolean firstMove = true;
	
	public void determineArmies(){
		int armies = 0;
		if(Player.players.get(0).getName().equals(Player.name1)){
			for(int i = 1; i < 5; i++){
				if(Player.players.get(0).getContinents() == i){
					System.out.println("You receive " + (i+3) + " armies this round because you own " + i + " continent(s).");
					Player.players.get(0).setArmies(i);
					armies = i;
					chooseToAdd(armies);
				}
			}
			System.out.println("You receive 3 armies this round.");
			Player.players.get(0).setArmies(3);
			armies = 3;
			chooseToAdd(armies);
		}
		else{
			for(int i = 0; i < 5; i++){
				if(Player.players.get(1).getContinents() == i){
					System.out.println("You receive " + (i+3) + " armies this round because you own " + i + " continent(s).");
					Player.players.get(1).setArmies(i);
					armies = i;
					chooseToAdd(armies);
				}
			}
			System.out.println("You receive 3 armies this round.");
			Player.players.get(1).setArmies(3);
			armies = 3;
			chooseToAdd(armies);
		}
	}
	
	public void chooseToAdd(int armies){
		System.out.println("Which of your territories would you like to add your armies to?");
		Scanner userInput = new Scanner(System.in);
		String addition = userInput.nextLine();
		for(int i = 0; i < 30; i++){
			if(Territory.spaces.get(i).getNameOfSpace().equalsIgnoreCase(addition)){
				if(Territory.spaces.get(i).getPlayerInControl().equals(Player.name1)){
					Territory.spaces.get(i).setArmiesInTerritory(Territory.spaces.get(i).getArmiesInTerritory()+armies);
					startMove();
				}
			}
		}
		System.out.println("Not a valid choice.");
		chooseToAdd(armies);
	}
	
	
	public static void startMove(){
		System.out.println("Your move!");
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
	
	public static  void selectMove(){
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
	
	public static void checkIfValidRow(){
		
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
	
	public static void checkIfValidColumn(){

		if((column2 > 0 && column2 < 7)){
			checkIfValidMove();
		}
		
	}
	
	public static void checkIfValidMove(){
		if((Math.abs(column2-column1) == 1 || Math.abs(column2-column1) == 0) || ((row2.equals(letterOption1))||(row2.equals(letterOption2)) || (row2.equals(letterOption3)))){
			enterTerritory();
		}
		else{
			System.out.println("Not a valid move");
			selectMove();
		}
	}	
	
	public static void	enterTerritory(){
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
					if(Player.players.get(0).getName().equals(Player.name1)){
						Player.players.get(0).setTerritories(Player.players.get(0).getTerritories()+1);
						Player.players.get(1).setTerritories(Player.players.get(1).getTerritories()-1);
						if(Player.players.get(0).getTerritories() == 30){
							System.out.println("You win!");
							System.exit(0);
						}
						if(Player.players.get(0).getTerritories() == 5 ||Player.players.get(0).getTerritories() == 10 || Player.players.get(0).getTerritories() == 15 || Player.players.get(0).getTerritories() == 20 || Player.players.get(0).getTerritories() == 25){
							Player.players.get(0).setContinents(Player.players.get(0).getContinents()+1);
						}
					}
					else{
						Player.players.get(1).setTerritories(Player.players.get(1).getTerritories()+1);
						if(Player.players.get(1).getTerritories() == 30){
							System.out.println("You win!");
							System.exit(0);
						}
						if(Player.players.get(1).getTerritories() == 5 || Player.players.get(1).getTerritories() == 10 || Player.players.get(1).getTerritories() == 15 || Player.players.get(1).getTerritories() == 20 || Player.players.get(1).getTerritories() == 25){
							Player.players.get(1).setContinents(Player.players.get(1).getContinents()+1);
						}
					}
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
