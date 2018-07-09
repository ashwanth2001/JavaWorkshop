package Pong_Template;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	//Step 1: Create instance variables (integers) for the Ball's y location and diameter
	//The Ball's x integer has already been declared as an example
	//Feel free to ask any questions about what these represent in the game
	int x;
	
	
	
	//Step 2: Create 2 integer variables, dx and dy, to represent the direction the ball moves
	//dx represents how fast the ball moves in the x direction (horizontal)
	//dy represents how fast the ball moves in the y direction (vertical)
	
	
	
	//Step 3: Set the instance variables x, y, and direction created above to inputs of the constructor
	//When the Ball object is created, the variables that are put into the constructor
	
	public Ball(int x1 /*add more conditions here*/) { //This is the constructor
		x = x1;
		
		
		
		//Step 4: Set dx equal to 8 and set dy equal to 0
		//We can change these numbers later if the game is too fast or too slow
		
		
		
	}
	
	//Step 5: Create a public method called update with a void return type
	//The GamePanel class will call this method to move the ball
	//Include Step 6 in this method
	
	
		//Step 6: Add dx to x and add dy to y
		
		
	
	//Step 7: Create a public method called draw with a void return type
	//Make "Graphics g" and input of this method
	//This draw method will use the graphics to draw the ball
	//Include Steps 8 and 9 in this method
	
	
		//Step 8: Using the Graphics "setColor" method, set the color of the ball to "Color.RED"
		//We can change the color later if we want to
		
		
		//Step 9: Using the Graphics "fillOval" method, use the inputs "x, y, diameter, diameter"
		//We must use diameter as both the width and height as the requirement for the circle
		
		
	
	//Step 10: Create a public method with a void return type called "setRandomAngle"
	//This will be called by the GamePanel class to change the direction of the ball
	//Include Step 11 in this method
	
	
		//Step 11: Create an algorithm that sets dy to a random number between -8 and 8 (inclusive)
		//Hint: use the Math.random() method
		
		
	//Congratulations! You are all done with the Ball class
}
