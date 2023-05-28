import java.util.Scanner;

public class RecursivePattern {
    static void recursive(int n) {

        if (n <= 0) {
            System.out.print(n + " ");
            return; //It returns from the method, exiting the current instance of the method
        }

        System.out.print(n + " ");
        recursive(n - 5); //recursive call
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        recursive(number);
    }
}
