/*Programmer: Kenny Hooper
Project Name: Table Prices
Date: 9/10/16
Version: 1.0
Description: Program gives price of a table when given what type of wood it is.
*/

import java.text.DecimalFormat;

public class Furniture {

    public static void main(String[] args) throws Exception {
        char Value1;//introduces variable to store each char
        DecimalFormat two = new DecimalFormat("0.00"); // Set decimal points to a limit of 2
        double priceMahogany = 310.0, pricePine = 100.0, priceOak = 225.0;
        System.out.println("Welcome to Hoopers Tables Price Giver. For pine enter 'P', 'O' for oak, and 'M' for mahogany");
        //asks user for what price they would like to know
        Value1 = (char) System.in.read();//sets selection

        if (Value1 == 'P')
        {
            System.out.println("A pine table is $" + two.format(pricePine));//prints out if Pine is selected
        }
        if (Value1 == 'O') {
            System.out.println("An oak table is $" + two.format(priceOak));//prints out if Oak is selected
        }
        if (Value1 == 'M') {
            System.out.println("A mahogany table is $" + two.format(priceMahogany));//prints out if Mahogany is selected
        }
    }

}
