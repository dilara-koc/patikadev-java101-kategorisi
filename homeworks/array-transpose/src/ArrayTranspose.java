import java.util.Scanner;

public class ArrayTranspose {
    public static void main(String[] args) {

        //Take the elements of the matrix from the user
        int[][] matrix = new int[2][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Matrix: ");
        for (int k = 0; k < matrix.length; k++) {
            for (int l = 0; l < matrix[k].length; l++) {
                matrix[k][l] = input.nextInt();
            }
        }

        //Transpose of the matrix
        int[][] transpose = new int[3][2];
        for (int row = 0; row < matrix.length; row++) {
            int temp = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                temp = matrix[row][column];
                transpose[column][row] = temp;
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