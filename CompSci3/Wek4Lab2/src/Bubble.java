
import javax.swing.JOptionPane;

public class Bubble {

    public static void BubbleSort(int[] num) {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while (flag) {
            flag = false;    //set flag to false awaiting a possible swap
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1]) // change to > for ascending sort
                {
                    temp = num[j];                //swap elements
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;              //shows a swap occurred  
                }
            }
        }
    }

    public static void main(String[] args)  {
        int array[] = new int[10];

        String userNumber;

        userNumber = JOptionPane.showInputDialog("Enter a interger number: ");
        array[0] = Integer.parseInt(userNumber);

        int minVal = array[0];
        int maxVal = array[0];

        for (int i = 1; i < 10; i++) {

            userNumber = JOptionPane.showInputDialog("Enter a interger number: ");
            array[i] = Integer.parseInt(userNumber);

            if (array[i] < minVal) {
                minVal = array[i];
            }

            if (array[i] > maxVal) {
                maxVal = array[i];
            }
        }

        BubbleSort(array);

        for (int i = 0; i < 10; i++) {

            System.out.println((i + 1) + ". " + array[i] + " ");

        }
System.out.println("Max value: " + maxVal);
System.out.println("Min value: " + minVal);
    }
}
