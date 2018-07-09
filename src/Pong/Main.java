package Pong;

import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	JFrame frame;
	JPanel panel;
	final int width = 800;
	final int height = 600;
	
	public Main() {
		frame = new JFrame();
		panel = new GamePanel();
		frame.add(panel);
		frame.addKeyListener((KeyListener) panel);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.setup();
	}
	
	private void setup() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setLocation(0,0);
		frame.setVisible(true);
	}
}
