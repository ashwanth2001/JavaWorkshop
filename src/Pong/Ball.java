package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	int x;
	int y;
	int diameter;
	int dx;
	int dy;
	
	public Ball(int x1, int y1, int diameter1) {
		x = x1;
		y = y1;
		diameter = diameter1;
		dx = 8;
		setRandomAngle();
	}
	
	public void update() {
		x+=dx;
		y+=dy;
	}
	
	public void setRandomAngle() {
		dy = (int)(Math.random()*16)-8;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x, y, diameter, diameter);
	}
}
