import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScribblePanel extends JPanel implements MouseListener, MouseMotionListener{
	int x, y, r=50;
	ScribblePanel(){
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	public void mouseDragged(MouseEvent e) {
		Graphics g = getGraphics();
		if(e.getModifiers()==InputEvent.BUTTON1_MASK) {
			g.setColor(Color.black);
			g.drawLine(x,  y,  e.getX(), e.getY());
			x = e.getX();
			y = e.getY();
		}
		else {
			g.setColor(getBackground());
			g.fillOval(e.getX()-r, e.getY()-r, 2*r, 2*r);
		}
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
