import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Please enter row: ");
        int x = input.nextInt();
        System.out.print("Please enter column: ");
        int y = input.nextInt();

        MineSweeper mine =new MineSweeper(x,y);
        mine.run();
    }
}
