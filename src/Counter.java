import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Counter implements ActionListener{
	int time;
	
	public void run() throws InterruptedException {
		
		Timer t = new Timer(1,this);
		time = 0;
		t.start();
		Thread.sleep(Integer.MAX_VALUE);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Counter counter_T = new Counter();
		counter_T.run();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		time++;
		System.out.println("Time: " + (double)time/1000);
	}

	

}
