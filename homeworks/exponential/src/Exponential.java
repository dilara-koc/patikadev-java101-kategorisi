import java.util.Scanner;

public class Exponential {
    static int exponential(int base, int power) {
        if (power != 0) {
            return base * exponential(base, power - 1); //recursive call
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;

        do {
            System.out.print("Please enter base value (or 'stop' to exit): ");
            userInput = input.nextLine();

            if (!userInput.equals("stop")) {
                int base = Integer.parseInt(userInput); //Convert String value to integer value
                System.out.print("Please enter exponent: ");
                int power = input.nextInt();

                input.nextLine(); // Consume the newline character

                System.out.println(exponential(base, power));
            }
        } while (!userInput.equals("stop"));
    }
}

