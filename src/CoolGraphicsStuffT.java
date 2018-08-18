import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CoolGraphicsStuffT extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new CoolGraphicsStuffT(); 
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void paintComponent(Graphics g) {   
        g.setColor(new Color(255, 0, 0));
		g.fillOval(10, 10, 100, 100);
    }
	
}
