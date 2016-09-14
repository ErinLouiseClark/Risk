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
	static int r3;
	static String name3 = "the computer";
	static String name1;
	static String name2;
	
	
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
		System.out.println("Enter the name of one player.");
		Scanner aa = new Scanner(System.in);
		name1 = aa.nextLine();
		
		System.out.println("Enter the name of the other player.");
		Scanner bb = new Scanner(System.in);
		name2 = bb.nextLine();
		startRoll();
	}
	
	public static void startRoll(){
		System.out.println(name1 + ", press enter to roll the die.");
		Scanner aa = new Scanner(System.in);
		String blank = aa.nextLine();
		r1 = (int)(Math.random()*6+1);
	
		System.out.println(name2 + ", press enter to roll the die.");
		Scanner bb = new Scanner(System.in);
		String blank2 = aa.nextLine();
		r2 = (int)(Math.random()*6+1);

		Scanner cc = new Scanner(System.in);
		r3 = (int)(Math.random()*6+1);
		
		checkOrder();
	}
	
	public static void orderPlayers(){
		ArrayList<Player> players = new ArrayList<Player>();
		System.out.println(name1 + ", you rolled a " + r1 + ".");
		System.out.println(name2 + ", you rolled a " + r2 + ".");
		System.out.println("The computer rolled a " + r3 + ".");
		if((r1 > r2) && (r1 > r2)){
			Player player1 = new Player(name1, r1, 0, 0, 0);
			players.add(player1);
			if(r2 > r3){
				Player player2 = new Player(name2, r2, 0, 0, 0);
				players.add(player2);
				Player player3 = new Player(name3, r3, 0, 0, 0);
				players.add(player3);
			}
			else{
				Player player2 = new Player(name3, r3, 0, 0, 0);
				players.add(player2);
				Player player3 = new Player(name2, r2, 0, 0, 0);
				players.add(player3);
			}
		}
		else if((r2 > r1) && (r2 > r3)){
			Player player1 = new Player(name2, r2, 0, 0, 0);
			players.add(player1);
			if((r1 > r3)){
				Player player2 = new Player(name1, r1, 0, 0, 0);
				players.add(player2);
				Player player3 = new Player(name3, r3, 0, 0, 0);
				players.add(player3);
			}
			else{
				Player player2 = new Player(name3, r3, 0, 0, 0);
				players.add(player2);
				Player player3 = new Player(name1, r1, 0, 0, 0);
				players.add(player3);
			}
		}
		else if((r3 > r2) && (r3 > r1)){
			Player player1 = new Player(name3, r3, 0, 0, 0);
			players.add(player1);
			if(r2 > r1){
				Player player2 = new Player(name2, r2, 0, 0, 0);
				players.add(player2);
				Player player3 = new Player(name1, r1, 0, 0, 0);
				players.add(player3);
			}
			else{
				Player player2 = new Player(name1, r1, 0, 0, 0);
				players.add(player2);
				Player player3 = new Player(name2, r2, 0, 0, 0);
				players.add(player3);
			}
		}
		System.out.println();
		System.out.println("Player One is " + players.get(0).getName() + ".");
		System.out.println("Player Two is " + players.get(1).getName() + ".");
		System.out.println("Player Three is " + players.get(2).getName() + ".");
		
	}
	
	public static void checkOrder(){
		if(r1 == r2){
			r1 = (int)(Math.random()*6+1);
			r2 = (int)(Math.random()*6+1);
			checkOrder();
		}
		else if(r1 == r3){
			r1 = (int)(Math.random()*6+1);
			r3 = (int)(Math.random()*6+1);
			checkOrder();

		}
		else if(r2 == r3){
			r2 = (int)(Math.random()*6+1);
			r3 = (int)(Math.random()*6+1);
			checkOrder();
		}
		else{
			orderPlayers();
		}
	}
		
}
	
	
	

