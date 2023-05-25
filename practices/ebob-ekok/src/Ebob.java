import java.util.Scanner;
public class Ebob {
    public static void main(String[] args) {
        int number1, number2;
        Scanner input = new Scanner(System.in);
        System.out.print("Number1: ");
        number1 = input.nextInt();

        System.out.print("Number2: ");
        number2 = input.nextInt();

        int ebob = 1;
        int i = number1;
        while (i >= 1){
            i--;
        if ((number1 % i == 0) && (number2 % i == 0)){
                ebob = i;
                break;
            }
        }
        System.out.println("EBOB: " +ebob);

        int ekok = 1;
        int k = 1;
        while (k <= (number1 * number2)){
            k++;
            if ((k % number1 == 0) && (k % number2 == 0)){
                ekok = k;
                System.out.println("EKOK:" +ekok);
                break;
            }
        }
    }
}