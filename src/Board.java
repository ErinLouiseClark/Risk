import java.util.ArrayList;
public class Board {

	    public static void showBoard(){
	    	 int letterIndex = 0;
		     int boardCounter = 1;
		     boolean num = true;
		     int num1 = 0;
		        
	        String[][] board = new String[5][6];
	        
	        ArrayList<String>letters = new ArrayList<String>();
	        letters.add("A");
	        letters.add("B");
	        letters.add("C");
	        letters.add("D");
	        letters.add("E");
	       
	        ArrayList<Integer>numbers = new ArrayList<Integer>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);
	        numbers.add(6);
	        
	        for(int i = 0; i < 3; i++){
	        	for(int j = 0; j < 6; j++){
	        		board[i][j] = Player.players.get(0).getName().substring(0,1).toUpperCase();
	        	}
	        }
	        for(int i = 2; i < 3; i++){
	        	for(int j = 0; j < 6; j++){
	        		board[i][j] = "";
	        	}
	        }
	        for(int i = 3; i < 5; i++){
	        	for(int j = 0; j < 6; j++){
	        		board[i][j] = Player.players.get(0).getName().substring(0,1).toUpperCase();
	        	}
	        }
	        
	        System.out.println("Here is the game board:");
	        System.out.println("");
	        while(num){
	        	System.out.println("      " + numbers.get(num1) + "     " + numbers.get(num1 + 1) + "     "+ numbers.get(num1 + 2) +"      "+ numbers.get(num1 + 3) +"       "+ numbers.get(num1 + 4) +"      "+ numbers.get(num1 + 5) +"");
	        	num = false;
	        }
	        for(String[] row : board) {
            	System.out.println("   __________________________________________");
    			System.out.print(letters.get(letterIndex) + "  ");

            		for(int i = 0; i < 5; i++) {
	            		for(int j = 0; j < 6; j++) {
	            			System.out.print("|  " + board[i][j] + "  |");
	            			//System.out.print("|     |");
	            			//System.out.print("|  " + Player.players.get(1).getName().substring(0,1).toUpperCase() + "  |");
	            		}
	            	}
	            System.out.println();
	        }
        	System.out.println("   __________________________________________");
	        System.out.println();
	    }

}
