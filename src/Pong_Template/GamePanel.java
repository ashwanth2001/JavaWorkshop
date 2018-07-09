package Pong_Template;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

//Step 1: Extend JPanel - this will make GamePanel inherit all of JPanel's methods
//We can now treat this class as a JPanel which will be really useful

//Step 2: Implement the KeyListener and ActionListener interfaces
//The KeyListener interface will allow the program to register pressing keys
//The ActionListener will give the program the ActionPerformed method which can be used to run the game

public class GamePanel {

	//Step 3: Create and integer variable called repeat and set it to 25
	//Do NOT instantiate any of the following variables when created
	
	
	//This will be used in the Timer instantiation - the game will update every 25 milliseconds
	//uncomment the next line to create a Timer
	
	//Timer t = new Timer(repeat, this);
	
	//Step 4: Create 2 Paddles called "p1" and "p2" and a ball called "b"
	
	
	
	
	//Step 5: Create 4 boolean variables: "p1Up" "p1Down" "p2Up" "p2Down"
	//These will be used to keep track of paddle movement
	
	
	
	
	
	//Step 6: Create a boolean "play" - this will indicate whether the game should run or not
	//Also create a String "winner"
	
	
	
	public GamePanel() { //This is the constructor
		//Step 7: Uncomment the next line to set the size of the Panel
		
		//this.setSize(800, 600);
		
		//Step 8: Instantiate the Paddles and the Ball that you created earlier
		//Remember that you must fulfill all the requirements of the constructor that you created
		
		
		
		
		//Step 9: Set all 4 boolean variables for paddle movement to false
		
		
		
		
		
		//Step 10: Set "play" to true (so the game starts)
		//Set "winner" to "none" (The game just started)
		
		
		
		//Step 11: Start the Timer with the Timer's "start" method
		
		
	}
	
	//Step 12: Create a public method "paint" with a void return type and an input of "Graphics g"
	//Include steps 13, 14, and 15 in this method
	
	
		//Step 13: Using the Graphics "setColor" method to change the color to "Color.BLACK"
		
		
		//Use the Graphics "fillRect" method with inputs of "0, 0, this.getWidth(), this.getHeight()"
		//This will draw a black background in the game
		
		
		//Change the color to "Color.GRAY"
		
		
		//Use the Graphics "drawLine" method with inputs of "this.getWidth()/2, 0, this.getWidth()/2, this.getHeight()"
		//This will draw a light gray line through the center of the game screen
		
		
		//Step 14: Call the draw methods from the Paddles and the Ball with an input of "g"
		//"g" was the input that you used in the paint method and will transfer over into the draw methods
		
		
		
		
		//Step 15: If the String winner equals "Player 1"...
		//Set the Color to Color.YELLOW
		//Use the Graphics "drawString" method with inputs of ""Player 1 wins!", 150, 100"
		//This draws "Player 1 wins!" on the screen when player 1 wins
		
		
		
		
		
		//If the String winner equals "Player 2"...
		//Set the Color to Color.YELLOW
		//Use the Graphics "drawString" method with inputs of ""Player 2 wins!", 550, 100"
		//This draws "Player 2 wins!" on the screen when player 2 wins
		
		
		
		
		
	
	
	//Step 16: Create a private method called "movePaddles" with a void return type
	//This will work in synchrony with the KeyListener methods to move the paddles
	//Include Step 17 in this method
	
	
		//Step 17: Using if statements...
		//If p1Up is true, then move the first paddle up using the Paddle's move method
		//If p1Down is true, then move the first paddle down
		//If p2Up is true, then move the second paddle up
		//If p2Down is true, then move the second paddle down
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	//Step 18: Create a private method called "checkEdges" with a void return type
	//This will be used to bounce the ball off of the walls and determine which player wins
	//Include Steps 19 and 20 in this method
	
	
		//Step 19: Use if statement to find out if the ball hit the top of bottom
		//If the ball hits the top or bottom, multiply the balls "dy" variable by -1
		
		
		
		
		//Step 20: Use if statements to find out whether the ball hit the left or right of the screen
		//If the ball hit the left side of the screen, then set "play" to false and "winner" to "Player 2"
		//If the ball hit the right side of the screen, then set "play" to false and "winner" to "Player 1"
		
		
		
		
		
		
		
		
		
	
	
	//Step 21: Create a private method called "checkCollsion" with a void return type
	//This will be used to check for when the ball hits the paddle and respond accordingly
	//Include Steps 22 and 23 in this method
	
	
		//Step 22: 
		
		
		//Step 23: 
		
		
	
	
	//Step 24: 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
