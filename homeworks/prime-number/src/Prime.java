import java.util.Scanner;

public class Prime {
    static boolean isPrime(int number, int i) {
        if (number == 2) {
            return true;
        }
        if (number < 2) {
            return false;
        }
        if (number % i == 0) {
            return false;
        }

        /*
         The code block below checks if the square of the current divisor "i" is greater than the number "n". If it is,
         it means that no smaller divisor will divide "n" evenly, so the method returns true, indicating that "n" is
         prime.

         Let's assume 'n' is 16. The square root of 16 is 4. If we iterate from 2 to 3, we find that 16 is divisible
         by 2, which means it's not a prime number. We don't need to check any numbers larger than the square root of
         16 because there will be a corresponding divisor smaller than the square root.
        */

        if (i * i > number) {
            return true;
        }
        return isPrime(number, i + 1); //recursive call
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        n = input.nextInt();

        if (isPrime(n, 2))
            System.out.println("Yes it's a Prime");
        else
            System.out.println("Not a Prime");
    }
}
