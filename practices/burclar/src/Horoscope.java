import java.util.Scanner;
public class Horoscope {
    public static void main(String[] args) {
        int month, day;
        String sign ="";
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.print("The month you were born: ");
        month = input.nextInt();

        System.out.print("The day you were born: ");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 21) {
                sign = "Capricorn";
            } else if (day > 21 && day <= 31) {
                sign = "Aquarius";
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 19) {
                sign = "Aquarius";
            } else if (day > 19 && day <= 28) {
                sign = "Pisces";
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 20) {
                sign = "Pisces";
            } else if (day > 20 && day <= 31) {
                sign = "Aries";
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 20) {
                sign = "Aries";
            } else if (day > 20 && day <= 30) {
                sign = "Taurus";
            } else {
                isError = true;
            }
        } else if (month ==5) {
            if (day >= 1 && day <= 21) {
                sign = "Taurus";
            } else if (day > 21 && day <= 31) {
                sign = "Gemini";
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 22) {
                sign = "Gemini";
            } else if (day > 22 && day <= 30) {
                sign = "Cancer";
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 22) {
                sign = "Cancer";
            } else if (day > 22 && day <= 31) {
                sign = "Leo";
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 22) {
                sign = "Leo";
            } else if (day > 22 && day <= 31) {
                sign = "Virgo";
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 22) {
                sign = "Virgo";
            } else if (day > 22 && day <= 30) {
                sign = "Libra";
            } else {
                isError = true;
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 22) {
                sign = "Libra";
            } else if (day > 22 && day <= 31) {
                sign = "Scorpio";
            } else {
                isError = true;
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 21) {
                sign = "Scorpio";
            } else if (day > 21 && day <= 30) {
                sign = "Sagittarius";
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 21) {
                sign = "Sagittarius";
            } else if (day > 21 && day <= 31) {
                sign = "Capricorn";
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Incorrect month or day has entered. Please try again.");
        } else {
            System.out.println("Your horoscope: " +sign);
        }
    }
}
