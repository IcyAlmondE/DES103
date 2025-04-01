import javax.swing.JFrame;

public class TelevisionTesting {
	public static void main(String[] args) {
		Television myTelevision = new Television("My Television");
		myTelevision.setSize(600, 400);
		myTelevision.setVisible(true);
		myTelevision.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}