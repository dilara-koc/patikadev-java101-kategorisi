import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {

        //Değişken tanımlama
        double r, pi=3.14, alan, cevre, merkezAci, merkezAciAlan;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap uzunluğunu giriniz: ");
        r = input.nextDouble();

        //Dairenin alanı
        alan = pi*r*r;
        System.out.println("Dairenin alanı :" +alan);

        //Dairenin çevresi
        cevre = 2*pi*r;
        System.out.println("Dairenin çevresi: " +cevre);

        //Yarıçapı r, merkez açısının ölçüsü "merkezAci" olan daire diliminin alanı
        System.out.print("Merkez açı ölçüsünü giriniz: ");
        merkezAci = input.nextDouble();
        merkezAciAlan = (pi*r*r*merkezAci)/360;
        System.out.println("Daire diliminin alanı: " +merkezAciAlan);
    }
}
