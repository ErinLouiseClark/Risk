import java.util.ArrayList;
public class Board {

	    public static void showBoard(){
	        int counter = 0;
	        
	        System.out.println("Here is the game board:");
	        System.out.println();
	       	System.out.println("      " + Territory.numbers.get(0) + "     " + Territory.numbers.get(1) + "     "+ Territory.numbers.get(2) +"      "+ Territory.numbers.get(3) +"       "+ Territory.numbers.get(4) +"      "+ Territory.numbers.get(5) +"");
            for(int i = 0; i < 5; i++) {
            	System.out.println("   __________________________________________");
            	System.out.print(Territory.letters.get(i) + "  ");
	           		for(int j = 0; j < 6; j++) {
	           			System.out.print("|  " + Territory.spaces.get(counter).getPlayerInControl().substring(0,1).toUpperCase() + "  |");
	           			counter++;
	           		}
	            System.out.println();
	        }
        	System.out.println("   __________________________________________");
	        System.out.println();
	    }
	    
}
