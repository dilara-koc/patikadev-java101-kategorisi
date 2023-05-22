import  java.util.Scanner;
public class PassingGrade {
    public static void main(String[] args) {

        //Kullanıcıdan derslerden aldığı notları isteme
        int mat, fizik, turkce, kimya, muzik, mat1, fizik1, turkce1, kimya1, muzik1, lecNumber;
        lecNumber = 5;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik ders notunuzu giriniz: ");
        mat = input.nextInt();
        if (mat>=0 && mat<=100) {
            mat1 = mat;
        }else {
            mat1=0;
            lecNumber = (lecNumber-1);
        }

        System.out.print("Fizik ders notunuzu giriniz: ");
        fizik = input.nextInt();
        if (fizik>=0 && fizik<=100) {
            fizik1 = fizik;
        }else {
            fizik1=0;
            lecNumber = (lecNumber-1);
        }

        System.out.print("Türkçe ders notunuzu giriniz: ");
        turkce = input.nextInt();
        if (turkce>=0 && turkce<=100) {
            turkce1 = turkce;
        }else {
            turkce1=0;
            lecNumber = (lecNumber-1);
        }

        System.out.print("Kimya ders notunuzu giriniz: ");
        kimya = input.nextInt();
        if (kimya>=0 && kimya<=100) {
            kimya1 = kimya;
        }else {
            kimya1=0;
            lecNumber = (lecNumber-1);
        }

        System.out.print("Müzik ders notunuzu giriniz: ");
        muzik = input.nextInt();
        if (muzik>=0 && muzik<=100) {
            muzik1 = muzik;
        }else {
            muzik1=0;
            lecNumber = (lecNumber-1);
        }

        //Ortalama ders notu hesaplama
        if (lecNumber==0){
            System.out.println("Hiçbir ders notunuz 0 ile 100 aralığında değildir.");
        }else {
            double average = (mat1 + fizik1 + turkce1 + kimya1 + muzik1) / lecNumber;
            if (average <= 55) {
                System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
            } else {
                System.out.println("Tebrikler, sınıfı geçtiniz!");
            }
            System.out.println("Ortalamanız: " +average);
        }
    }
}
