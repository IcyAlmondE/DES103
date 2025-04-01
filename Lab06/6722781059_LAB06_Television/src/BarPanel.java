import java.awt.*;
import javax.swing.*;
public class BarPanel extends Panel{
	JTextField text_chvol = new JTextField("Ch 35 Vol 45");
	ControlPanel panel_ctrl = new ControlPanel();
	
	BarPanel(){
		setLayout(new BorderLayout());
		add(text_chvol, BorderLayout.WEST);
		add(panel_ctrl, BorderLayout.CENTER);
	}
}
