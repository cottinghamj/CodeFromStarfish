package starfishgraphicslibrary;

import processing.core.PApplet;


public class Obstacle {
	
	PApplet p;
	int width, height;
	int posX, posY;
	
	public Obstacle(int x, int y, int h, int w, PApplet _p){
		posX = x;
		posY = y;
		p = _p;
		
		height = h;
		width = w;
	}
	
	public void draw(){
		p.fill(100,123,00);
		p.rect(posX, posY, width, height);
		p.rect(posX, posY, 1,1);
	}
	
	
	// Just a little handy methods to generate a bunch of randomly placed enemies :D
	// Please pass in the total number of enemies you want to create
	public Obstacle[] genRandomEnemies(int numEnemies){
		Obstacle[] allEnemies = new Obstacle[numEnemies]; // just making an empty array so that we can fill it with Enemies
		
		// Keep in mind, if you are generating the game from left to right, we randomly choose a y position and increment the x by a value
		// Currently this code does not generate multiple enemies on the same line
		
		int x = 100;
		int y = (int) (Math.random() * p.height);
		int tightness = 20; // This is how close enemies will spawn to each other on the x axis
		
		for(int i = 0; i < numEnemies; i++){
			allEnemies[i] = new Obstacle(x, y, 10, 10, p);		//<------- Please change the declaration of this Obstacle to what ever the type of your enemy is
			x += tightness;
			y = (int) (Math.random() * p.height);
		}
		return allEnemies;
	}
}
