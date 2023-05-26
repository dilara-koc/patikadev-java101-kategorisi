import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int element, number1 = 0, number2 = 1, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Number of elements of Fibonacci series: ");
        element = input.nextInt();

        //First 3 elements of Fibonacci are written in this step before the loop
        total = number1 + number2;
        System.out.print(number1 +" " +number2 +" " +total +" ");

        for (int i = 3; i < element; i++){
            number1 = number2;
            number2 = total;
            total = number1 + number2;
            System.out.print(total +" ");
        }
    }
}
