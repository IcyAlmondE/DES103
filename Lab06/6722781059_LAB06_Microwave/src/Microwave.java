import java.awt.*;
import javax.swing.*;

public class Microwave extends JFrame {
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JButton button_door = new JButton("Food to be placed here");
	JTextField text_time = new JTextField("Microwave Time Display");
	JButton button_start = new JButton("Start");
	JButton button_stop = new JButton("Stop");
	JButton button_zero = new JButton("0");
	
	public Microwave(String title) {
		super(title);
		
		p1.setLayout(new GridLayout(4, 3));
		for(int i=0; i<9; i++) {
			p1.add(new JButton(""+(i+1)));
		}
		p1.add(button_stop);
		p1.add(button_zero);
		p1.add(button_start);
		
		p2.setLayout(new BorderLayout());
		p2.add(text_time, BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);
		
		setLayout(new BorderLayout());
		add(p2, BorderLayout.EAST);
		add(button_door, BorderLayout.CENTER);
	}
}