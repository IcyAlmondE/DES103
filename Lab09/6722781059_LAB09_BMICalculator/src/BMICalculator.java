import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMICalculator extends JPanel{
	JPanel userInfo = new JPanel();
	JPanel heightWeight = new JPanel();
	JPanel result = new JPanel();
	JTextField height = new JTextField();
	JTextField weight = new JTextField();
	
	JButton calc = new JButton("Compute BMI");
	JLabel res = new JLabel("BMI = ");
	
	BMICalculator(){
		setLayout(new GridLayout(3, 1));
		userInfo.add(new JLabel("Enter your information"));
		userInfo.setLayout(new GridLayout(1, 1));
		
		heightWeight.setLayout(new GridLayout(2, 2));
		heightWeight.add(new JLabel("Your height (cm):"));
		heightWeight.add(height);
		heightWeight.add(new JLabel("Your weight (kg):"));
		heightWeight.add(weight);
		
		result.setLayout(new GridLayout(2, 1));
		result.add(calc);
		result.add(res);
		
		add(userInfo);
		add(heightWeight);
		add(result);
		
		calc.addActionListener(new ActionInterpretor());
	}
	
	class ActionInterpretor implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double h = Double.parseDouble(height.getText())/100;
			double w = Double.parseDouble(weight.getText());
			res.setText("BMI = " + (w/(h*h)));
		}
	}
	
}
