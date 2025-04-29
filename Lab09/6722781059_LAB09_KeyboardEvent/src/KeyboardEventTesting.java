import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyboardEventTesting extends JFrame{
	public static void main(String[] args) {
		JFrame frame = new JFrame("My Keyboard Event");
		frame.add(new KeyboardEvent());
		
		frame.setLocationRelativeTo(null);
		frame.setSize(800, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
