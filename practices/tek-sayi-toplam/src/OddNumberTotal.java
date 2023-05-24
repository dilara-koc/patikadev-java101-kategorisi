import java.sql.SQLOutput;
import java.util.Scanner;
public class OddNumberTotal {
    public static void main(String[] args) {
        int number, total = 0;

        /* To find the sum of odd numbers
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the number: ");
            number = input.nextInt();
            if ((number % 2 != 0) && (number >= 0)){
                total +=number;
            }
        } while (number >= 0);
        System.out.println("Total of odd numbers: " +total);
         */

        //Total of even and divisible by 4 numbers
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the number: ");
            number = input.nextInt();
            if (number % 4 == 0) {
                total +=number;
            }
        } while (number % 2 == 0);
        System.out.println("Total of even and divisible by 4 numbers: " +total);
        //
    }
}
