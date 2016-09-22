import java.util.ArrayList;
public class Board {

	   	//static String[][] board = new String[5][6];
	   //static int[][] board2 = new int[5][6];
	    
	    static ArrayList<String>letters = new ArrayList<String>();
       
        static ArrayList<Integer>numbers = new ArrayList<Integer>();
        
        static ArrayList<Space>spaces = new ArrayList<Space>();
        
	    public static void showBoard(){
		     int num1 = 0;
		     
		     letters.add("A");
		     letters.add("B");
		     letters.add("C");
		     letters.add("D");
		     letters.add("E");
	        
		     numbers.add(1);
		     numbers.add(2);
		     numbers.add(3);
		     numbers.add(4);
		     numbers.add(5);
		     numbers.add(6);
	        
	        
	        /*for(int i = 0; i < 3; i++){
	        	for(int j = 0; j < 6; j++){
	        		board[i][j] = Player.players.get(0).getName().substring(0,1).toUpperCase();
	        	}
	        }
	        for(int i = 2; i < 3; i++){
	        	for(int j = 0; j < 6; j++){
	        		board[i][j] = " ";
	        	}
	        }
	        for(int i = 3; i < 5; i++){
	        	for(int j = 0; j < 6; j++){
	        		board[i][j] = Player.players.get(1).getName().substring(0,1).toUpperCase();
	        	}
	        }
	        
	        System.out.println("Here is the game board:");
	        System.out.println("");
	       	System.out.println("      " + numbers.get(num1) + "     " + numbers.get(num1 + 1) + "     "+ numbers.get(num1 + 2) +"      "+ numbers.get(num1 + 3) +"       "+ numbers.get(num1 + 4) +"      "+ numbers.get(num1 + 5) +"");
            for(int i = 0; i < 5; i++) {
            	System.out.println("   __________________________________________");
            	System.out.print(letters.get(i) + "  ");
	           		for(int j = 0; j < 6; j++) {
	           			System.out.print("|  " + board[i][j] + "  |");    			
	           		}
	            System.out.println();
	        }
        	System.out.println("   __________________________________________");
	        System.out.println();
	    }
	    
	    public static void board2(){
	    	for(int i = 0; i < 3; i++){
	        	for(int j = 0; j < 6; j++){
	        		board2[i][j] = 0;
	        	}
	        }
	        for(int i = 2; i < 3; i++){
	        	for(int j = 0; j < 6; j++){
	        		board2[i][j] = 0;
	        	}
	        }
	        for(int i = 3; i < 5; i++){
	        	for(int j = 0; j < 6; j++){
	        		board2[i][j] = 0;
	        	}
	      	}*/
	        
	    }
	    
	    public static void makeSpaces(){
	    	for(int i = 0; i < 30; i++){
	    		
	    	}
	    }
	    
}
