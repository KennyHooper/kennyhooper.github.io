/*Programmer: Kenny Hooper
Project Name: Calculate Mortgage
Date: 10/06/16
Version: 1.0
Description: Program takes a loan amount between 100000 and 200000, length of loan greter than 0,
and interest rate thats not negative then plugs them into a formula and outputs how much a monthly payment is.
 */

import javax.swing.JOptionPane;

public class DriverMortage {

    public static void main(String[] args) {
        double X = 0, Y = 0;
        int Z = 0; // intializes varaibles to be used

        String getX, getY, getZ; // intializes variable for user input
        boolean testX = true, testY = true, testZ = true;
        while (testX) {
            getX = JOptionPane.showInputDialog("Enter a loan amount: ");
            X = Double.parseDouble(getX); //sets loan as a double
            if (X >= 100000.0 && X <= 200000) {
                testX = false;
            }
        } // gets the loan as a string

        while (testY) {
            getY = JOptionPane.showInputDialog("Enter a rate: "); // gets rate as a string
            Y = Double.parseDouble(getY); //sets rate as a double;
            if (Y >= 0) {
                testY = false;
            }
        }

        while (testZ) {
            getZ = JOptionPane.showInputDialog("Enter the number of years: "); // gets term as a string
            Z = Integer.parseInt(getZ); //sets term as int
            if (Z > 0) {
                testZ = false;
            }
        }

        Mortgage a = new Mortgage(X, Y, Z);
        a.print();
    }
}
