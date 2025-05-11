import javax.swing.*;

public class DrawingTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Drawing());
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
