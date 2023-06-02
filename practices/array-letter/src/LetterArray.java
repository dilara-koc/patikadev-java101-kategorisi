public class LetterArray {
    public static void main(String[] args) {
        String[][] matrix = new String[9][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || i == 3 || i == 5 || i == 8) {
                    matrix[i][j] = "****";
                } else if ((i == 1 || i == 2 || i == 6 || i == 7) && (j == 0 || j == 2)) {
                    matrix[i][j] = "****";
                } else if (i == 4 && (j == 0 || j == 1)) {
                    matrix[i][j] = "****";
                } else {
                    matrix[i][j] = "    ";
                }
            }
        }

        for (String[] row : matrix) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
