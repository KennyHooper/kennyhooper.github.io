/*Programmer: Kenny Hooper
Project Name: Inventory (Assignment #5)
Date: 10/1/16
Version: 1.0
Description: Program takes a name, quantity, price into class instances and prints the results with a total.
 */

public class IvvDriver {

    public static void main(String[] args) {

        Inv a = new Inv("Jordans", 2, 199.99);
        a.print();

        Inv b = new Inv("Kobe", 1, 129.99);
        b.print();
        b.setQuantity(3);
        b.print();

    }
}