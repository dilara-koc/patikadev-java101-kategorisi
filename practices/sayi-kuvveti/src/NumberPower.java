import java.util.Scanner;
public class NumberPower {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        number = input.nextInt();

        //Finding the power of 4 and 5 separately
        for (int i = 1, j = 1; i <= number || j <= number; i *= 4, j *= 5) {
            if ((j > number)){
                System.out.println("Power of 4: " +i);
            }else {
                System.out.println("Power of 4: " +i +"\t\\\tPower of 5: " +j);
            }
        }

        /* Finding power of 2
        for (int i = 1; i <= number; i *= 2) {
            System.out.println(i);
        }
        */
    }
}
