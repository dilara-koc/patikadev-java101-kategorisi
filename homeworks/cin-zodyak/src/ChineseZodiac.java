import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        //Değişken tanımlama
        int dogumYili, kalan;
        String burc = "";
        boolean isError = false;

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        dogumYili = input.nextInt();
        kalan = dogumYili % 12;

        //Çin zodyağı hesaplama
        switch (kalan) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:
                isError = true;
                System.out.println("Doğum yılı değerinizi kontrol ederek tekrar deneyiniz.");
        }
        if (!isError){
            System.out.println("Çin zodayınız: " +burc);
        }

    }
}
