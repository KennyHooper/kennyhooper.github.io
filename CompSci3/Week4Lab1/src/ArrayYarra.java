/*Programmer: Kenny Hooper
Project Name: Array Replication
Date: 9/17/16
Version: 1.0
Description: Makes an even array then copies it in reverse to another array.
 */

public class ArrayYarra {

    public static void main(String[] args) {
        int forward[] = new int[10];
        int even = 2;
        for (int i = 1; i <= 10; i++) {
            int arrSlot = i - 1;
            forward[arrSlot] = even * i;
        }
        for (int i = 0; i <= 9; i++) {
            System.out.println(forward[i]);
        }

        int reverse[] = new int[10];
        for (int i = 0; i <= 9; i++) {
            int arraySlot = 9 - i;
            reverse[arraySlot] = forward[i];
        }
        System.out.println("Reverse!");
        for (int i = 0; i <= 9; i++) {
            System.out.println(reverse[i]);
        }
    }
}
