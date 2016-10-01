/*Programmer: Kenny Hooper
Project Name: Calculate Mortgage details (Assignment #3)
Date: 9/17/16
Version: 1.0
Description: Program takes a loan amount, length of loan, and interest rate then plugs them into a formula and 
outputs how much a monthly payment is, interest paid, balance paid, and balance left
*/
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Interest {

    public static void main(String[] args) {

        DecimalFormat two = new DecimalFormat("0.00"); // Set decimal points to a limit of 2

        double amount = 200000.0; // set loan amount
        double term = 30 * 12; // set length of loan
        double rate = .0575 / 12; // set interest rate
        double monthlyPayment = amount * rate / (1.0 - Math.pow(rate + 1, -term));
// calculates monthly payment using formula

        JTextArea outputTextArea = new JTextArea();
        outputTextArea.setText("Period\tInterest Paid\tBalance Paid\tBalance\n");
        for (int i = 1; i <= term; i++) 
        {
            double interestPaid = amount * rate;//calculates interest paid to date
            double principalPaid = monthlyPayment - interestPaid; //calculatest principal paid to date
            amount = amount - principalPaid; // remaining balance

           outputTextArea.append(i + "\t$" + two.format(interestPaid) + "\t$" + two.format(principalPaid) + "\t$"  + two.format(amount) + "\n");
            

if (i % 15 == 0) {
    
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
                
                JOptionPane.showMessageDialog(null, outputTextArea, "Mortage Details", JOptionPane.INFORMATION_MESSAGE);
            }

            
        }

    }
}
