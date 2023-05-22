import java.util.Scanner;
public class SignIn {
    public static void main(String[] args) {
        //Sayfaya kayıt yaptırma
        String userName, password, userName1, password1, userName2;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        System.out.println("Tebrikler, sayfaya kaydınız başarıyla tamamlandı!");

        //Sayfaya yeniden girildiğinde bilgileri kontrol etme
        System.out.print("Sisteme yeniden giriş yapmak için\nKullanıcı adınızı giriniz: ");
        userName1 = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password1 = input.nextLine();

        if (userName1.equals(userName) && password1.equals(password)) {
            System.out.println("Başarıyla giriş yaptınız.");
        }

        //Yanlış şifre girildiyse yeni şifre oluşturma
        else if (!(password1.equals(password))) {
            System.out.print("Şifre yanlış. Şifrenizi sıfırlamak ister misiniz?\n1-Evet\n2-Hayır\nSeçiminizi giriniz: ");
            select = input.nextInt();
            switch (select) {
                case 1 -> {
                    Scanner inp = new Scanner(System.in);
                    System.out.print("Yeni şifrenizi giriniz: ");
                    userName2 = inp.nextLine();
                    if (userName2.equals(userName) || userName2.equals(userName1)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu");
                    }
                }
                case 2 -> System.out.println("Hatalı şifre girdiniz. Lütfen tekrar deneyin.");
            }
        }
        else {
            System.out.println("Kullanıcı adı yanlıştır. Lütfen bilgilerinizi kontrol edip tekrar deneyiniz.");
        }
    }
}
