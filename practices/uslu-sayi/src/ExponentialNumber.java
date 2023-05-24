import java.util.Scanner;
public class ExponentialNumber {
    public static void main(String[] args) {
        int number, exp, result=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        number = input.nextInt();

        System.out.print("Please enter exponential: ");
        exp = input.nextInt();

        for (int i = 1; i<=exp ; i++) {
            result *= number;
        }
        System.out.println("Result of the exponentiation: " +result);
    }
}
