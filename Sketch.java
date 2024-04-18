import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
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
	  
	// sample code, delete this stuff
  PImage grid = loadImage("grid.png");
  background(grid);
    PImage boing = loadImage("Boing_Ball.png");
    

    ellipse(circlex,circley,radius*2,radius*2);
    circlex = circlex + velx;
    circley = circley + vely; 
    if(circley > height-90) {
      vely = (vely = (-20));
      
    }
    else{
      vely = (vely +1 );
    }
    if(circlex > width - 75 || circlex < 0 + 75){
      velx = (velx*(-1));
    }
  }
  
  // define other methods down here.
}