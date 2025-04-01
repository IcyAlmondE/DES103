import java.awt.*;
import javax.swing.*;
public class ControlPanel extends Panel{
	JPanel panel_power = new JPanel();
	AdjustPanel panel_ch = new AdjustPanel("Ch");
	AdjustPanel panel_vol = new AdjustPanel("Vol");
	
	ControlPanel(){
		panel_power.setLayout(new FlowLayout());
		panel_power.add(new JButton("On/Off"));
		
		setLayout(new GridLayout(1, 3));
		add(panel_ch);
		add(panel_vol);
		add(panel_power);
	}
}
