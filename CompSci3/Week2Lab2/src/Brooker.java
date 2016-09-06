/*Programmer: Kenny Hooper
Project Name: Stocks
Date: 9/03/16
Version: 1.0
Description: Given the number of shares and price of a share, calculates price before and after commission
along with comission itself
 */

import javax.swing.JOptionPane; // to use dialog windows
import java.text.DecimalFormat; // Allow decimal spaces to be se

public class Brooker {

    public static void main(String[] args) {

        int userShares= 2000; // number of shares bought
        double userCostOfShare = 19.63; // cost of each share
        transaction(userShares,userCostOfShare); // passes shares and thier cost to function
        System.exit(0);
    }

    public static void transaction(int shares, double costOfShare) {
        double beforeCommission = (double) shares * costOfShare;//calculates amount paid before commission
        double commission = beforeCommission * .02;//calculates commission
        double totalPaid = beforeCommission + commission;// calculate total paid
        
        DecimalFormat two = new DecimalFormat("0.00"); // Set decimal points to a limit of 2

        JOptionPane.showMessageDialog(null, "The cost of the shares without commission is $" + two.format(beforeCommission));
        // displays amouunt before commission
        JOptionPane.showMessageDialog(null, "The 2 percent commission is $" + two.format(commission)); //displays commission
        JOptionPane.showMessageDialog(null, "The total paid is $" + two.format(totalPaid));//displays total paid

    }
}
