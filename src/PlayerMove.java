import java.util.Scanner;
public class PlayerMove {
	

	public static void playerMove(){
		System.out.println("Type in your move and press enter. Ex: A1");
		Scanner userInput = new Scanner(System.in);
		String move = userInput.nextLine();
		
		int column = Integer.parseInt(move.substring(1,2));
		String row = move.substring(0,1);
		
		if(move.length()>2 || move.length()<2){
			System.out.println("Invalid Move.");
			playerMove();
		}
		
		for(String s : Territory.letters){
			if(row.equalsIgnoreCase(s)){
				//Here
			}
		}
		
		for(int  i : Territory.numbers){
			if(((column == i + 1) || (column == i - 1) || (column == i)) && (column > 0 && column < 7)){
				//Here
			}
		}
		
		for(int i = 0; i < 30; i ++){
			if(move.equalsIgnoreCase(Territory.spaces.get(i).getNameOfSpace()));
			break;
		}
		
		
	}
}
