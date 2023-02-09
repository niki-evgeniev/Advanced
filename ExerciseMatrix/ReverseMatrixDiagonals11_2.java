package ExerciseMatrix;

import java.util.Scanner;

public class ReverseMatrixDiagonals11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            String[] readMatrix = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(readMatrix[col]);
            }
        }

        int rowsToUse = rows - 1;
        int colsToUse = cols - 1;
        while (rowsToUse != -1 ) {
            int row = rowsToUse;
            int col = colsToUse;
            while (col < cols && row >= 0 ) {
                System.out.print(matrix[row][col] + " ");
                row--;
                col++;
            }
            System.out.println();
            colsToUse--;
            if (colsToUse == -1) {
                colsToUse = 0;
                rowsToUse--;
            }
        }
    }
}
