import java.util.Scanner;
public class PlayerMove {
	//column = Integer.parseInt(move.substring(1))-1;

	public static void playerMove(){
		System.out.println("Type in your move and press enter. Ex: A1");
		Scanner userInput = new Scanner(System.in);
		String move = userInput.nextLine();
		int row = Integer.parseInt(move.substring(0,1));
		String column = move.substring(1,2);
	}
	
}
