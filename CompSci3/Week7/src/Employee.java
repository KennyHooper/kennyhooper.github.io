
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Employee extends Person {

    private double hours;
    private double payRate;

    public Employee() {
        super();
    }

    public Employee(String name1, char sex1, String id1, double hours1, double payRate1) {
        super(name1, sex1, id1);
        hours = hours1;
        payRate = payRate1;
    }
    
    public double getHours()
    {return hours;}
    
    public double getPayRate()
    {return payRate;}
    
    public void setHours(double hours1)
    {hours=hours1;}
    
    public void setPayRate(double payRate1)
    {payRate=payRate1;}
    
    public double calc()
    {double pay=hours*payRate;
    return pay;
    }
    
    public void print() {
        DecimalFormat two = new DecimalFormat("0.00");//Set decimal spaces for Total
        JOptionPane.showMessageDialog(null, "Name: " + name + "\nSex: " + sex + "\nId: " + id+ "\nHours Worked: " + hours
                + "\nPay per hour: $" + two.format(payRate) + "\nTotal Pay: $" + two.format(calc()) );
    }

}
