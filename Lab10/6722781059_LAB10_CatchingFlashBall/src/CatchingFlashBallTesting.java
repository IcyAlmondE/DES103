import javax.swing.*;

public class CatchingFlashBallTesting extends JFrame{
	public static void main(String[] args) {
		JFrame frame = new JFrame("My Catching FlashBall");
		frame.add(new CatchingFlashBall());
		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
