package starfishgraphicslibrary;

import processing.core.PApplet;


public class StarfishGraphicsLibrary extends PApplet {
	
	Player p1;
	Obstacle o1;
	int timeToWait = 200, lastTime;

	public void setup() {
		size(700, 700);
		p1 = new Player(200, 200, "Starfish", this);
		o1 = new Obstacle(300, 300, 200, 100, this);
		lastTime = millis();
	}

	public void draw() {
		background(0,20,200);
		p1.draw();
		//o1.draw();
		p1.drawObstacles();
		
	}

	public void keyPressed(){
		if(key == 'd'){
			p1.moveRightVar = true;
		}else if(key == 's'){
			p1.moveDownVar = true;
		}else if(key == 'a'){
			p1.moveLeftVar = true;
		}else if(key == 'w'){
			p1.moveUpVar = true;
		}else if(key == ' '){
			p1.jump();
		}
	}
	
	public void keyReleased(){
		if(key == ' '){
			p1.fall();
		}else if(key == 'd'){
			p1.moveRightVar = false;
		}else if(key == 's'){
			p1.moveDownVar = false;
		}else if(key == 'a'){
			p1.moveLeftVar = false;
		}else if(key == 'w'){
			p1.moveUpVar = false;
		}
	}
	
	
	
	
}
