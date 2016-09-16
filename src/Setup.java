import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Setup {

	//column = Integer.parseInt(move.substring(1))-1;
	
	public static void showBoard(){
		int[][] board = new int[6][5];
		
		System.out.println("___________________________________________________________________");
		System.out.println("|     |     |     |     |");
		System.out.println("|     |     |     |     |");
		System.out.println("|  " + board[0][0] + "  |  " + board[0][0] +"  |  " + board[0][0] + "  |  " + board[0][0] + "  |  " + board[0][0] + "  |");
		System.out.println("|     |     |     |     |");
		System.out.println("|     |     |     |     |");
		System.out.println("___________________________________________________________________");	
		
	}

}
