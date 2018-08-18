import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CookieClicker implements ActionListener{
	
	JButton button;
	JFrame frame;
	JLabel label;
	JPanel panel;
	
	Timer timer;
	int score;
	
	public void run() {
		timer = new Timer(1, this);
		frame = new JFrame();
		label = new JLabel(Integer.toString(score));
		panel = new JPanel();
		button = new JButton("Click me!");
		
		panel.add(label);
		panel.add(button);
		frame.add(panel);
		
		button.addActionListener((e)->{
			score++;
			label.setText(Integer.toString(score));
			
		});
		
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		timer.start();

	}
	
	public static void main(String[] args) {
		new CookieClicker().run();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		button.setSize(400,400);
	}
	
}
