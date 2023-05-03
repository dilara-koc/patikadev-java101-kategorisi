import java.util.Scanner;
public class AverageGrade {
    public static void main(String[] args) {

    //Değişken tanımlama
    int ma, p , c , t, h, mu;

    //Kullanıcıdan değerleri alma
    Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz: ");
        ma = input.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        p = input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        c = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        t = input.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        h = input.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        mu = input.nextInt();

        //Ortalama hesaplama
        double toplam = (ma+p+c+t+h+mu);
        double sonuc = toplam/6;
        System.out.println("Not Ortalamanız :" + sonuc);
        System.out.println(sonuc>60 ? "Sınıfı Geçti":"Sınıfta Kaldı");
    }
}
