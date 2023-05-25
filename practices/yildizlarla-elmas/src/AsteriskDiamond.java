import java.util.Scanner;
public class AsteriskDiamond {
    public static void main(String[] args) {

        //Making diamond shape from asterisk
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        number = input.nextInt();

        //First half of the diamond (it is a triangle)
        for (int i = 1; i <= number; i++){

            for (int k = 1; k <= (number - i); k++){
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 1; j <= ((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.print("\\");
            System.out.println();
        }

        //Second half of the diamond (it is an inverted triangle)
        for (int i = 1; i <= number; i++){

            for (int l = 1; l <= (i - 1); l++){
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int m = 1; m <= ((2 * (number - i)) + 1); m++){
                System.out.print("*");
            }
            System.out.print("/");
            System.out.println();
        }
    }
}
