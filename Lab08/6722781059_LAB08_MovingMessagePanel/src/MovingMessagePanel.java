import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MovingMessagePanel extends JPanel implements ActionListener, ItemListener, MouseMotionListener{
	JFrame frame = new JFrame("My Moving Message Panel");
	
	JPanel mPanel = new JPanel();
	JLabel mLabel = new JLabel("Message to be displayed");
	JTextField tf = new JTextField(40);
	
	JPanel bgPanel = new JPanel();
	JLabel bgLabel = new JLabel("BackgroundColor");
	JRadioButton wButton = new JRadioButton("white");
	JRadioButton bButton = new JRadioButton("black");
	
	JRadioButton moB = new JRadioButton("Use Mouse");
	
	JPanel dPanel = new JPanel();
	JButton leftB = new JButton("Left");
	JButton rightB = new JButton("Right");
	JButton upB = new JButton("Up");
	JButton downB = new JButton("Down");
	
	JPanel cenPanel = new JPanel();
	
	MovingMessagePanel(){
		frame.setLayout(new BorderLayout());
		frame.setSize(800, 300);
		frame.setVisible(true);
		frame.add(this, BorderLayout.CENTER);
		frame.add(mPanel, BorderLayout.NORTH);
		frame.add(bgPanel, BorderLayout.WEST);
		frame.add(moB, BorderLayout.EAST);
		frame.add(dPanel, BorderLayout.SOUTH);
		
		mPanel.add(mLabel);
		mPanel.add(tf);
		tf.addActionListener(this);
		
		bgPanel.setLayout(new GridLayout(3, 1));
		bgPanel.add(bgLabel);
		bgPanel.add(wButton);
		wButton.addItemListener(this);
		bgPanel.add(bButton);
		bButton.addItemListener(this);
		
		ButtonGroup group = new ButtonGroup();
			group.add(wButton);
			group.add(bButton);
		
		dPanel.add(leftB);
		leftB.addActionListener(this);
		dPanel.add(rightB);
		rightB.addActionListener(this);
		dPanel.add(upB);
		upB.addActionListener(this);
		dPanel.add(downB);
		downB.addActionListener(this);
		
		this.addMouseMotionListener(this);
	}
	
	int x = 0, y = 100;
	Color textcolor;
	String message = "";
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font myfont = new Font("SansSerif", Font.BOLD, 32);
		g.setFont(myfont);
		g.setColor(textcolor);
		g.drawString(message, x, y);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tf) {
			message = e.getActionCommand();
		}
		
		if(e.getSource()==leftB) {
			x -= 10;
		}
		else if(e.getSource()==rightB) {
			x += 10;
		}
		else if(e.getSource()==upB) {
			y -= 10;
		}
		else if(e.getSource()==downB) {
			y += 10;
		}
		
		repaint();
	}
	
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==wButton){
			setBackground(Color.WHITE);
			textcolor = Color.BLACK;
		}
		else if (e.getSource()==bButton) {
			setBackground(Color.BLACK);
			textcolor = Color.PINK;
		}
		
		repaint();
	}
	
	public void mouseDragged(MouseEvent e) {
		if(moB.isSelected()){
			x = e.getX();
			y = e.getY();
			repaint();
		}
		
	}
	
	public void mouseMoved(MouseEvent e) {
		
	}
}
