/*Programmer: Kenny Hooper
Project Name: Table Prices Part 2
Date: 9/10/16
Version: 1.0
Description: Program gives price of a table when given what type of wood and its size.
 */

import java.text.DecimalFormat;

public class FurnitureSizes {

    public static void main(String[] args) throws Exception {
        char Value1, Value2;//introduces variable to store each char
        DecimalFormat two = new DecimalFormat("0.00"); // Set decimal points to a limit of 2
        double priceMahogany = 310.0, pricePine = 100.0, priceOak = 225.0;//sets prices of table
        System.out.println("Welcome to Hoopers Tables Price Giver. For pine enter 'P', 'O' for oak, and 'M' for mahogany."
                + "\nIf you would like a large table type 'L' next to your selection ");
        //asks user for what price they would like to know
        Value1 = (char) System.in.read();//sets table selection      
        Value2 = (char) System.in.read();//sets size selection
        if (Value1 == 'P')//runs if user selects Pine 
        {
            if (Value2 == 'L') {
                pricePine += 35;//adds 35 dollars if large wanted
            }
            System.out.println("A pine table is $" + two.format(pricePine));//prints out if Pine is selected
        }
        if (Value1 == 'O')//runs if user selects Oak 
        {
            if (Value2 == 'L') {
                priceOak += 35;//adds 35 dollars if large wanted
            }
            System.out.println("An oak table is $" + two.format(priceOak));//prints out if Oak is selected
        }
        if (Value1 == 'M') //runs if user selects Mahogany 
        {
            if (Value2 == 'L') {
                priceMahogany += 35;//adds 35 dollars if large wanted
            }
            System.out.println("A mahogany table is $" + two.format(priceMahogany));//prints out if Mahogany is selected
        }
    }

}
