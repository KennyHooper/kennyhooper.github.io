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
        outputTextArea.setText("Period\tInterest Paid\tBalance Paid\tBalance\nLoan #");
        outputTextArea.append("\t" + "Loan 1" + "\t\t\t" + "Loan 2" + "\t\t\t" + "Loan 3\n");
        
        double amount = 200000.0;
        int Years1 =  7; double YearlyRate1=.0575;// sets years and yearly rate
        int Years2 = 15; double YearlyRate2=.055;// sets years and yearly rate
        int Years3 = 30; double YearlyRate3=.0575;// sets years and yearly rate
        
       
        
        int LongestTerm = 0; //initializes a varible to hold longest term
        
        if (Years1 > Years2 && Years1 > Years3)
        {LongestTerm = Years1 * 12;}
        else if (Years2 > Years1 && Years2 > Years3)
        {LongestTerm = Years2 * 12;}
        else LongestTerm = Years3;
        //Figures out what loan is longest
        
        double Loan1[][] = new double[Years1*12][3]; 
        double Loan2[][] = new double[Years2*12][3]; 
        double Loan3[][] = new double[Years3*12][3]; 
        //Creates arrays to hold value
        
        Loan1[][] = Loan[][](amount, int Years1, double YearlyRate1);
        Loan2[][] = Loan[][](amount, int Years2, double YearlyRate3);
        Loan3[][] = Loan[][](amount, int Years3, double YearlyRate3);
        //Fills arrays with value via a method
        
            

        for (int i = 1; i <= LongestTerm; i++) {

            
            outputTextArea.append(i + "\t$" + two.format(Loan1[i - 1][0]) + "\t$" + two.format(Loan1[i - 1][1]) + "\t$" + two.format(Loan1[i - 1][0]));
            outputTextArea.append(i + "\t$" + two.format(Loan2[i - 1][0]) + "\t$" + two.format(Loan2[i - 1][1]) + "\t$" + two.format(Loan2[i - 1][0]));
            outputTextArea.append(i + "\t$" + two.format(Loan3[i - 1][0]) + "\t$" + two.format(Loan3[i - 1][1]) + "\t$" + two.format(Loan3[i - 1][0]));
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

    public static double Loan[][](double amount, int termInYears, double YearlyRate)

    
        
    {   int term = termInYears * 12; // set length of loan
        double rate = YearlyRate / 12; // set interest rate
        double monthlyPayment = amount * rate / (1.0 - Math.pow(rate + 1, -term));
        // sets values of mortage aspects

        double array[][] = new double[term][3];//creates empty array

        for (int i = 1; i <= term; i++) {
            array[i - 1][0] = amount * rate;//calculates interest paid to date
            array[i - 1][1] = monthlyPayment - array[i - 1][0]; //calculatest principal paid to date
            array[i - 1][2] = amount - array[i - 1][1]; // remaining balance
            // populates array with values
        }

        return array;//returns array
    }
;
}
