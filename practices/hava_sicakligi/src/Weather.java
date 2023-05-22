import java.util.Scanner;
public class Weather {
    public static void main(String[] args) {

        //Calling data from the user
        int celsius;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the weather in celsius: ");
        celsius = input.nextInt();

        //Recommending activities depending on the weather
        if (celsius<5) {
            System.out.println("You can go skiing.");
        } else if (celsius>=5 && celsius<=15){
            System.out.println("You can go to the cinema.");
            if (celsius==15){
                System.out.println("Or you can go on a picnic.");
            }
        } else if (celsius>15 && celsius<=25){
            System.out.println("You can go on a picnic.");
        } else{
            System.out.println("You can go swimming.");
        }
    }
}
