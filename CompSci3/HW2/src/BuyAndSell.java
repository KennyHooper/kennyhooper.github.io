/*Programmer: Kenny Hooper
Project Name: Sotck profits
Date: 9/9/16
Version: 1.0
Description: Takes a number of stocks, the price of the stocks before and after selling them and detrimines if there was a profit
or loss
 */

import javax.swing.JOptionPane; // to use dialog windows
import java.text.DecimalFormat; // Allows number of decimal spaces to be set

public class BuyAndSell {

    public static void main(String[] args) {

        int userShares = 1000; // number of shares bought
        double userCostOfShareBefore = 32.87; // cost of each share before he bought them
        double userCostOfShareAfter = 33.92; // cost of each share after he sold them
        transaction(userShares, userCostOfShareBefore, userCostOfShareAfter);
        // passes shares and thier cost to function to calculate and display results
        System.exit(0);
    }

    public static void display(double paid, double commish1, double paidWithCommish1, double commish2, double netProfit) {

        DecimalFormat two = new DecimalFormat("0.00"); // Set decimal points to a limit of 2

        JOptionPane.showMessageDialog(null, "The cost of the shares bought without commission is $" + two.format(paid));
        // displays amouunt before commission
        JOptionPane.showMessageDialog(null, "The 2 percent commission for buying the stocks is $" + two.format(commish1));
        //displays commission
        JOptionPane.showMessageDialog(null, "The total paid is $" + two.format(paidWithCommish1));//displays total paid

        JOptionPane.showMessageDialog(null, "The 2 percent commission  for selling the stocks is $" + two.format(commish2));
        //displays commission
        JOptionPane.showMessageDialog(null, "The net profit or loss is $" + two.format(netProfit));//displays net profit
    }

    public static void transaction(int shares, double costOfShare1, double costOfShare2) {
        double beforeCommissionBuying = (double) shares * costOfShare1;//calculates amount paid before commission
        double commissionBuying = beforeCommissionBuying * .02;//calculates commission
        double totalPaidBuying = beforeCommissionBuying + commissionBuying;// calculate total paid

        double beforeCommissionSelling = (double) shares * costOfShare2;//calculates amount received before commission deducted
        double commissionSelling = beforeCommissionSelling * .02;//calculates commission
        double totalReceivedSelling = beforeCommissionSelling - commissionSelling;// calculate total received

        double profitOrLoss = totalReceivedSelling - totalPaidBuying;//calculates gain or loss
        display(beforeCommissionBuying, commissionBuying, totalPaidBuying, commissionSelling, profitOrLoss);
        //method to display calculations

    }
}
