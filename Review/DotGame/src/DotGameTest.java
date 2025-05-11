import javax.swing.*;

public class DotGameTest extends JFrame{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.add(new DotGame());
        frame.setSize(700, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

}
