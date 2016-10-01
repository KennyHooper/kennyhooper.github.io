
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kenny
 */
class Inv {

    private String name;
    private int quantity;
    private double price;
    private double total;

    public Inv() {
    }

    public Inv(String n, int quan, double pr) {
        name = n;
        quantity = quan;
        price = pr;

    }

    public void setName(String n) {
        name = n;
    }

    public void setQuantity(int quan) {
        quantity = quan;
    }

    public void setPrice(double pr) {
        price = pr;

    }

    public void setTotal() {
        total = quantity * price;
    }

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
        DecimalFormat two = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "Name: " + name + "\nPirce: $" + price + "\nQuantity " + quantity + "\nTotal: $" + total);
    }

}

public class IvvDriver {

    public static void main(String[] args) {

        Inv a = new Inv("Jordans", 2, 199.99);
        a.setTotal();
        Inv b = new Inv();
        b.setName("Kobe");
        b.setQuantity(3);
        b.setPrice(129.99);
        b.setTotal();

        a.print();
        b.print();

    }

}
