package Pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements KeyListener, ActionListener{

	int repeat = 25;
	Timer t = new Timer(repeat, this);
	
	Paddle p1;
	Paddle p2;
	Ball b;
	
	boolean p1Up;
	boolean p1Down;
	boolean p2Up;
	boolean p2Down;
	
	boolean play;
	String winner;
	
	public GamePanel() {
		this.setSize(800, 600);
		
		p1 = new Paddle(100, 250, 10, 100);
		p2 = new Paddle(700, 250, 10, 100);
		b = new Ball(390, 290, 20);
		
		p1Up = false;
		p1Down = false;
		p2Up = false;
		p2Down = false;
		
		play = true;
		winner = "none";
		
		t.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.GRAY);
		g.drawLine(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight());
		
		p1.draw(g);
		p2.draw(g);
		b.draw(g);
		
		if(winner.equals("Player 1")) {
			g.setColor(Color.YELLOW);
			g.drawString("Player 1 wins!", 150, 100);
		}
		else if(winner.equals("Player 2")) {
			g.setColor(Color.YELLOW);
			g.drawString("Player 2 wins!", 550, 100);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		
		if(play) {
			b.update();
			movePaddles();
			checkEdges();
			checkCollision();
		}
	}
	
	private void movePaddles() {
		if(p1Up) {
			p1.move("up");
		}
		if(p1Down) {
			p1.move("down");
		}
		if(p2Up) {
			p2.move("up");
		}
		if(p2Down) {
			p2.move("down");
		}
	}
	
	private void checkEdges() {
		if(b.y<0||b.y+b.diameter>this.getHeight()) {
			b.dy*=-1;
		}
		
		if(b.x<0) {
			winner = "Player 2";
			play = false;
		}
		if(b.x+b.diameter>this.getWidth()) {
			winner = "Player 1";
			play = false;
		}
	}
	
	private void checkCollision() {
		if(b.x<p1.x+p1.width&&b.x>p1.x) {
			if(b.y<p1.y+p1.height&&b.y+b.diameter>p1.y) {
				b.dx*=-1;
				b.setRandomAngle();
			}
		}
		if(b.x+b.diameter<p2.x+p2.width&&b.x+b.diameter>p2.x) {
			if(b.y<p2.y+p2.height&&b.y+b.diameter>p2.y) {
				b.dx*=-1;
				b.setRandomAngle();
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_W) {
			p1Up = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			p1Down = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			p2Up = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			p2Down = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_W) {
			p1Up = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			p1Down = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			p2Up = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			p2Down = false;
		}
	}
}
