import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Player {

	private String name;
	private int roll;
	private int territories;
	private int continents;
	private int armies;
	static int r1;
	static int r2;
	static String name1;
	static String name2 = "Computer";	
	static ArrayList<Player> players = new ArrayList<Player>();
	//your ints are easy to follow 
	
	public Player(String n, int r, int t, int c, int a){
		name = n;
		roll = r;
		territories = t;
		continents = c;
		armies = a;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getTerritories() {
		return territories;
	}

	public void setTerritories(int territories) {
		this.territories = territories;
	}

	public int getContinents() {
		return continents;
	}

	public void setContinents(int continents) {
		this.continents = continents;
	}

	public int getArmies() {
		return armies;
	}

	public void setArmies(int armies) {
		this.armies = armies;
	}

	public static void namePlayers(){
		System.out.println("Enter your name.");
		Scanner aa = new Scanner(System.in);
		name1 = aa.nextLine();
		startRoll();
	}
	
	public static void startRoll(){
		System.out.println(name1 + ", press enter to roll the die.");
		Scanner aa = new Scanner(System.in);
		String blank = aa.nextLine();
		r1 = (int)(Math.random()*6+1);
		System.out.println("You rolled a " + r1 + ".");

		Scanner cc = new Scanner(System.in);
		r2 = (int)(Math.random()*6+1);
		System.out.println("The computer rolled a " + r2 + ".");
		System.out.println();
		
		if(r1 > r2){
			Player player1 = new Player(name1, r1, 0, 0, 0);
			players.add(player1);
			Player player2 = new Player(name2, r2, 0, 0, 0);
			players.add(player2);
			System.out.println(name1 + ", you are Player One.");
			System.out.println("The computer is Player Two.");
			System.out.println();
		}
		else{
			Player player1 = new Player(name1, r1, 0, 0, 0);
			Player player2 = new Player(name2, r2, 0, 0, 0);
			players.add(player2);
			players.add(player1);
			System.out.println("The computer is Player One.");
			System.out.println(name1 + ", you are Player Two.");
			System.out.println();
		}
	}
}
	
	