import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScribblePanelTesting extends JFrame{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Scribble Panel");
		frame.add(new ScribblePanel());
		
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
