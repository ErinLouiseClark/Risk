import java.util.ArrayList;
public class ComputerMove {
	
	static ArrayList<String> computerTerritories = new ArrayList<String>();
	static int counter = 0;
	static int armies = 0;
	static boolean add = true;
	
	public static void computerMove(){
		System.out.println("It is the computer's move.");
		if(Player.players.get(0).getName().getClass().equals(Player.name2)){
			for(int i = 1; i < 5; i++){
				if(Player.players.get(0).getContinents() == i){
					Player.players.get(0).setArmies(i);
					armies = i;
					
				}
			}
		}
		else{
			for(int i = 1; i < 5; i++){
				if(Player.players.get(1).getContinents() == i){
					Player.players.get(1).setArmies(i);
					armies = i;
				}
			}
		}
		while(add){
			int random = (int)(Math.random()*29)+1;
				if(Territory.spaces.get(random).getPlayerInControl().equals(Player.name2)){
					Territory.spaces.get(random).setArmiesInTerritory(Territory.spaces.get(random).getArmiesInTerritory()+1);
					add = false;
				}
		}
		
		for(int i = 0; i < 30; i++){
			if(Territory.spaces.get(i).getPlayerInControl().equals(Player.name2)){
				computerTerritories.add(Territory.spaces.get(i).getNameOfSpace());
			}
		}
		for(String s : computerTerritories){
			String row = s.substring(0, 1);
			for(int j = 0; j < 5; j++){
				if(Territory.letters.get(j)==row){
					int row2 = j; 
				}
			}
			int col = Integer.parseInt(s.substring(1,2));
			if(Territory.spaces.get(counter).getPlayerInControl().equals(Player.name1)){
				int column = Integer.parseInt(Territory.spaces.get(counter).getNameOfSpace().substring(1,2));
				if(Math.abs(column-col) == 0 || Math.abs(column-col) == 1){
					//check row
				}
			}
		}
	}
}
