public class Duplicate {

    static boolean isDuplicate(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 2, 4, 6, 6, 56, 3, 56, 99, -22, 7, -22, 5, 56, 99};
        int[] duplicate = new int[array.length]; //This array will store the duplicate values found in the array
        int startIndex = 0; //This variable will keep track of the index at which a duplicate value is stored

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j] && array[i] % 2 == 0) {

                    //isDuplicate method is used if the duplicate value is not already present in the duplicate array
                    if (!isDuplicate(duplicate, array[i])) {
                        duplicate[startIndex++] = array[i];
                    }
                    break; // for example number "56" is repeating 3 times in the array. But since the code has already found a duplicate value for 56 (the second occurrence), it will not consider the third occurrence as a duplicate.
                }
            }
        }

        //Checking each value in the duplicate array, and if it is not equal to 0 (since the default values in the array are 0), printing the value to the console
        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}


