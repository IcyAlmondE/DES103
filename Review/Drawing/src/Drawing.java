import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Drawing extends JPanel implements MouseListener, MouseMotionListener {
    int x, y;

    Drawing(){
        setFocusable(true);

        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
    }

    public void mouseClicked(MouseEvent e){
        repaint();
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){
        x = e.getX();
        y = e.getY();
    }
    public void mouseReleased(MouseEvent e){}
    public void mouseDragged(MouseEvent e){
        Graphics g = getGraphics();
        g.setColor(Color.black);
        g.drawLine(x, y, e.getX(), e.getY());
        x = e.getX(); y = e.getY();
    }
    public void mouseMoved(MouseEvent e){}
}
