package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI {

    private JPanel panel1;

    private JTextField tfYear;
    private JButton btnCheckYear;

    private JOptionPane LeapYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

  public static void main(String[] args) {
//         LeapYearGUI app = new LeapYearGUI();
        JFrame leapFrame = new JFrame("Leap Year Checker");
        leapFrame.setContentPane(new LeapYearGUI().panel1);
        leapFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        leapFrame.pack();
        leapFrame.setVisible(true);
    }

}
