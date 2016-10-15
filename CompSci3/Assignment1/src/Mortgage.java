/*Programmer: Kenny Hooper
Project Name: Calculate Mortgage
Date: 9/02/16
Version: 1.0
Description: Program takes a loan amount, length of loan, and interest rate then plugs them into a formula and outputs how much a monthly payment is.
*/

import java.text.DecimalFormat; // Allow decimal spaces to be set

public class Mortgage {
  
  public static void main(String[] args){        
    
    DecimalFormat two = new DecimalFormat("0.00"); // Set decimal points to a limit of 2
    
double amount = 200000.0; // set loan amount
double years = 30 * 12; // set length of loan
double rate = .0575 / 12; // set interest rate
double monthlyPayment = amount * rate / (1.0 - Math.pow(rate + 1, - years)); 


// calculates monthly payment using formula
  
    System.out.println("The monthly payment is  $" + two.format(monthlyPayment));
// Displays the monthly payment amount
        
  }
}

