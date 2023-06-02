import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();

        int minGreater = Integer.MAX_VALUE;
        int maxSmaller = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > number && i < minGreater) {
                minGreater = i;
            } else if (i < number && i > maxSmaller) {
                maxSmaller = i;
            }
        }

        if (minGreater != Integer.MAX_VALUE) {
            System.out.println("The nearest number greater than the entered number: " + minGreater);
        } else {
            System.out.println("Entered number is the greatest number in the array");
        }

        if (maxSmaller != Integer.MIN_VALUE) {
            System.out.println("The nearest number smaller than the entered number: " + maxSmaller);
        } else {
            System.out.println("Entered number is the smallest value in the array");
        }
    }
}
