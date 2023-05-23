import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        //Değişken tanımlama
        int year;

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        year = input.nextInt();

        //Artık yıl hesaplama
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year +" bir artık yıldır!");
        } else {
            System.out.println(year +" bir artık yıl değildir!");
        }
    }
}
