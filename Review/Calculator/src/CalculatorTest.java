import javax.swing.*;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setTitle("Calculator");
        calc.setVisible(true);
        calc.setSize(400, 300);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setLocationRelativeTo(null);
    }
}
