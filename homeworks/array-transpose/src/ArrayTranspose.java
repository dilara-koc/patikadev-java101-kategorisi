import java.util.Scanner;

public class ArrayTranspose {
    public static void main(String[] args) {

        int[][] matrix = new int[2][3];
        int[][] transpose = new int[3][2];

        Scanner input = new Scanner(System.in);
        System.out.println("Matrix: ");

        for (int k = 0; k < matrix.length; k++) {
            int temp = 0;
            for (int l = 0; l < matrix[k].length; l++) {
                matrix[k][l] = input.nextInt(); //Take the elements of the matrix from the user
                temp = matrix[k][l];
                transpose[l][k] = temp; //Transpose of the matrix
            }
        }

        //Print transpose of the matrix
        System.out.println("Transpose: ");
        for (int[] i : transpose) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}