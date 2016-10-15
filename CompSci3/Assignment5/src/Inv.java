import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Inv {

    private String name;//Introduces name
    private int quantity;// creates quantity variable
    private double price;// creates price variable

    public Inv() {
    }//default constructor

    public Inv(String n, int quan, double pr) {
        name = n;
        quantity = quan;
        price = pr;

    }//3 argument construcor

    public void setName(String n) {
        name = n;
    }//sets name

    public void setQuantity(int quan) {
        quantity = quan;
    }//sets quantity

    public void setPrice(double pr) {
        price = pr;

    }//sets price

    public double calcTotal() {
        double total = quantity * price;
        return total;
    }// sets total

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        DecimalFormat two = new DecimalFormat("0.00");//Set decimal spaces for Total
        JOptionPane.showMessageDialog(null, "Name: " + name + "\nPirce: $" + price + "\nQuantity: " + quantity + "\nTotal: $" + calcTotal());// prints out results
    }
}
