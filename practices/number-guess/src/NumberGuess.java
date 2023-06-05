import java.util.Scanner;
import java.util.Arrays;

public class NumberGuess {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);

        int right = 0;
        int select;
        int[] wrong = new int[5]; //array is to print all guessed numbers
        boolean isWin = false;
        boolean isWrong=false;

        while (right < 5) {
            System.out.print("Please enter your guess number: ");
            select = input.nextInt();

            if (select > 0 && select < 100) {
                if (select == number) {
                    isWin = true;
                    wrong[right++] = select;
                    break;
                } else if (select < number) {
                    System.out.println("The number you entered (" + select + ") is less than secret number");
                } else {
                    System.out.println("The number you entered (" + select + ") is greater than secret number");
                }
                wrong[right++] = select;
            } else {
                System.out.println("The value you enter must be between 0-100.");
                if (!isWrong){
                    System.out.println("The next time you enter a value outside the range of 0-100, you will lose right");
                    isWrong=true;
                } else {
                    wrong[right++] = select;
                }
            }
            System.out.println("Remaining right: " + (5 - right));
            System.out.println("------------------");
        }

        if (isWin) {
            System.out.println("Congratulations! You won the game.");
        } else {
            System.out.println("Game over :( ");
            System.out.println("The secret number was: " + number);
        }
        System.out.println("The numbers you guessed: " + Arrays.toString(wrong));
    }
}
