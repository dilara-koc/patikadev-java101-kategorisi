import java.util.Scanner;
public class VatCalculator {
    public static void main(String[] args) {

        //Değişken tanımlama
        float price, vatRatio, priceWithVat, vat;

        //Kullanıcıdan değer alma
        Scanner input = new Scanner(System.in);
        System.out.print("Alınan para tutarını giriniz: ");
        price = input.nextFloat();

        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18, 1000 TL'den büyükse %8
        vatRatio = (float) (price>0 && price<1000 ? 0.18 : 0.08);
        priceWithVat = price*(1+vatRatio);
        vat = price*vatRatio;

        System.out.println("KDV'siz Fiyat: " +price);
        System.out.println("KDV Oranı: " +vatRatio);
        System.out.println("KDV'li Fiyat: " +priceWithVat);
        System.out.println("KDV Tutarı: " +vat);
    }
}
