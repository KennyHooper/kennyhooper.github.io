/*Programmer: Kenny Hooper
Project Name: Checks Password
Date: 9/10/16
Version: 1.0;
Description: Ask user for the password and tells them if is correct or not.
 */
public class PasswordB {

    public static void main(String[] args) throws Exception {
        char Value1, Value2, Value3, Value4;//introduces variable to store each char
    System.out.println("Please enter the 4 character password: ");//asks user for password
    Value1 = (char)System.in.read();//sets first char of password
    Value2 = (char)System.in.read();//sets second char of password
    Value3 = (char)System.in.read();//sets third char of password
    Value4 = (char)System.in.read();//sets fourth char of password

        if (Value1 == 'J' && Value2 == 'A' && Value3 == 'V' && Value4 == 'A')//checks if password is correct 
            System.out.println("The password is valid");//prints out if password correct
         else {
            System.out.println("The password is not valid");//prints out if password is incorrect
        }

    }
}
