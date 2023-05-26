import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        number = input.nextInt();

        //If the user enters a number less than 1 to the question "How many numbers will you enter?" give error message
        if (number >= 1){

            ////First number is taken before the loop to compare numbers
            System.out.print("Enter number 1: ");
            int n = input.nextInt();
            int min = n, max = n;

            for (int i = 1; i < number; i++){
                System.out.print("Enter number " +(i+1) +": ");
                n = input.nextInt();

                //Finding min and max number
                if (n < min) {
                    min = n;
                }else if (n > max){
                    max = n;
                }
            }
            System.out.println("Min number: " +min);
            System.out.println("Max number: " +max);
        } else {
            System.out.println("Numbers to be entered cannot be less than 1. Please try again.");
        }
    }
}
