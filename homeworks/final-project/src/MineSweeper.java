import java.util.Scanner;

public class MineSweeper {
    int row;
    int column;
    int mineNumber;
    int remainingCells;
    String[][] matrix;
    String[][] matrixGamer;
    Scanner inp;

    public MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.mineNumber = (row * column) / 4;
        this.remainingCells = row * column;
        this.matrix = new String[row][column];
        this.matrixGamer = new String[row][column];
        this.inp = new Scanner(System.in);
    }

    public void run() {
        generateMines();
        System.out.println("Location of Mines");
        printMatrix(matrix);

        System.out.println("======================");
        System.out.println("Welcome to Minesweeper Game !");
        printMatrix(matrixGamer);

        int a, b;

        do {
            System.out.print("Enter row: ");
            a = inp.nextInt();
            System.out.print("Enter column: ");
            b = inp.nextInt();

            if (matrix[a][b] != null) {
                System.out.println("Game over !");
                break;
            }

            revealCell(a, b);
            remainingCells--;

            if (remainingCells - mineNumber == 0) {
                System.out.println("You won the game! ");
                break;
            }
        } while (true);
    }

    //To update matrix which is game board each time the gamer enters row and column
    public void revealCell(int a, int b) {
        System.out.println("======================");

        for (int i = 0; i < matrixGamer.length; i++) {
            for (int j = 0; j < matrixGamer[i].length; j++) {
                String cellFill;
                int countMines = countAdjacentMines(i, j); //using countAdjacentMines() to write the number of mines in adjacent cells

                if (a == i && b == j) {
                    cellFill = Integer.toString(countMines);
                } else {
                    cellFill = matrixGamer[i][j] != null ? matrixGamer[i][j] : "-";
                }
                System.out.print(cellFill + " ");
                matrixGamer[i][j] = cellFill;
            }
            System.out.println();
        }
    }

    //Calculating the number of adjacent mines for a given cell
    public int countAdjacentMines(int a, int b) {
        int countMines = 0;

        for (int i = Math.max(0, a - 1); i <= Math.min(row - 1, a + 1); i++) {
            for (int j = Math.max(0, b - 1); j <= Math.min(column - 1, b + 1); j++) {
                if (matrix[i][j] != null && !(i == a && j == b)) {
                    countMines++;
                }
            }
        }
        return countMines;
    }

    //To print matrix and matrixGamer separately and reduce code duplication printMatrix() method
    public void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String cell : row) {
                System.out.print(cell != null ? cell : "- ");
            }
            System.out.println();
        }
    }

    //Random number generation and putting "* " in the matrix for those numbers
    public void generateMines() {
        int rn = 0;
        while (rn < mineNumber) {
            int randomNumber = (int) (Math.random() * (this.row * this.column));
            int row1 = randomNumber / this.column;
            int column1 = randomNumber % this.column;

            if (matrix[row1][column1] == null) {
                matrix[row1][column1] = "* ";
                rn++;
            }
        }
    }
}
