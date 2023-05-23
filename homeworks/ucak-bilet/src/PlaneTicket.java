import java.util.Scanner;
public class PlaneTicket {
    public static void main(String[] args) {
        int km, age, tripType;
        double priceKm = 0.10, price;
        Scanner input = new Scanner(System.in);
        System.out.print("The distance of your trip in km: ");
        km = input.nextInt();

        System.out.print("Your age: ");
        age = input.nextInt();

        System.out.println("Please indicate your travel type.\n1-One way\n2-Round Trip");
        tripType = input.nextInt();

        price = priceKm * km;

        if ((km<0 || age<0 || !(tripType<=2 && tripType>=1))){
            System.out.println("You Entered Wrong Data!");
        }else {
            if (age<12){
                if (tripType==1){
                    price = price * 0.5;
                }else {
                    price = (price * 0.5) * 0.8 * 2;
                }
            }else if (age<=24){
                if (tripType==1){
                    price = price * 0.9;
                }else {
                    price = (price * 0.9) * 0.8 * 2;
                }
            }else if (age>65){
                if (tripType==1){
                    price = price * 0.7;
                }else {
                    price = (price * 0.7) * 0.8 * 2;
                }
            }
            System.out.println("Total price: " +price);
        }
    }
}
