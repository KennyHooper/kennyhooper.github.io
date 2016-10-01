/*Programmer: Kenny Hooper
Project Name: Calculate Mortgage details 2 (Assignment #4)
Date: 9/24/16
Version: 1.0
Description: Program takes a loan amount, length of loan, and interest rate then plugs them into a formula and 
outputs how much a monthly payment is, interest paid, balance paid, and balance left
 */
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class interest2 {

    public static void main(String[] args) {

        DecimalFormat two = new DecimalFormat("0.00"); // Set decimal points to a limit of 2

        double amount[] = {200000.0, 200000.0, 200000.0}; // set loan amount
        int term[] = {7 * 12, 15 * 12, 30 * 12}; // set length of loan
        double rate[] = {.0535 / 12, .055 / 12, .0575 / 12}; // set interest rate
        double monthlyPayment[] = new double[3];
        double interestPaid[] = new double[3];
        double principalPaid[] = new double[3];

        for (int j = 0; j < 3; j++) {
          //  JTextArea outputTextArea = new JTextArea();//create new box to show each loan
          //  outputTextArea.setText("Period\tInterest Paid\tBalance Paid\tBalance\n");//Sets fields of each loan
            monthlyPayment[j] = (amount[j] * rate[j] / (1.0 - Math.pow(rate[j] + 1, -term[j])));//Find monthly payment
          //  outputTextArea.append("Note:" + "\t" + "For" + "\t" + "Loan" + "\t" + (j + 1) + "\n");

            for (int i = 0; i < term[j]; i++) {

                interestPaid[j] = amount[j] * rate[j];//calculates interest paid to date
                principalPaid[j] = monthlyPayment[j] - interestPaid[j]; //calculatest principal paid to date
                amount[j] = amount[j] - principalPaid[j]; // remaining balance

                System.out.println((i + 1) + "\t$" + two.format(interestPaid[j]) + "\t$" + two.format(principalPaid[j]) + "\t$" + two.format(amount[j]) + "\n");

                if ((i + 1) % 30 == 0) {

                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }

                  //  JOptionPane.showMessageDialog(null, outputTextArea, "Mortage Details", JOptionPane.INFORMATION_MESSAGE);
                    //displays dialog box after 30 lines accumalate
                }
            }
           // JOptionPane.showMessageDialog(null, outputTextArea, "Mortage Details", JOptionPane.INFORMATION_MESSAGE);
            //Shows remaining lines

        }
    }
}
