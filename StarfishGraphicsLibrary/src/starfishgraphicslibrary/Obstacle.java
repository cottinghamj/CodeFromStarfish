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
}
