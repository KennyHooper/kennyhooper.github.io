/*Programmer: Kenny Hooper
Project Name: Display Password
Date: 9/10/16
Version: 1.0;
Description: Ask user for a 4 character password and outputs on the screen
 */
public class PasswordA {
    public static void main(String [] args) throws Exception
    {char Value1, Value2, Value3, Value4;//introduces variable to store each char
    System.out.println("Please enter a 4 character password: ");//ask user for password
    Value1 = (char)System.in.read();//sets first char of password
    Value2 = (char)System.in.read();//sets second char of password
    Value3 = (char)System.in.read();//sets third char of password
    Value4 = (char)System.in.read();//sets fourth char of password
    
    System.out.println("You entered " + Value1 + Value2 + Value3 + Value4); // outputs password entered
    
    }
}
