import javax.swing.*;

public class ElectricFanTesting {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing Fan");
        frame.add(new ElectricFan());
        frame.setSize(800, 800);
        frame.setVisible(true);
    }
}
