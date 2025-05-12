import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMI extends JPanel implements ActionListener {
    JPanel inputPanel = new JPanel();
    JPanel outputPanel = new JPanel();
    JTextField heightTF = new JTextField(10);
    JTextField weightTF = new JTextField(10);
    JButton calculateBT = new JButton("Calculate");
    String message = "Your BMI: ";
    String bmi = "";
    double height, weight;
    JLabel res = new JLabel(message);

    BMI(){
        inputPanel.setLayout(new GridLayout(4, 1));
        inputPanel.add(new JLabel("Height in cm:"));
        inputPanel.add(heightTF);
        inputPanel.add(new JLabel("Weight in kg:"));
        inputPanel.add(weightTF);

        outputPanel.setLayout(new GridLayout(2, 1));
        outputPanel.add(calculateBT);
        outputPanel.add(res);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.CENTER);
        add(outputPanel, BorderLayout.SOUTH);

        weightTF.addActionListener(this);
        heightTF.addActionListener(this);
        calculateBT.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        height = Double.parseDouble(heightTF.getText());
        weight = Double.parseDouble(weightTF.getText());
        bmi = "";
        bmi += calculateBMI(height, weight);
        res.setText(message + bmi);

    }

    double calculateBMI(double height, double weight){
        height /= 100;
        return weight / (height * height);
    }
}
