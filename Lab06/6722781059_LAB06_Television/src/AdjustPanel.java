import java.awt.*;
import javax.swing.*;
public class AdjustPanel extends Panel {
	AdjustPanel(String text){
		JButton button_decrease = new JButton("<<");
		JButton button_text = new JButton(text);
		JButton button_increase = new JButton(">>");
		
		setLayout(new BorderLayout());
		add(button_decrease, BorderLayout.WEST);
		add(button_text, BorderLayout.CENTER);
		add(button_increase, BorderLayout.EAST);
	}
	
}
