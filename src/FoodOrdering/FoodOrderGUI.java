package FoodOrdering;

import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

import java.text.DecimalFormat;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;

    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;


    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    private JButton btnOrder;

    public FoodOrderGUI() {
        btnOrder.addActionListener(e -> {


                DecimalFormat d = new DecimalFormat("0.00");

                float amount = 0;
                String msg = "";
                if (cPizza.isSelected()) {
                    amount += 100;
                }
                if (cBurger.isSelected()) {
                    amount += 80;
                }
                if (cFries.isSelected()) {
                    amount += 65;
                }
                if (cSoftDrinks.isSelected()) {
                    amount += 55;
                }
                if (cTea.isSelected()) {
                    amount += 50;
                }
                if (cSundae.isSelected()) {
                    amount += 40;
                }


                if (rbNone.isSelected()) {
                    JOptionPane.showMessageDialog(null, msg + "The total price is: " + d.format(amount));
                } else if (rb5.isSelected()) {
                    JOptionPane.showMessageDialog(null, msg + "The total price is: " + d.format(amount - (amount * .05)));
                } else if (rb10.isSelected()) {
                    JOptionPane.showMessageDialog(null, msg + "The total price is: " + d.format(amount - (amount * .10)));
                } else if (rb15.isSelected()) {
                    JOptionPane.showMessageDialog(null, msg + "The total price is: " + d.format(amount - (amount * .15)));
                }
        });
    }

    public static void main(String[] args) {
//        FoodOrder Main Function
        JFrame foodFrame = new JFrame("Food Ordering System");
        foodFrame.setContentPane(new FoodOrderGUI().panel1);
        foodFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        foodFrame.pack();
        foodFrame.setVisible(true);
    }


}
