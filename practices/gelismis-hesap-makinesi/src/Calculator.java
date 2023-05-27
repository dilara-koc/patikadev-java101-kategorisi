import java.util.Scanner;

public class Calculator {

    static void plus() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you add? ");
        int counter = input.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextInt();
            result += number;
        }
        System.out.println("Result: " + result);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you use? ");
        int counter = input.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextInt();
            result -= number;
        }
        System.out.println("Result: " + result);
    }

    static void times() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you use? ");
        int counter = input.nextInt();
        int number, result = 1;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextInt();
            result *= number;
        }
        System.out.println("Result: " + result);
    }

    static void division() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you use? ");
        int counter = input.nextInt();
        double number, result = 0.0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextDouble();

            if (i != 1 && number == 0) {
                System.out.println("You cannot use 0 in the denominator.");
            }

            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Result: " + result);
    }

    static void exponent() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the base number? ");
        int base = input.nextInt();
        System.out.print("What is the exponent? ");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Result: " + result);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Factorial: ");
        int number = input.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Result: " + result);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        int number1 = input.nextInt();
        System.out.print("Second number: ");
        int number2 = input.nextInt();
        int result;
        if (number2 == 0) {
            System.out.println("0 cannot be used as second number");
        } else {
            result = number1 % number2;
            System.out.println("Result: " + result);
        }
    }

    static void rectangular() {
        Scanner input = new Scanner(System.in);
        System.out.print("Short edge: ");
        int shortEdge = input.nextInt();
        System.out.print("Long edge: ");
        int longEdge = input.nextInt();
        int area, perimeter;
        area = shortEdge * longEdge;
        perimeter = 2 * (shortEdge + longEdge);
        System.out.println("Area: " + area + "  Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Collection Operation\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division operation\n"
                + "5- Exponent Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Get Mod\n"
                + "8- Rectangular Area and Perimeter Calculation\n"
                + "0- Sign Out";

        System.out.println(menu);

        do {
            System.out.print("Please select the operation: ");
            select = input.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    exponent();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangular();
                    break;
                default:
                    System.out.println("You entered an incorrect value, try again.");
            }
        } while (select != 0);
    }
}
