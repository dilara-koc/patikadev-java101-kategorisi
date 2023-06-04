import java.util.Arrays;

public class ArrayCount {

    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20, 40};
        Arrays.sort(array);
        System.out.println("Array : " + Arrays.toString(array));
        System.out.println("Repeating Numbers");


        for (int i = 0; i < array.length; i++) {
            int repeat = 0;
            for (int k : array) {
                if (array[i] == k) {
                    repeat += 1;
                }
            }
            if ((i != array.length - 1 && array[i] != array[i + 1]) || (i == array.length - 1 && array[i] != array[i - 1])) {
                System.out.println("Number "+array[i] + " repeated " + repeat + " times");
            }
        }
    }
}
