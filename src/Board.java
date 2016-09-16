
public class Board {

	public static void makeBoard(){
		 String[][] board = new String[5][6];

	        System.out.println("Creating empty board... ");

	        /*for (String[] row : board) {
	            for (String s : row) {
	                System.out.print(" |" + " " + "| ");
	            }
	            System.out.println();
	        }
	        System.out.println();

	        populatePlayer("P1", " P2");*/
	    }

	    public static void showBoard(String name1, String name2){
	        System.out.println("Here is the game board:");
	        String[][] board = new String[5][6];

	        int boardCounter = 1;
	        for(String[] row : board) {
	            for(String s : row) {
	                if(boardCounter < 3) {
	                    System.out.print(" |  " + name1.substring(0,1) + "  | ");
	                }    else if (boardCounter == 3){
	                    System.out.print(" |     | ");
	                }  else{
	                    System.out.print(" |  " + name2.substring(0,1) + "  | ");
	                }
	            }
	            System.out.println();
	            boardCounter++;
	        }
	        System.out.println();
	    }

}
