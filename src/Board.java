
public class Board {

	public void showBoard(){
		 String[][] board = new String[5][6];

	        System.out.println("Creating empty board... ");

	        for (String[] row : board) {
	            for (String elem : row) {
	                System.out.print(" |" + " " + "| ");
	            }
	            System.out.println();
	        }
	        System.out.println();

	        populatePlayer("P1", " P2");
	    }

	    private void populatePlayer(String name1, String name2) {
	        System.out.println("Populating board with players " + name1 + " and " + name2 + " ...");
	        String[][] board = new String[5][6];

	        int boardCounter = 1;
	        for (String[] row : board) {
	            for (String s : row) {
	                if (boardCounter < 3) {
	                    System.out.print(" |  " + name1 + "  | ");
	                }    else if (boardCounter ==3) {
	                    System.out.print(" |  " + "  "  + "  | ");
	                }  else {
	                    System.out.print(" | " + name2 + "  | ");
	                }
	            }
	            System.out.println();
	            boardCounter++;
	        }
	        System.out.println();
	    }

}
