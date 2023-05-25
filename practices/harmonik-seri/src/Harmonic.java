import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        number = input.nextInt();

        float result = 0;
        for (float i = 1; i <= number; i++){
            result += (1 / i);
        }
        System.out.println("Harmonic number: " +result);
    }
}
