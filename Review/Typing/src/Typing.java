import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Typing extends JPanel implements KeyListener, ActionListener {
    Random rand = new Random();
    char displayChar = 'A', typedChar = '?';
    int score;
    Timer timer = new Timer(1000, this);

    Typing(){
        timer.start();
        setFocusable(true);
        addKeyListener(this);
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setFont(new Font("Sanserif", Font.BOLD, 30));
        g.setColor(Color.BLACK);
        g.drawString("Type: ", 50, 50);
        g.drawString("" + displayChar, 170, 50);
        g.drawString("You typed: ", 50, 100);
        g.drawString("Score: ", 50, 150);
        g.drawString("" + score, 170, 150);
        g.setColor(Color.BLUE);
        g.drawString("" + typedChar, 220, 100);
    }

    public void keyPressed(KeyEvent e){

    }
    public void keyReleased(KeyEvent e){

    }
    public void keyTyped(KeyEvent e){
        typedChar = e.getKeyChar();
        if(typedChar>90) typedChar -= 32;
        if(typedChar == displayChar) score++;
        repaint();
    }
    public void actionPerformed(ActionEvent e){
        displayChar = (char)(rand.nextInt(26) + 65);
        repaint();
    }
}
