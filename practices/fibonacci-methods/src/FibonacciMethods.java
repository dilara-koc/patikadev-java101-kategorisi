import java.util.Scanner;

public class FibonacciMethods {
    static int f(int n) {
        if (n == 1 || n == 2) {
            return 1; //First two elements of the Fibonacci series are 1.
        } else {
            return f(n - 1) + f(n - 2);
        }
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        number = input.nextInt();

        //"for" loop is used to print all the numbers of the Fibonacci series.
        for (int i = 1; i <= number; i++) {
            System.out.print(f(i) + " ");
        }
    }
}
