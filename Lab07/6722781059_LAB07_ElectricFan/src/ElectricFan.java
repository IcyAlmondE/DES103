import java.awt.*;
import javax.swing.*;

public class ElectricFan extends JPanel{
    ElectricFan(){}

    protected void paintComponent(Graphics g){
        g.setColor(Color.gray);
        g.fillOval(295, 95, 210, 210);

        g.setColor(Color.white);
        g.fillOval(300, 100, 200, 200);

        g.setColor(Color.orange);
        for(int i=0; i<5; i++){
            g.fillArc(310, 110, 180, 180, 72*i, 36);
        }

        g.setColor(Color.gray);
        g.fillRect(380, 300, 45, 150);

        g.setColor(Color.blue);
        int[] x = {350, 450, 500, 300};
        int[] y = {450, 450, 550, 550};
        g.fillPolygon(x, y, 4);

        for(int i=0; i<4; i++){
            g.setColor(Color.red);
            g.fillRoundRect(360+(i*20), 500, 17, 20, 20, 20);
            g.setColor(Color.white);
            g.drawString(""+i, 366+(i*20), 514);
        }
    }
}
