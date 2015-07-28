
public class Item {
	
	public String name;
	public int hltBoost;  // health
	public int strBoost;
	
	public Item(String n, int h, int s){
		name = n;
		hltBoost = h;
		strBoost = s;
	}
	
	public void boost(Player plyr){
		System.out.println("You just got "+ hltBoost + " health and " + strBoost + " strength");
		plyr.boostHealth(hltBoost);
		plyr.strength += strBoost;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}