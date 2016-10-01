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

public class Interest2 {

    public static void main(String[] args) {

        DecimalFormat two = new DecimalFormat("0.00"); // Set decimal points to a limit of 2

//        double amount = 200000.0; // set loan amount
//        double term = 30 * 12; // set length of loan
//        double rate = .0575 / 12; // set interest rate
//        double monthlyPayment = amount * rate / (1.0 - Math.pow(rate + 1, -term));
// calculates monthly payment using formula
        JTextArea outputTextArea = new JTextArea();
        outputTextArea.setText("Period\tInterest Paid\tBalance Paid\tBalance\tInterest Paid\tBalance Paid\tBalance\tInterest Paid\tBalance Paid\tBalance\n");
        outputTextArea.append("Loan #\t" + "Loan 1" + "\t\t\t" + "Loan 2" + "\t\t\t" + "Loan 3\n");

        double amount1 = 200000.0;
        double amount2 = 200000.0;
        double amount3 = 200000.0;
        int Years1 = 7;
        double YearlyRate1 = .0575;// sets years and yearly rate
        int Years2 = 15;
        double YearlyRate2 = .055;// sets years and yearly rate
        int Years3 = 30;
        double YearlyRate3 = .0575;// sets years and yearly rate

        int LongestTerm = 0; //initializes a varible to hold longest term

        if (Years1 > Years2 && Years1 > Years3) {
            LongestTerm = Years1 * 12;
        } else if (Years2 > Years1 && Years2 > Years3) {
            LongestTerm = Years2 * 12;
        } else {
            LongestTerm = Years3;
        }
        //Figures out what loan is longest

        double Loan1[][][] = new double[3][Years1 * 12][3];
        double Loan2[][][] = new double[3][Years2 * 12][3];
        double Loan3[][][] = new double[3][Years3 * 12][3];
        //Creates arrays to hold value

        int term1 = Years1 * 12; // set length of loan
        double rate1 = YearlyRate1 / 12; // set interest rate
        double monthlyPayment1 = amount1 * rate1 / (1.0 - Math.pow(rate1 + 1, -term1));
        // sets values of mortage aspects

        for (int i = 1; i <= term1; i++) {

            double interestPaid1 = amount1 * rate1;
            Loan1[i - 1][0] = interestPaid1;//calculates interest paid to date
            double principalPaid1 = monthlyPayment1 - interestPaid1;
            Loan1[i - 1][1] = principalPaid1; //calculatest principal paid to date            
            amount1 = amount1 - principalPaid1; // remaining balance
            Loan1[i - 1][2] = amount1;
            // populates array with values
        }

        int term2 = Years2 * 12; // set length of loan
        double rate2 = YearlyRate2 / 12; // set interest rate
        double monthlyPayment2 = amount2 * rate2 / (1.0 - Math.pow(rate2 + 1, -term2));
        // sets values of mortage aspects

        for (int i = 1; i <= term2; i++) {
            Loan2[i - 1][0] = amount2 * rate2;//calculates interest paid to date
            Loan2[i - 1][1] = monthlyPayment2 - Loan2[i - 1][0]; //calculatest principal paid to date
            amount2 = amount2 - Loan2[i - 1][1]; // remaining balance
            Loan2[i - 1][2] = amount2;
            // populates array with values
        }

        int term3 = Years3 * 12; // set length of loan
        double rate3 = YearlyRate3 / 12; // set interest rate
        double monthlyPayment3 = amount3 * rate3 / (1.0 - Math.pow(rate3 + 1, -term3));
        // sets values of mortage aspects

        for (int i = 1; i <= term3; i++) {
            Loan3[i - 1][0] = amount3 * rate3;//calculates interest paid to date
            Loan3[i - 1][1] = monthlyPayment3 - Loan3[i - 1][0]; //calculatest principal paid to date
            amount3 = amount3 - Loan3[i - 1][1]; // remaining balance
            Loan3[i - 1][2] = amount3;
            // populates array with values
        }

//        Loan1[][] = Loan[][](amount, int Years1, double YearlyRate1);
//        Loan2[][] = Loan[][](amount, int Years2, double YearlyRate3);
//        Loan3[][] = Loan[][](amount, int Years3, double YearlyRate3);
//        //Fills arrays with value via a method
        for (int i = 1; i <= LongestTerm; i++) {

            outputTextArea.append(i + "\t$" + two.format(Loan1[i - 1][0]) + "\t$" + two.format(Loan1[i - 1][1]) + "\t$" + two.format(Loan1[i - 1][0]));
            outputTextArea.append(i + "\t$" + two.format(Loan2[i - 1][0]) + "\t$" + two.format(Loan2[i - 1][1]) + "\t$" + two.format(Loan2[i - 1][0]));
            outputTextArea.append(i + "\t$" + two.format(Loan3[i - 1][0]) + "\t$" + two.format(Loan3[i - 1][1]) + "\t$" + two.format(Loan3[i - 1][0]) + "\n");
            //adds loan details to dialog box 

            if (i % 15 == 0) {

                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }

                JOptionPane.showMessageDialog(null, outputTextArea, "Mortage Details", JOptionPane.INFORMATION_MESSAGE);
                //displays dialog box after 15 lines accumalate
            }

        }

    }

//    public static double Loan[][](double amount, int termInYears, double YearlyRate)
//
//    
//        
//    {   int term = termInYears * 12; // set length of loan
//        double rate = YearlyRate / 12; // set interest rate
//        double monthlyPayment = amount * rate / (1.0 - Math.pow(rate + 1, -term));
//        // sets values of mortage aspects
//
//        double array[][] = new double[term][3];//creates empty array
//
//        for (int i = 1; i <= term; i++) {
//            array[i - 1][0] = amount * rate;//calculates interest paid to date
//            array[i - 1][1] = monthlyPayment - array[i - 1][0]; //calculatest principal paid to date
//            array[i - 1][2] = amount - array[i - 1][1]; // remaining balance
//            // populates array with values
//        }
//
//        return array;//returns array
//    }
//;
}
