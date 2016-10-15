
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kenny_hooper3310
 */


public class ComplexNumbers {

    public static void main(String[] args) {

        String input;
        double a1;
        double b1;
        double a2;
        double b2;
        input = JOptionPane.showInputDialog("Please enter your first a: ");
        a1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Please enter your first b: ");
        b1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Please enter your second a: ");
        a2 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Please enter your second b: ");
        b2 = Double.parseDouble(input);

        complex first = new complex();
        first.setA(a1);
        first.setB(b1);

        complex second = new complex(a2, b2);

        complex combined = new complex();
        complex difference = new complex();
        combined = combined.add(first.getA(), first.getB(), second.getA(), second.getB());
        difference = combined.sub(first.getA(), first.getB(), second.getA(), second.getB());

        combined.printAdd(combined);
        difference.printSub(difference);

    }
}
