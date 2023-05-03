import java.util.Scanner;
public class Taximeter {
    public static void main(String[] args) {
        //Değişken tanımlama
        double km, ucret;

        //Kullanıcıdan değer alma
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen km\'yi giriniz: ");
        km = input.nextDouble();

        //Taksimetre hesaplama
        ucret = (10+2.20*km)>20 ? 10+2.20*km : 20;
        System.out.println("Ödenecek ücret: " +ucret +"TL");
    }
}
