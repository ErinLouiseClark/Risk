import java.util.ArrayList;

public class Territory {
	
	private String nameOfSpace;
	private String playerInControl;
	private int armiesInTerritory;
	private int numOfSpace;
	static public int counter = 1;
	static ArrayList<String>test = new ArrayList<String>();
	static ArrayList<Integer>test2 = new ArrayList<Integer>();
	static ArrayList<Territory>spaces = new ArrayList<Territory>();
	static String name;

	public Territory(String n, String p, int a, int n2){
		nameOfSpace = n;
		playerInControl = p;
		armiesInTerritory = a;
		numOfSpace = n2;
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

	public int getArmiesInTerritory() {
		return armiesInTerritory;
	}

	public void setArmiesInTerritory(int armiesInTerritory) {
		this.armiesInTerritory = armiesInTerritory;
	}
	
	public int getNumOfSpace() {
		return numOfSpace;
	}

	public void setNumOfSpace(int numOfSpace) {
		this.numOfSpace = numOfSpace;
	}

	public static void makeSpaces(){
		test.add("A");
		test.add("B");
		test.add("C");
		test.add("D");
		test.add("E");
		
		test2.add(1);
		test2.add(2);
		test2.add(3);
		test2.add(4);
		test2.add(5);
		test2.add(6);
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 6; j++){
				
			name = test.get(i) + test2.get(j);
			Territory space = new Territory(name, "", 0, counter);
			spaces.add(space);
			counter++;
			}
		}
	}
}
