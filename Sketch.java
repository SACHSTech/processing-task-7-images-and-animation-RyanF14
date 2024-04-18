import processing.core.PApplet;
import processing.core.PImage;
/**
 * Processing Task 7, animations, movement, images and collision detection
 * @author: Ryan Fellin
 * Sketch
 * A recreation of the classic Commodore-Amiga "Boing! Ball" demo, an image of a grid is imported and drawn in as the background while a circle bounces around the screen
 * This demo makes use of velocity to achieve the desired result of the illusion of gravity acting on the ball
 * CircleX represents the x-position of the circle, circley represents the y position
 * vely/velx represent the velocity of the circle in their respective directions
 * radius defines the radius of the circle
 */


public class Sketch extends PApplet {
	//define variables
  float circley = 0;
  float circlex = 380;
  float vely = 3;
  float velx = 3;
  float radius = 75;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(188);
    PImage grid = loadImage("grid.png");
    image(grid,0,0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	//Generate background image
  PImage grid = loadImage("grid.png");
  background(grid);
    //PImage boing = loadImage("Boing_Ball.png");
    
    //draw circle
    ellipse(circlex,circley,radius*2,radius*2);
    circlex = circlex + velx;
    circley = circley + vely; 
    //lower edge collision detection
    if(circley > height-90) {
      vely = (vely = (-20));
      
    }
    else{
      vely = (vely +1 );
    }
    //right/left collision detection
    if(circlex > width - 75 || circlex < 0 + 75){
      velx = (velx*(-1));
    }
  }
  
}