import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DotGame extends JPanel implements KeyListener{
    Random rand = new Random();
    int w = 600, h = 600, r = 10;
    int score = 0;
    int x = rand.nextInt(r, w - 2*r), y = rand.nextInt(r, h - 2*r);
    int posX = 30, posY = 300;
    int sp = rand.nextInt(20);
    boolean flag = false;

    DotGame(){
        setBackground(Color.BLACK);

        setFocusable(true);
        addKeyListener(this);
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(score==sp){
            g.setColor(Color.GREEN);
            g.fillOval(x - r, y - r, 3*r, 3*r);
            flag = true;
        }
        else{
            g.setColor(Color.YELLOW);
            g.fillOval(x - r, y - r, 2*r, 2*r);
        }
        g.setColor(Color.WHITE);
        g.setFont(new Font("Sanserif", Font.BOLD, 30));
        g.drawString("" + score, 20, 40);

        g.setColor(Color.ORANGE);
        g.fillOval(posX - 2*r, posY - 2*r, 4*r, 4*r);
    }

    public void keyPressed(KeyEvent e){
        if(e.getKeyChar()=='w') posY -= 10;
        else if(e.getKeyChar()=='a') posX -= 10;
        else if(e.getKeyChar()=='s') posY += 10;
        else if(e.getKeyChar()=='d') posX += 10;

        if(findDistance(posX, posY, x, y) < 2*r){
            x = rand.nextInt(r, w - 2*r);
            y = rand.nextInt(r, h - 2*r);
            if(flag){
                score+=10;
                sp = rand.nextInt(20) + score;
                flag = false;
            }
            else score++;
        }
        repaint();
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}

    double findDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
}
