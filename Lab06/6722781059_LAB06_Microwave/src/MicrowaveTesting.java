import javax.swing.JFrame;

public class MicrowaveTesting {
	public static void main(String[] args) {
		Microwave myMicrowave = new Microwave("The Front View of a Microwave Oven");
		myMicrowave.setSize(550, 250);
		myMicrowave.setVisible(true);
		myMicrowave.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}