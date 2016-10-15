
import javax.swing.JOptionPane;

public class complex {

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
