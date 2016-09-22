import java.util.ArrayList;

public class Space {
	
	private String nameOfSpace;
	private String playerInControl;
	private int territoriesInSpace;
	static ArrayList<String>test = new ArrayList<String>();
	static ArrayList<Integer>test2 = new ArrayList<Integer>();
	static String name;
	//test produces "A1" and "A2"
	//use loop to create objects and add to ArrayList quickly
	
	public Space(String n, String p, int t){
		nameOfSpace = n;
		playerInControl = p;
		territoriesInSpace = t;
	}

	public String getNameOfSpace() {
		return nameOfSpace;
	}

	public void setNameOfSpace(String nameOfSpace) {
		this.nameOfSpace = nameOfSpace;
	}

	public String getPlayerInControl() {
		return playerInControl;
	}

	public void setPlayerInControl(String playerInControl) {
		this.playerInControl = playerInControl;
	}

	public int getTerritoriesInSpace() {
		return territoriesInSpace;
	}

	public void setTerritoriesInSpace(int territoriesInSpace) {
		this.territoriesInSpace = territoriesInSpace;
	}
	
	public static void makeSpaces(){
		test.add("A");
		test.add("B");
		test2.add(1);
		test2.add(2);
		for(int i = 0; i < 2; i++){
			name = test.get(i) + test2.get(i);
			Space A1 = new Space(name, "", 0);
			System.out.println(name);
		}
	}
}
