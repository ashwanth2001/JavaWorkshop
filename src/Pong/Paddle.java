package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle {

	int x;
	int y;
	int width;
	int height;
	
	public Paddle(int x1, int y1, int width1, int height1) {
		x = x1;
		y = y1;
		width = width1;
		height = height1;
	}
	
	public void move(String s) {
		if(s.equals("up")) {
			y-=10;
		}
		if(s.equals("down")) {
			y+=10;
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
	}
}
