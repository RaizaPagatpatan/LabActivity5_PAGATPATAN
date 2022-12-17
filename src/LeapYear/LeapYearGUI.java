package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;

public class LeapYearGUI extends JFrame {

    private JPanel panel1;

    private JTextField tfYear;
    private JButton btnCheckYear;

    private JOptionPane LeapYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//            JOptionPane.showMessageDialog();


                try{
                    int year = Integer.parseInt(tfYear.getText());

                    GregorianCalendar calendar = new GregorianCalendar();

                    if (calendar.isLeapYear(year))
                    {
                        JOptionPane.showMessageDialog(null, "Leap Year");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Not a Leap Year");
                    }
                } catch (NumberFormatException leap){
                    JOptionPane.showMessageDialog(null, "Enter Numeric Value!", null, JOptionPane.ERROR_MESSAGE);
                }

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
