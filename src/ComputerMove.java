import java.util.ArrayList;
public class ComputerMove {
	
	ArrayList<String> computerTerritories = new ArrayList<String>();
	int counter = 0;
	
	public void computerMove(){
		System.out.println("It is the computer's move.");
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
