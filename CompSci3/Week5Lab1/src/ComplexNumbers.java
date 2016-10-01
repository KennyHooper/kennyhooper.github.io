
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
class complex {

    private double a, b; // holds a and b values

    public complex() {
    }

    public complex(double a1, double b1) {
        a = a1;
        b = b1;
    }

    public complex(double A1) {
        a = A1;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(Double ey) {
        a = ey;
    }

    public void setB(Double bee) {
        b = bee;
    }

    public complex add(double a1, double b1, double a2, double b2) {
        double ey = a1 + a2;
        double bee = b1 + b2;
        complex Added = new complex(ey, bee);
        return Added;
    }

    public complex sub(double a1, double b1, double a2, double b2) {

        double ey = a1 - a2;

        double bee = b1 - b2;
        complex Subbed = new complex(ey, bee);
        return Subbed;
    }

    public void printAdd(complex one) {
        JOptionPane.showMessageDialog(null, "The complex numbers added give us " + one.getA() + " + " + one.getB() + "i");

    }

    public void printSub(complex one) {
        JOptionPane.showMessageDialog(null, "The complex numbers difference give us " + one.getA() + " + " + one.getB() + "i");

    }
}

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
