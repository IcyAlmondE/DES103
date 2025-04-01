import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class Television extends JFrame {
	BarPanel panel_bar = new BarPanel();
	JButton button_screen = new JButton();
	
	public Television(String title) {
		super(title);
		
		setLayout(new BorderLayout());
		add(panel_bar, BorderLayout.SOUTH);
		add(button_screen, BorderLayout.CENTER);
	}
}