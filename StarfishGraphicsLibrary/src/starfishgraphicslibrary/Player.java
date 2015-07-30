package starfishgraphicslibrary;
import processing.core.PApplet;

public class Player {

	// Variables and attributes
	public int health, defense;
	public int strength;
	public int speed, posX, posY;
	public String name;

	public int gravVal;

	// Graphic Specific Vars
	public PApplet p;
	public int r, g, b;


	// Depending on the shape of your player, your variables will be different
	// The default character is a circle

	//public int width, height;
	public int radius;
	public boolean moveDownVar;
	public boolean moveUpVar;
	public boolean moveLeftVar;
	public boolean moveRightVar;

	public boolean jumping;
	private int maxJumpAmount;

	public int gravity;

	public Obstacle[] obs;

	// Constructor
	public Player(int x, int y, String n, PApplet _p){
		health = 100;
		defense = 10;
		strength = 1000 * 9;
		speed = 10;
		posX = x;
		posY = y;
		name = n;

		//Setting up Graphics
		p = _p;
		r = 188;		// Making the player default to a color blue
		g = 46;
		b = 46;
		radius = 60;

		gravVal = 10;

		moveDownVar = false;
		moveUpVar = false;
		moveLeftVar = false;
		moveRightVar = false;

		jumping = false;
		maxJumpAmount = 100;// how many pixel high that you want them to jump
		gravity = 6; // how fast the player will fall
		
		int numObstacles = 3;

		obs = new Obstacle[numObstacles];
		obs = fillObs(numObstacles);

	}

	// methods
	//lol you are literally going to die by my hand while you sleep
	public boolean isAlive(){
		return health > 0;
	}

	public void draw(){
		p.fill(r,g,b);
		p.ellipse(posX, posY, radius, radius);
		drawObstacles();
		move();
	}

	public void gravity(){

	}

	public Obstacle[] fillObs(int n){
		Obstacle[] fillme = new Obstacle[n];
		for(int i = 0; i < n; i++){
			fillme[i] = new Obstacle(4 * 100, 4*100, 200, 200, p);
		}
		return fillme;
	}

	public void drawObstacles(){
		for(int i = 0; i < obs.length; i++){
			obs[i].draw();
		}
	}

	public void move(){
		colliding();
		if(moveDownVar){
			moveDown();
		}
		if(moveUpVar){
			moveUp();
		}
		if(moveLeftVar){
			moveLeft();
		}
		if(moveRightVar){
			moveRight();
		}
		
		if(posY + radius/2 < p.height){
			if(!jumping)
				posY += gravity;
		}else {
			jumping = false;
		}
		
		if(jumping){
			jump();
		}
	}
	// TEST METHOD: DO NOT USE. ONLY FOR DEMONSTRATION
	public void colliding(){

		if((posX + radius - obs[0].posX) == 0 && posY + radius > obs[0].posY && posY - radius < obs[0].posY + obs[0].height)
			moveRightVar = false;
		if(posX - radius == obs[0].posX + obs[0].width && posY + radius > obs[0].posY && posY - radius < obs[0].posY + obs[0].height)
			moveLeftVar = false;
		if(posY + radius == obs[0].posY && posX + radius > obs[0].posX && posX - radius < obs[0].posX + obs[0].width)
			moveDownVar = false;
		if(posY - radius == obs[0].posY + obs[0].height && posX + radius > obs[0].posX && posX - radius < obs[0].posX + obs[0].width)
			moveUpVar = false;

	}
	
	//This method is what you can use to check if you are colliding with an obstacle
	public boolean colliding(Obstacle o){

		// Check if colliding on right
		if((posX + radius - o.posX) == 0 && posY + radius > o.posY && posY - radius < o.posY + o.height)
			return true;
		// Check if colliding on left
		if(posX - radius == o.posX + o.width && posY + radius > o.posY && posY - radius < o.posY + o.height)
			return true;
		// Check if colliding on top
		if(posY + radius == o.posY && posX + radius > o.posX && posX - radius < o.posX + o.width)
			return true;
		// Check if colliding on bottom
		if(posY - radius == o.posY + o.height && posX + radius > o.posX && posX - radius < o.posX + o.width)
			return true;
		return false; // If you reach this point, that means that you are not colliding on either side of the obstacle

	}
	
	// This handy methods just lets you pass an array of objects into and see if you are colliding with anyone
	public boolean colliding(Obstacle[] o){
		
		for(int i = 0; i < o.length; i++){
			// Check if colliding on right
			if((posX + radius - o[i].posX) == 0 && posY + radius > o[i].posY && posY - radius < o[i].posY + o[i].height)
				return true;
			// Check if colliding on left
			if(posX - radius == o[i].posX + o[i].width && posY + radius > o[i].posY && posY - radius < o[i].posY + o[i].height)
				return true;
			// Check if colliding on top
			if(posY + radius == o[i].posY && posX + radius > o[i].posX && posX - radius < o[i].posX + o[i].width)
				return true;
			// Check if colliding on bottom
			if(posY - radius == o[i].posY + o[i].height && posX + radius > o[i].posX && posX - radius < o[i].posX + o[i].width)
				return true;
		}
		return false; // If you reach this point, that means that you are not colliding on either side of the obstacle

	}
	

	public void moveLeft(){
		posX -= speed;
	}

	public void moveRight(){
		posX += speed;
	}

	public void moveUp(){
		posY -= speed;
	}  

	public void moveDown(){
		posY += speed;
	}

	public void jump(){
		if(posY + radius/2 == p.height)
			jumping = true;
		if(posY >= p.height - maxJumpAmount && jumping){
			posY -= gravity * 10;
		}else{
			jumping = false;
		}
	}
	
	public void fall(){
		jumping = false;
	}


}

