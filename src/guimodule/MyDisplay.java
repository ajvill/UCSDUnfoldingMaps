package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	
	public void setup()
	{
		size(400, 400);
		background(76, 236, 161);
	}
	
	public void draw()
	{
		fill(233, 226, 158);
		ellipse(200, 200, 300, 300); // the Face
		
		fill(0, 0, 0);
		ellipse(150, 150, 50, 50);  // left eye
		ellipse(250, 150, 50, 50);  // right eye
		
		ellipse(200, 200, 10, 10);  // the nose
	
		// Mouth
		arc(200, 250, 75, 75, 0, PI);
		
	}

}
