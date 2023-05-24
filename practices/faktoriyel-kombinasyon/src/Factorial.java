import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        //Combination
        int n, r, factN=1, factR=1, fact=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the setSize(n): ");
        n = input.nextInt();

        System.out.print("Please enter the subsetSize(r): ");
        r = input.nextInt();

        //Factorial of setSize (n):
        for (int i = 1; i <= n; i++ ){
            factN *=i;
        }

        //Factorial of subsetSize (r):
        for (int i = 1; i <= r; i++ ){
            factR *=i;
        }

        //Factorial of (n - r):
        for (int i = 1; i <= (n - r); i++ ){
            fact *=i;
        }

        // Combination: C(n, r) = n! / ((n - r)! * r!)
        System.out.println("Combination: " +(factN / (fact * factR)));
    }
}
