import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {

        //Armstrong Practice 1- Calculating the sum of the digits of a number
        int number, digit = 0, total=0, lastDigit;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        number = inp.nextInt();

        while (number != 0) {
            lastDigit = number % 10;
            total += lastDigit;
            number /= 10;
        }
        System.out.println("Total: " +total);


        /*Armstrong Practice 2- Print all 3 digit Armstrong numbers
        int number, digit = 3;

        for (number=100; number<1000; number++) {
            int tempNumber = number;
            int lastDigit;
            int result = 0;
            while (tempNumber != 0) {
                lastDigit = tempNumber % 10;

                int multiply = 1;
                for (int i = 1; i <= digit; i++) {
                    multiply *= lastDigit;
                }
                result += multiply;
                tempNumber /= 10;
            }

            if (result == number) {
                System.out.print(number + ", ");
            }
        }
        System.out.print("are the 3 digit Armstrong numbers.");

         */



        /* Armstrong Practice 3- Find if the number is an Armstrong number

        int number, digit = 0, lastDigit;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        number = input.nextInt();

        int tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            digit++;
        }

        tempNumber = number;

        int result = 0;
        while (tempNumber != 0) {
            lastDigit = tempNumber % 10;

            int multiply = 1;
            for (int i = 1; i <= digit; i++){
                multiply *= lastDigit;
            }
            result += multiply;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println("The number " +number +" is an Armstrong number.");
        } else {
            System.out.println("The number " +number +" is not an Armstrong number.");
        }

         */
    }
}
