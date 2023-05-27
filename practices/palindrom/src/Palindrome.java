import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastDigit;
        while (temp != 0) {
            lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp /= 10;
        }

        if (number == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        n = input.nextInt();
        System.out.println(isPalindrome(n));
    }
}
