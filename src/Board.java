import java.util.ArrayList;
public class Board {

	    public static void showBoard(String name1, String name2){
	        String[][] board = new String[5][6];
	        ArrayList<String>letters = new ArrayList<String>();
	        letters.add("A");
	        letters.add("B");
	        letters.add("C");
	        letters.add("D");
	        letters.add("E");
	        int letterIndex = 0;
	        int boardCounter = 1;
	        System.out.println("Here is the game board:");
	        System.out.println("");
        	System.out.println("      1     2     3      4       5      6");
	        for(String[] row : board) {
            	System.out.println("   __________________________________________");
    			System.out.print(letters.get(letterIndex) + "  ");

            		for(String s : row) {
	            		if(boardCounter < 3) {
	            			System.out.print("|  " + Player.players.get(0).getName().substring(0,1).toUpperCase() + "  |");
	            		}   
	            		else if (boardCounter == 3){
	            			System.out.print("|     |");
	            		}
	            		else{
	            			System.out.print("|  " + Player.players.get(1).getName().substring(0,1).toUpperCase() + "  |");
	            		}
	            	}
	            System.out.println();
	            boardCounter++;
        		letterIndex++;
	        }
        	System.out.println("   __________________________________________");
	        System.out.println();
	    }

}
