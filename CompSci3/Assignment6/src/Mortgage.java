
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Mortgage {

    private double loan;
    private double rate;
    private int term;

    public Mortgage() {
    }

    public Mortgage(double l, double r, int t) {
        loan = l;
        rate = r /1200.0;
        term = t * 12 ;
    }

    public double getLoan() {
        return loan;

    }

    public double getRate() {
        return rate;
    }

    public int getTerm() {
        return term;
    }

    public void setLoan(double l) {
        loan = l;
    }

    public void setRate(double r) {
        rate = r / 1200.0;
    }

    public void setTerm(int t) {
        term = t * 12;
    }

    public double calcPayment() {
        double monthlyPayment = loan * rate /  (1.0 - Math.pow(rate + 1, - term));
        return monthlyPayment;
        
    }

    public void print() {
        DecimalFormat two = new DecimalFormat("0.00");//Set decimal spaces for Total
        JOptionPane.showMessageDialog(null, "You would be pay $" + two.format(calcPayment()) + " per month with these specs." );
    }

}
