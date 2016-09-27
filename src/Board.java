import java.util.ArrayList;
public class Board {

	    public static void showBoard(){
	        
	        System.out.println("Here is the game board:");
	        System.out.println("");
	       	/* Problem with line*/ System.out.println("      " + Territory.test2.get(0) + "     " + Territory.test2.get(1) + "     "+ Territory.test2.get(2) +"      "+ Territory.test2.get(3) +"       "+ Territory.test2.get(4) +"      "+ Territory.test2.get(5) +"");
            for(int i = 0; i < 5; i++) {
            	System.out.println("   __________________________________________");
            	System.out.print(Territory.test.get(i) + "  ");
	           		for(int j = 0; j < 6; j++) {
	           			System.out.print("|  " + Territory.spaces.get(i).getPlayerInControl() + "  |");    			
	           		}
	            System.out.println();
	        }
        	System.out.println("   __________________________________________");
	        System.out.println();
	    }
	    
}
