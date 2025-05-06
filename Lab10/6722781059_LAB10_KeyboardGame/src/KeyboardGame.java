import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class KeyboardGame extends JPanel implements ActionListener, KeyListener{
	String letter = "Letter: ", typed = "You Typed ", scoreLabel = "Your Score = ";
	char displayedChar = 'A', response = '?';
	int score = 0;
	Timer timer = new Timer(1000, this);
	
	KeyboardGame(){
		timer.start();
		setFocusable(true);
		addKeyListener(this);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("Sansserif", Font.BOLD, 40));
		g.drawString(letter + displayedChar, 75, 75);
		g.drawString(typed, 75, 150);
		g.setColor(Color.BLUE);
		g.drawString("" + response, 300, 150);
		g.setColor(Color.BLACK);
		g.drawString(scoreLabel + score, 75, 225);
	}
	
	char getRandomChar() {
		Random random = new Random();
		return (char)(65+random.nextInt(26));
	}
	
	public void actionPerformed(ActionEvent e) {
		displayedChar = getRandomChar();
		repaint();
	}

	public void keyTyped(KeyEvent e) {
		response = e.getKeyChar();
		if(response==displayedChar) score++;
		repaint();
	}

	public void keyPressed(KeyEvent e) {

	}

	public void keyReleased(KeyEvent e) {

	}
	
	
}
