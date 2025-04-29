import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyboardEvent extends JPanel implements KeyListener{
	String message = "";
	KeyboardEvent(){
		this.addKeyListener(this);
		this.setFocusable(true);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("SansSerif", Font.BOLD, 50));
		g.drawString(message, 100, 100);
	}
	
	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar()==KeyEvent.VK_BACK_SPACE) {
			if(message.length()>0) {
				message = message.substring(0, message.length()-1);
			}
		}
		else message += e.getKeyChar();
		repaint();
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
