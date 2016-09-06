

/*Programmer: Kenny Hooper
Project Name: Three Methods
Date: 9/03/16
Version: 1.0
Description: Program takes 3 numbers then it finds thier sum, average, and product
*/

import javax.swing.JOptionPane; // to use dialog windows
public class Operation {
    public static void main(String[] args){        
    
    int X,Y,Z,sum,product; // intializes varaibles to be used
    String getX, getY, getZ ; // intializes variable for user input
    getX = JOptionPane.showInputDialog("Enter 1st number: "); // gets first  integer as a string
    getY = JOptionPane.showInputDialog("Enter 2nd number: "); // gets second integer as a string
    getZ = JOptionPane.showInputDialog("Enter 3rd number: "); // gets third  integer as a string
    
    X = Integer.parseInt(getX); //sets 1st value as int
    Y = Integer.parseInt(getY); //sets 2nd value as int
    Z = Integer.parseInt(getZ); //sets 3rd value as int
    
    sum = X +  Y + Z; // finds sum
    product = X * Y * Z; // finds product
    double average = (double) (X + Y + Z)/3;//finds average using typecasting incase average is a non integer
    
    JOptionPane.showMessageDialog(null, "The sum of the 3 numbers is " + sum);// displays sum
    JOptionPane.showMessageDialog(null, "The product of the 3 numbers is " + product); //displays product
    JOptionPane.showMessageDialog(null, "The average of the 3 numbers is " + average);//displays average
    
    System.exit( 0 );        
  }
}

