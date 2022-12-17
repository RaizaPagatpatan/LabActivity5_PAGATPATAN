package SimpleCalc;
//
import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.util.Objects;

public class SimpleCalcGUI extends  JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField lblResult;


    public SimpleCalcGUI() {
        btnCompute.addActionListener(e -> {

            try {
                int num1 = Integer.parseInt(tfNumber1.getText());
                int num2 = Integer.parseInt(tfNumber2.getText());

                if (Objects.equals(cbOperations.getSelectedItem(), "+")) {
                    int add = num1 + num2;
                    lblResult.setText(String.valueOf(add));
                } else if (Objects.equals(cbOperations.getSelectedItem(), "-")) {
                    int minus = num1 - num2;
                    lblResult.setText(String.valueOf(minus));
                } else if (Objects.equals(cbOperations.getSelectedItem(), "*")) {
                    int multi = num1 * num2;
                    lblResult.setText(String.valueOf(multi));
                } else if (Objects.equals(cbOperations.getSelectedItem(), "/")) {
                    int div = num1 / num2;
                    lblResult.setText(String.valueOf(div));
                }
            }   catch (NumberFormatException e1){
                JOptionPane.showMessageDialog(null, "Enter Numeric Value!", null, JOptionPane.ERROR_MESSAGE);
            }
                catch (ArithmeticException e2){
                JOptionPane.showMessageDialog(null, "Error", null, JOptionPane.ERROR_MESSAGE);
            }

            });
    }

    public static void main(String[] args) {
//       Simple calc main function :>
        JFrame calcFrame = new JFrame("Simple Calculator");
        calcFrame.setContentPane(new SimpleCalcGUI().panel1);
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcFrame.pack();
        calcFrame.setVisible(true);



    }
}
