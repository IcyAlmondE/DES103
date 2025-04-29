import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMICalculatorTesting extends JFrame{
	public static void main(String[] args) {
		JFrame frame = new JFrame("My BMI Calculator");
		frame.add(new BMICalculator());
		
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
