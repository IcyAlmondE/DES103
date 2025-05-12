import javax.swing.*;

public class TypingTest extends JFrame{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.add(new Typing());
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
