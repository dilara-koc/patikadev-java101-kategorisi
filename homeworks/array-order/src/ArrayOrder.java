import java.util.Arrays;
import java.util.Scanner;

public class ArrayOrder {

    //Selection sort method as an alternative of using "Arrays.sort(array);"
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        int n = input.nextInt();
        int[] array = new int[n];

        System.out.println("Dizinin elemanlarını giriniz");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            int k = input.nextInt();
            array[i] = k;
        }

        sort(array);
        System.out.println("Sıralama : " +Arrays.toString(array));

        /* The code below could be used instead of "sort" method between line 7-19.

        Arrays.sort(array);
        System.out.println("Sıralama : " + Arrays.toString(array));
         */
    }
}
