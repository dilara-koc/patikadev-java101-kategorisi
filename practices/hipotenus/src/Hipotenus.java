import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
    //Dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan program:
        //Değişken tanımlama
        int a,b;
        double c;

        //Kullanıcıdan veri alma
        Scanner input= new Scanner(System.in);
        System.out.print("Üçgenin dik kenarlarından \"a\'nın uzunluğunu giriniz: ");
        a = input.nextInt();
        System.out.print("Üçgenin dik kenarlarından \"b\'nın uzunluğunu giriniz: ");
        b = input.nextInt();

        //Hipotenüs uzunluğu hesaplama
        c = Math.sqrt((a*a)+(b*b)) ;
        System.out.println("Hipotenüs uzunluğu: " +c);


    //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan program:
        //Değişken tanımlama
        int d,e,f;

        //Kullanıcıdan veri alma
        Scanner inp= new Scanner(System.in);
        System.out.print("Üçgenin 1. kenar uzunluğunu giriniz: ");
        d = inp.nextInt();
        System.out.print("Üçgenin 2. kenar uzunluğunu giriniz: ");
        e = inp.nextInt();
        System.out.print("Üçgenin 3. kenar uzunluğunu giriniz: ");
        f = inp.nextInt();

        //Alan hesaplama
        double u = (e+d+f)/2;
        double alan = Math.sqrt(u*(u-d)*(u-e)*(u-f));
        System.out.println("Üçgenin alanı: " +alan);
    }
}
