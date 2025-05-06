import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class CatchingFlashBall extends JPanel{
	int xCenter = 100, yCenter = 100, r = 10;
	Timer timer = new Timer(1000, new TimerListener());
	
	CatchingFlashBall(){
		timer.start();
		addMouseListener(new Catcher());
		this.setBackground(Color.BLACK);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.ORANGE);
		g.fillOval(xCenter-r, yCenter-r, 2*r, 2*r);
	}
	
	
	
	class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Random random = new Random();
			xCenter = random.nextInt(getWidth()-r);
			yCenter = random.nextInt(getHeight()-r);
			repaint();
		}
	}
	
	class Catcher implements MouseListener{
		double calculateDistance(int x1, int y1, int x2, int y2) {
			return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		}
		public void mouseClicked(MouseEvent e) {
			
		}

		public void mousePressed(MouseEvent e) {
			int x = e.getX(), y = e.getY();
			if(calculateDistance(x, y, xCenter, yCenter)<=r) {
				timer.stop();
			}
		}

		public void mouseReleased(MouseEvent e) {

		}

		public void mouseEntered(MouseEvent e) {

		}

		public void mouseExited(MouseEvent e) {

		}
		
	}
}
