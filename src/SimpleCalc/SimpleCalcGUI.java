package SimpleCalc;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JLabel lblResult;


    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());

            }
        });
    }

    public static void main(String[] args) {
//       Simple calc main function :>
        JFrame leapFrame = new JFrame("Simple Calculator");
        leapFrame.setContentPane(new SimpleCalcGUI().panel1);
        leapFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        leapFrame.pack();
        leapFrame.setVisible(true);


    }
}
