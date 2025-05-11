import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JButton[] buttons = new JButton[10];
    JButton[] opButtons = new JButton[] {new JButton("+"), new JButton("-"), new JButton("*"), new JButton("/")};
    JButton equal = new JButton("=");
    JButton ac = new JButton("AC");

    JPanel buttonPanel = new JPanel();
    JTextField tf = new JTextField(10);
    String message = "", input = "";
    double result = 0;
    int op = 0, ch = -1;

    Calculator(){
        tf.setText(message);
        for(int i=0; i<10; i++){
            buttons[i] = new JButton(""+i);
            buttons[i].addActionListener(this);
        }
        for(int i=0; i<4; i++) opButtons[i].addActionListener(this);

        buttonPanel.setLayout(new GridLayout(4, 4));
        for(int i=2; i>=0; i--){
            for(int j=0; j<3; j++) {
                buttonPanel.add(buttons[i*3 + j + 1]);
            }
            buttonPanel.add(opButtons[2-i]);
        }
        buttonPanel.add(ac);
        buttonPanel.add(buttons[0]);
        buttonPanel.add(equal);
        buttonPanel.add(opButtons[3]);

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.CENTER);
        add(tf, BorderLayout.NORTH);

        equal.addActionListener(this);
        ac.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        for(int i=0; i<10; i++){
            if(e.getSource() == buttons[i]) {
                input += i;
                message += i;
            }
        }
        if(e.getSource() == opButtons[0] || e.getSource() == opButtons[1] || e.getSource() == opButtons[2] || e.getSource() == opButtons[3]) {
            if(ch == -1){
                ch = 0;
                result = Double.parseDouble(input);
            }
            else{
                if(op == 1) result += Double.parseDouble(input);
                else if(op == 2) result -= Double.parseDouble(input);
                else if(op == 3) result *= Double.parseDouble(input);
                else if(op == 4) result /= Double.parseDouble(input);
                op = 0;
            }
            for(int i=0; i<4; i++){
                if(e.getSource() == opButtons[i]){
                    message += opButtons[i].getText();
                    op = i+1;
                    input = "";
                }
            }
        }

        if(e.getSource() == equal){
            if(op == 1) result += Double.parseDouble(input);
            else if(op == 2) result -= Double.parseDouble(input);
            else if(op == 3) result *= Double.parseDouble(input);
            else if(op == 4) result /= Double.parseDouble(input);
            message = "" + result;
            op = 0;
        }

        if(e.getSource() == ac){
            input = "";
            ch = -1;
            result = 0;
            message = "";
        }

        tf.setText(message);
        System.out.println(result);
    }
}
