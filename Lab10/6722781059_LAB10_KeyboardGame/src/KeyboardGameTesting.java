import javax.swing.*;

public class KeyboardGameTesting extends JFrame{
	public static void main(String[] args) {
		JFrame frame = new JFrame("My KeyboardGame");
		frame.add(new KeyboardGame());
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
