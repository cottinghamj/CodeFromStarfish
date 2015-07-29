
public class Player {

	// Variable - Attributes
	public int health, strength, posX, posY;
	public String name;
	
	public int obliterateNum;
	
	// Constructor - build the player object
	public Player(String n){
		health = 100;
		strength = 5;
		posX = 0;
		posY = 0;
		name = n;
		
		obliterateNum = 1;
	}
	
	
	// Methods - define player action
	public void boostHealth(int value){
		health += value;
		if(health > 100){
			health = 100;
		}
	}
	
	public boolean isAlive(){
		return health > 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("Bob");
		
		System.out.println(p1.name + ", You came across an item. +10 health!");
		p1.boostHealth(100);
		System.out.println("Your health is now " + p1.health);
		System.out.println(p1.strength);
		
		Item i1 = new Item("sword", 0, 10);
		i1.boost(p1);
		System.out.println(p1.strength);
		
		Poison i2 = new Poison();
		System.out.println("You came across Poison!");
		i2.boost(p1);
		System.out.println(p1.health);
		
		System.out.println(p1.isAlive());
		
		// Instant kill the player
		System.out.println("You stepped on a snake!");
		p1.health  = p1.health - p1.health;
		
		System.out.println(p1.isAlive());
		System.out.println("You are dead!");
		clearscreen();
		System.out.println("You are a clear screen");
		
		p1.health += 100;
		Enemy e1 = new Enemy("qoB");
		
		Shirt s1 = new Shirt();
		s1.boost(p1);
		
		
		//e1.fight(p1);
		
		// make empty array
		Enemy[] enemyArray = new Enemy[5]; // Array holds 5 enemies
		
		// fills the enemy array
		for(int i = 0; i < enemyArray.length; i++){
			enemyArray[i] = new Enemy("qoB"+i);
		}
		
		// fight every single enemy in this array
		for(int i = 0; i < enemyArray.length; i++){
			enemyArray[i].fight(p1);
			p1.obliterateNum += 5;
		}
		
		
		
	
		
		
	}
	
	public static void clearscreen(){
		for(int i = 0; i < 36; i++){
			System.out.println();
		}
	}
	
	
	

}
