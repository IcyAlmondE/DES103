import javax.swing.*;

public class BMITest extends JFrame{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.add(new BMI());
        frame.setSize(600, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
