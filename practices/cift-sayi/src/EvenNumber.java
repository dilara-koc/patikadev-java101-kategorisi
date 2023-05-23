import java.util.Scanner;
public class EvenNumber {
    public static void main(String[] args) {

        //Değer tanımlama
        int k, number=0, total=0;

        //Kullanıcıdan değer alma
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k = input.nextInt();

         /* 0'dan girilen sayıya kadar olan çift sayıları bulan program:
            for(int i=0;i<k;i+=2){
                System.out.print(i+",");
            }
         */

        //0'dan girilen sayıya kadar 3 ve 4'e tam bölünenlerin ortalamasının hesaplanması (0 dahil):
        for (int i=0; i<=k; i+=12) {
            if (i%12 ==0){
                number+=1;
                total+=i;
            }
        }
        System.out.println("Ortalama: " +total/number);
    }
}
