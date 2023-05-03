import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {

        //Değişken tanımlama
        double m, kg, index;

        //Kullanıcıdan değer alma
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        m = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = input.nextDouble();

        //Vücut kitle indeksini yazdırma
        index = kg/(m*m);
        System.out.print("Vücut Kitle İndeksiniz : " +index);
    }
}
