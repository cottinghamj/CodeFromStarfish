package lesson1graphics;

import processing.core.PApplet;
import processing.core.PImage;


public class Lesson1Graphics extends PApplet {

	PImage img;  // Declare variable "a" of type PImage

	public void setup() {
	  size(640, 360);
	  // The image file must be in the data folder of the current sketch 
	  // to load successfully
	  img = loadImage("logo.png.PNG");  // Load the image into the program  
	}

	public void draw() {
	  // Displays the image at its actual size at point (0,0)
	  image(img, 0, 0);

	}
	
	public void circle(){
		fill(255,90, 0);
		ellipse(400, 400, 225, 225);
	}
	
	public void square(){
		fill(0, 255, 0);
		rect(100, 100, 300, 300);
	}
}
